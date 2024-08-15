package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.Views.EditTextOutline;
import org.telegram.ui.Components.RLottieDrawable;
public class WebmEncoder {
    private static native long createEncoder(String str, int i, int i2, int i3, long j);

    public static native void stop(long j);

    private static native boolean writeFrame(long j, ByteBuffer byteBuffer, int i, int i2);

    public static boolean convert(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.WebmEncoder.convert(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, int):boolean");
    }

    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = new ArrayList<>();
            this.mediaEntities = arrayList;
            this.clearPaint = new Paint(1);
            this.bitmapPaint = new Paint(5);
            int i = convertVideoParams.resultWidth;
            this.W = i;
            int i2 = convertVideoParams.resultHeight;
            this.H = i2;
            this.fps = convertVideoParams.framerate;
            Path path = new Path();
            this.clipPath = path;
            path.addRoundRect(new RectF(0.0f, 0.0f, i, i2), i * 0.125f, i2 * 0.125f, Path.Direction.CW);
            this.photo = BitmapFactory.decodeFile(convertVideoParams.videoPath);
            arrayList.addAll(convertVideoParams.mediaEntities);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i3);
                byte b = mediaEntity.type;
                if (b == 0 || b == 2 || b == 5) {
                    initStickerEntity(mediaEntity);
                } else if (b == 1) {
                    initTextEntity(mediaEntity);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        public void draw(Canvas canvas, int i) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j = i * (1000000000 / this.fps);
            int size = this.mediaEntities.size();
            for (int i2 = 0; i2 < size; i2++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i2);
                drawEntity(canvas, mediaEntity, mediaEntity.color, j);
            }
            canvas.restore();
        }

        private void drawEntity(Canvas canvas, VideoEditedInfo.MediaEntity mediaEntity, int i, long j) {
            VideoEditedInfo.MediaEntity mediaEntity2;
            int i2;
            int i3;
            long j2 = mediaEntity.ptr;
            if (j2 != 0) {
                Bitmap bitmap = mediaEntity.bitmap;
                if (bitmap == null || (i2 = mediaEntity.W) <= 0 || (i3 = mediaEntity.H) <= 0) {
                    return;
                }
                RLottieDrawable.getFrame(j2, (int) mediaEntity.currentFrame, bitmap, i2, i3, bitmap.getRowBytes(), true);
                Bitmap bitmap2 = mediaEntity.bitmap;
                if ((mediaEntity.subType & 8) == 0) {
                    i = 0;
                }
                applyRoundRadius(mediaEntity, bitmap2, i);
                canvas.drawBitmap(mediaEntity.bitmap, mediaEntity.matrix, this.bitmapPaint);
                float f = mediaEntity.currentFrame + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f;
                if (f >= mediaEntity.metadata[0]) {
                    mediaEntity.currentFrame = 0.0f;
                }
            } else if (mediaEntity.animatedFileDrawable != null) {
                float f2 = mediaEntity.currentFrame;
                int i4 = (int) f2;
                float f3 = f2 + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f3;
                for (int i5 = (int) f3; i4 != i5; i5--) {
                    mediaEntity.animatedFileDrawable.getNextFrame(true);
                }
                Bitmap backgroundBitmap = mediaEntity.animatedFileDrawable.getBackgroundBitmap();
                if (backgroundBitmap != null) {
                    canvas.drawBitmap(backgroundBitmap, mediaEntity.matrix, this.bitmapPaint);
                }
            } else {
                canvas.drawBitmap(mediaEntity.bitmap, mediaEntity.matrix, this.bitmapPaint);
                ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
                if (arrayList == null || arrayList.isEmpty()) {
                    return;
                }
                for (int i6 = 0; i6 < mediaEntity.entities.size(); i6++) {
                    VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i6);
                    if (emojiEntity != null && (mediaEntity2 = emojiEntity.entity) != null) {
                        drawEntity(canvas, mediaEntity2, mediaEntity.color, j);
                    }
                }
            }
        }

        private void initTextEntity(final VideoEditedInfo.MediaEntity mediaEntity) {
            int i;
            Emoji.EmojiSpan[] emojiSpanArr;
            Typeface typeface;
            final EditTextOutline editTextOutline = new EditTextOutline(ApplicationLoader.applicationContext);
            editTextOutline.getPaint().setAntiAlias(true);
            editTextOutline.drawAnimatedEmojiDrawables = false;
            editTextOutline.setBackgroundColor(0);
            editTextOutline.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            PaintTypeface paintTypeface = mediaEntity.textTypeface;
            if (paintTypeface != null && (typeface = paintTypeface.getTypeface()) != null) {
                editTextOutline.setTypeface(typeface);
            }
            editTextOutline.setTextSize(0, mediaEntity.fontSize);
            SpannableString spannableString = new SpannableString(mediaEntity.text);
            Iterator<VideoEditedInfo.EmojiEntity> it = mediaEntity.entities.iterator();
            while (it.hasNext()) {
                final VideoEditedInfo.EmojiEntity next = it.next();
                if (next.documentAbsolutePath != null) {
                    VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                    next.entity = mediaEntity2;
                    mediaEntity2.text = next.documentAbsolutePath;
                    mediaEntity2.subType = next.subType;
                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(0L, 1.0f, editTextOutline.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                            super.draw(canvas, charSequence, i2, i3, f, i4, i5, i6, paint);
                            VideoEditedInfo.MediaEntity mediaEntity3 = mediaEntity;
                            float paddingLeft = mediaEntity.x + ((((editTextOutline.getPaddingLeft() + f) + (this.measuredSize / 2.0f)) / mediaEntity3.viewWidth) * mediaEntity3.width);
                            float f2 = mediaEntity3.y;
                            VideoEditedInfo.MediaEntity mediaEntity4 = mediaEntity;
                            float f3 = mediaEntity4.height;
                            float paddingTop = f2 + ((((editTextOutline.getPaddingTop() + i4) + ((i6 - i4) / 2.0f)) / mediaEntity4.viewHeight) * f3);
                            if (mediaEntity4.rotation != 0.0f) {
                                float f4 = mediaEntity4.x + (mediaEntity4.width / 2.0f);
                                float f5 = mediaEntity4.y + (f3 / 2.0f);
                                float f6 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d = paddingLeft - f4;
                                double cos = Math.cos(-mediaEntity.rotation);
                                Double.isNaN(d);
                                double d2 = (paddingTop - f5) / f6;
                                double sin = Math.sin(-mediaEntity.rotation);
                                Double.isNaN(d2);
                                float f7 = f4 + ((float) ((cos * d) - (sin * d2)));
                                double sin2 = Math.sin(-mediaEntity.rotation);
                                Double.isNaN(d);
                                double d3 = d * sin2;
                                double cos2 = Math.cos(-mediaEntity.rotation);
                                Double.isNaN(d2);
                                paddingTop = (((float) (d3 + (d2 * cos2))) * f6) + f5;
                                paddingLeft = f7;
                            }
                            VideoEditedInfo.MediaEntity mediaEntity5 = next.entity;
                            int i7 = this.measuredSize;
                            VideoEditedInfo.MediaEntity mediaEntity6 = mediaEntity;
                            float f8 = (i7 / mediaEntity6.viewWidth) * mediaEntity6.width;
                            mediaEntity5.width = f8;
                            float f9 = (i7 / mediaEntity6.viewHeight) * mediaEntity6.height;
                            mediaEntity5.height = f9;
                            mediaEntity5.x = paddingLeft - (f8 / 2.0f);
                            mediaEntity5.y = paddingTop - (f9 / 2.0f);
                            mediaEntity5.rotation = mediaEntity6.rotation;
                            if (mediaEntity5.bitmap == null) {
                                FrameDrawer.this.initStickerEntity(mediaEntity5);
                            }
                        }
                    };
                    int i2 = next.offset;
                    spannableString.setSpan(animatedEmojiSpan, i2, next.length + i2, 33);
                }
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) spannableString, editTextOutline.getPaint().getFontMetricsInt(), (int) (editTextOutline.getTextSize() * 0.8f), false);
            if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                    emojiSpan.scale = 0.85f;
                }
            }
            editTextOutline.setText(replaceEmoji);
            editTextOutline.setTextColor(mediaEntity.color);
            int i3 = mediaEntity.textAlign;
            editTextOutline.setGravity(i3 != 1 ? i3 != 2 ? 19 : 21 : 17);
            int i4 = Build.VERSION.SDK_INT;
            int i5 = mediaEntity.textAlign;
            if (i5 != 1) {
                i = (i5 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) ? 3 : 2;
            } else {
                i = 4;
            }
            editTextOutline.setTextAlignment(i);
            editTextOutline.setHorizontallyScrolling(false);
            editTextOutline.setImeOptions(268435456);
            editTextOutline.setFocusableInTouchMode(true);
            editTextOutline.setInputType(editTextOutline.getInputType() | 16384);
            if (i4 >= 23) {
                setBreakStrategy(editTextOutline);
            }
            byte b = mediaEntity.subType;
            if (b == 0) {
                editTextOutline.setFrameColor(mediaEntity.color);
                editTextOutline.setTextColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) < 0.721f ? -1 : -16777216);
            } else if (b == 1) {
                editTextOutline.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -1728053248 : -1711276033);
                editTextOutline.setTextColor(mediaEntity.color);
            } else if (b == 2) {
                editTextOutline.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) < 0.25f ? -1 : -16777216);
                editTextOutline.setTextColor(mediaEntity.color);
            } else if (b == 3) {
                editTextOutline.setFrameColor(0);
                editTextOutline.setTextColor(mediaEntity.color);
            }
            editTextOutline.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, 1073741824));
            editTextOutline.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
            mediaEntity.bitmap = Bitmap.createBitmap(mediaEntity.viewWidth, mediaEntity.viewHeight, Bitmap.Config.ARGB_8888);
            editTextOutline.draw(new Canvas(mediaEntity.bitmap));
            setupMatrix(mediaEntity);
        }

        public void setBreakStrategy(EditTextOutline editTextOutline) {
            editTextOutline.setBreakStrategy(0);
        }

        public void initStickerEntity(VideoEditedInfo.MediaEntity mediaEntity) {
            AnimatedFileDrawable animatedFileDrawable;
            int i;
            int i2 = (int) (mediaEntity.width * this.W);
            mediaEntity.W = i2;
            int i3 = (int) (mediaEntity.height * this.H);
            mediaEntity.H = i3;
            if (i2 > 512) {
                mediaEntity.H = (int) ((i3 / i2) * 512.0f);
                mediaEntity.W = 512;
            }
            int i4 = mediaEntity.H;
            if (i4 > 512) {
                mediaEntity.W = (int) ((mediaEntity.W / i4) * 512.0f);
                mediaEntity.H = 512;
            }
            byte b = mediaEntity.subType;
            if ((b & 1) != 0) {
                int i5 = mediaEntity.W;
                if (i5 <= 0 || (i = mediaEntity.H) <= 0) {
                    return;
                }
                mediaEntity.bitmap = Bitmap.createBitmap(i5, i, Bitmap.Config.ARGB_8888);
                int[] iArr = new int[3];
                mediaEntity.metadata = iArr;
                mediaEntity.ptr = RLottieDrawable.create(mediaEntity.text, null, mediaEntity.W, mediaEntity.H, iArr, false, null, false, 0);
                mediaEntity.framesPerDraw = mediaEntity.metadata[1] / this.fps;
            } else if ((b & 4) != 0) {
                mediaEntity.looped = false;
                mediaEntity.animatedFileDrawable = new AnimatedFileDrawable(new File(mediaEntity.text), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null);
                mediaEntity.framesPerDraw = animatedFileDrawable.getFps() / this.fps;
                mediaEntity.currentFrame = 1.0f;
                mediaEntity.animatedFileDrawable.getNextFrame(true);
                if (mediaEntity.type == 5) {
                    mediaEntity.firstSeek = true;
                }
            } else {
                String str = mediaEntity.text;
                if (!TextUtils.isEmpty(mediaEntity.segmentedPath) && (mediaEntity.subType & 16) != 0) {
                    str = mediaEntity.segmentedPath;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (mediaEntity.type == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                mediaEntity.bitmap = decodeFile;
                if (mediaEntity.type == 2 && decodeFile != null) {
                    mediaEntity.roundRadius = AndroidUtilities.dp(12.0f) / Math.min(mediaEntity.viewWidth, mediaEntity.viewHeight);
                    Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(mediaEntity.text);
                    double d = mediaEntity.rotation;
                    double radians = Math.toRadians(((Integer) imageOrientation.first).intValue());
                    Double.isNaN(d);
                    mediaEntity.rotation = (float) (d - radians);
                    if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
                        float f = mediaEntity.x;
                        float f2 = mediaEntity.width;
                        float f3 = f + (f2 / 2.0f);
                        float f4 = mediaEntity.y;
                        float f5 = mediaEntity.height;
                        float f6 = f4 + (f5 / 2.0f);
                        int i6 = this.W;
                        int i7 = this.H;
                        float f7 = (f2 * i6) / i7;
                        float f8 = (f5 * i7) / i6;
                        mediaEntity.width = f8;
                        mediaEntity.height = f7;
                        mediaEntity.x = f3 - (f8 / 2.0f);
                        mediaEntity.y = f6 - (f7 / 2.0f);
                    }
                    applyRoundRadius(mediaEntity, mediaEntity.bitmap, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / mediaEntity.bitmap.getHeight();
                    if (width > 1.0f) {
                        float f9 = mediaEntity.height;
                        float f10 = f9 / width;
                        mediaEntity.y += (f9 - f10) / 2.0f;
                        mediaEntity.height = f10;
                    } else if (width < 1.0f) {
                        float f11 = mediaEntity.width;
                        float f12 = width * f11;
                        mediaEntity.x += (f11 - f12) / 2.0f;
                        mediaEntity.width = f12;
                    }
                }
            }
            setupMatrix(mediaEntity);
        }

        private void setupMatrix(VideoEditedInfo.MediaEntity mediaEntity) {
            AnimatedFileDrawable animatedFileDrawable;
            mediaEntity.matrix = new Matrix();
            Bitmap bitmap = mediaEntity.bitmap;
            if (bitmap == null && (animatedFileDrawable = mediaEntity.animatedFileDrawable) != null) {
                bitmap = animatedFileDrawable.getBackgroundBitmap();
            }
            if (bitmap != null) {
                mediaEntity.matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (mediaEntity.type != 1 && (mediaEntity.subType & 2) != 0) {
                mediaEntity.matrix.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            mediaEntity.matrix.postScale(mediaEntity.width * this.W, mediaEntity.height * this.H);
            mediaEntity.matrix.postTranslate(mediaEntity.x * this.W, mediaEntity.y * this.H);
            Matrix matrix = mediaEntity.matrix;
            double d = -mediaEntity.rotation;
            Double.isNaN(d);
            matrix.postRotate((float) ((d / 3.141592653589793d) * 180.0d), (mediaEntity.x + (mediaEntity.width / 2.0f)) * this.W, (mediaEntity.y + (mediaEntity.height / 2.0f)) * this.H);
        }

        private void applyRoundRadius(VideoEditedInfo.MediaEntity mediaEntity, Bitmap bitmap, int i) {
            if (bitmap == null || mediaEntity == null) {
                return;
            }
            if (mediaEntity.roundRadius == 0.0f && i == 0) {
                return;
            }
            if (mediaEntity.roundRadiusCanvas == null) {
                mediaEntity.roundRadiusCanvas = new Canvas(bitmap);
            }
            if (mediaEntity.roundRadius != 0.0f) {
                if (this.path == null) {
                    this.path = new Path();
                }
                if (this.xRefPaint == null) {
                    Paint paint = new Paint(1);
                    this.xRefPaint = paint;
                    paint.setColor(-16777216);
                    this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * mediaEntity.roundRadius;
                this.path.rewind();
                this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                this.path.toggleInverseFillType();
                mediaEntity.roundRadiusCanvas.drawPath(this.path, this.xRefPaint);
            }
            if (i != 0) {
                if (this.textColorPaint == null) {
                    Paint paint2 = new Paint(1);
                    this.textColorPaint = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                }
                this.textColorPaint.setColor(i);
                mediaEntity.roundRadiusCanvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
            }
        }
    }
}
