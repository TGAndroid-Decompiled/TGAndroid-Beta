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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileBuffer;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.Views.EditTextOutline;
import org.telegram.ui.Components.RLottieNative;

public class WebmEncoder {

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
            float f = i;
            float f2 = i2;
            path.addRoundRect(new RectF(0.0f, 0.0f, f, f2), f * 0.125f, f2 * 0.125f, Path.Direction.CW);
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
                float fMin = Math.min(bitmap.getWidth(), bitmap.getHeight()) * mediaEntity.roundRadius;
                this.path.rewind();
                this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), fMin, fMin, Path.Direction.CCW);
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

        private void drawEntity(Canvas canvas, VideoEditedInfo.MediaEntity mediaEntity, int i, long j) {
            VideoEditedInfo.MediaEntity mediaEntity2;
            Canvas canvas2;
            long j2;
            RLottieNative rLottieNative = mediaEntity.lottieNative;
            int i2 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap = mediaEntity.bitmap;
                if (bitmap == null || mediaEntity.W <= 0 || mediaEntity.H <= 0) {
                    return;
                }
                rLottieNative.getFrame((int) mediaEntity.currentFrame, bitmap, true);
                Bitmap bitmap2 = mediaEntity.bitmap;
                if ((mediaEntity.subType & 8) == 0) {
                    i = 0;
                }
                applyRoundRadius(mediaEntity, bitmap2, i);
                canvas.drawBitmap(mediaEntity.bitmap, mediaEntity.matrix, this.bitmapPaint);
                float f = mediaEntity.currentFrame + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f;
                if (f >= mediaEntity.lottieNative.mMetaData[0]) {
                    mediaEntity.currentFrame = 0.0f;
                    return;
                }
                return;
            }
            if (mediaEntity.animatedFileDrawable != null) {
                float f2 = mediaEntity.currentFrame;
                int i3 = (int) f2;
                float f3 = f2 + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f3;
                for (int i4 = (int) f3; i3 != i4; i4--) {
                    mediaEntity.animatedFileDrawable.getNextFrame(true);
                }
                AnimatedFileBuffer animatedFileBuffer = mediaEntity.animatedFileDrawable.backgroundBuffer;
                Bitmap bitmap3 = animatedFileBuffer != null ? animatedFileBuffer.bitmap : null;
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, mediaEntity.matrix, this.bitmapPaint);
                    return;
                }
                return;
            }
            canvas.drawBitmap(mediaEntity.bitmap, mediaEntity.matrix, this.bitmapPaint);
            ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            while (i2 < mediaEntity.entities.size()) {
                VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i2);
                if (emojiEntity == null || (mediaEntity2 = emojiEntity.entity) == null) {
                    canvas2 = canvas;
                    j2 = j;
                } else {
                    canvas2 = canvas;
                    j2 = j;
                    drawEntity(canvas2, mediaEntity2, mediaEntity.color, j2);
                }
                i2++;
                canvas = canvas2;
                j = j2;
            }
        }

        public void initStickerEntity(VideoEditedInfo.MediaEntity mediaEntity) {
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
                RLottieNative rLottieNativeCreateFromFile = RLottieNative.createFromFile(mediaEntity.text, null, mediaEntity.W, mediaEntity.H, null, false, null, false, 0, null);
                mediaEntity.lottieNative = rLottieNativeCreateFromFile;
                mediaEntity.framesPerDraw = rLottieNativeCreateFromFile != null ? rLottieNativeCreateFromFile.mMetaData[1] / this.fps : 0.0f;
            } else if ((b & 4) != 0) {
                mediaEntity.looped = false;
                AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(new File(mediaEntity.text), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null, 0, true);
                mediaEntity.animatedFileDrawable = animatedFileDrawable;
                mediaEntity.framesPerDraw = animatedFileDrawable.metaData[5] / this.fps;
                mediaEntity.currentFrame = 1.0f;
                animatedFileDrawable.getNextFrame(true);
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
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                mediaEntity.bitmap = bitmapDecodeFile;
                if (mediaEntity.type == 2 && bitmapDecodeFile != null) {
                    mediaEntity.roundRadius = AndroidUtilities.dp(12.0f) / Math.min(mediaEntity.viewWidth, mediaEntity.viewHeight);
                    Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(mediaEntity.text);
                    mediaEntity.rotation = (float) (((double) mediaEntity.rotation) - Math.toRadians(((Integer) imageOrientation.first).intValue()));
                    if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
                        float f = mediaEntity.x;
                        float f2 = mediaEntity.width;
                        float f3 = (f2 / 2.0f) + f;
                        float f4 = mediaEntity.y;
                        float f5 = mediaEntity.height;
                        float f6 = (f5 / 2.0f) + f4;
                        float f7 = this.W;
                        float f8 = this.H;
                        float f9 = (f2 * f7) / f8;
                        float f10 = (f5 * f8) / f7;
                        mediaEntity.width = f10;
                        mediaEntity.height = f9;
                        mediaEntity.x = f3 - (f10 / 2.0f);
                        mediaEntity.y = f6 - (f9 / 2.0f);
                    }
                    applyRoundRadius(mediaEntity, mediaEntity.bitmap, 0);
                } else if (bitmapDecodeFile != null) {
                    float width = bitmapDecodeFile.getWidth() / mediaEntity.bitmap.getHeight();
                    if (width > 1.0f) {
                        float f11 = mediaEntity.height;
                        float f12 = f11 / width;
                        mediaEntity.y = ImageReceiver$$ExternalSyntheticOutline0.m(f11, f12, 2.0f, mediaEntity.y);
                        mediaEntity.height = f12;
                    } else if (width < 1.0f) {
                        float f13 = mediaEntity.width;
                        float f14 = width * f13;
                        mediaEntity.x = ImageReceiver$$ExternalSyntheticOutline0.m(f13, f14, 2.0f, mediaEntity.x);
                        mediaEntity.width = f14;
                    }
                }
            }
            setupMatrix(mediaEntity);
        }

        private void initTextEntity(final VideoEditedInfo.MediaEntity mediaEntity) {
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
            ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                final VideoEditedInfo.EmojiEntity emojiEntity = arrayList.get(i);
                if (emojiEntity.documentAbsolutePath != null) {
                    VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                    emojiEntity.entity = mediaEntity2;
                    mediaEntity2.text = emojiEntity.documentAbsolutePath;
                    mediaEntity2.subType = emojiEntity.subType;
                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(0L, 1.0f, editTextOutline.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f, int i5, int i6, int i7, Paint paint) {
                            super.draw(canvas, charSequence, i3, i4, f, i5, i6, i7, paint);
                            float f2 = mediaEntity.x;
                            float paddingLeft = (this.measuredSize / 2.0f) + editTextOutline.getPaddingLeft() + f;
                            VideoEditedInfo.MediaEntity mediaEntity3 = mediaEntity;
                            float fCos = ((paddingLeft / mediaEntity3.viewWidth) * mediaEntity3.width) + f2;
                            float f3 = mediaEntity3.y;
                            float paddingTop = ((i7 - i5) / 2.0f) + editTextOutline.getPaddingTop() + i5;
                            VideoEditedInfo.MediaEntity mediaEntity4 = mediaEntity;
                            float f4 = paddingTop / mediaEntity4.viewHeight;
                            float f5 = mediaEntity4.height;
                            float fM = (f4 * f5) + f3;
                            if (mediaEntity4.rotation != 0.0f) {
                                float f6 = (mediaEntity4.width / 2.0f) + mediaEntity4.x;
                                float f7 = (f5 / 2.0f) + mediaEntity4.y;
                                float f8 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d = fCos - f6;
                                double d2 = (fM - f7) / f8;
                                fCos = ((float) ((Math.cos(-mediaEntity.rotation) * d) - (Math.sin(-mediaEntity.rotation) * d2))) + f6;
                                fM = (((float) AndroidUtilities$$ExternalSyntheticOutline1.m(-mediaEntity.rotation, d2, Math.sin(-mediaEntity.rotation) * d)) * f8) + f7;
                            }
                            VideoEditedInfo.MediaEntity mediaEntity5 = emojiEntity.entity;
                            float f9 = this.measuredSize;
                            VideoEditedInfo.MediaEntity mediaEntity6 = mediaEntity;
                            float f10 = (f9 / mediaEntity6.viewWidth) * mediaEntity6.width;
                            mediaEntity5.width = f10;
                            float f11 = (f9 / mediaEntity6.viewHeight) * mediaEntity6.height;
                            mediaEntity5.height = f11;
                            mediaEntity5.x = fCos - (f10 / 2.0f);
                            mediaEntity5.y = fM - (f11 / 2.0f);
                            mediaEntity5.rotation = mediaEntity6.rotation;
                            if (mediaEntity5.bitmap == null) {
                                FrameDrawer.this.initStickerEntity(mediaEntity5);
                            }
                        }
                    };
                    int i3 = emojiEntity.offset;
                    spannableString.setSpan(animatedEmojiSpan, i3, emojiEntity.length + i3, 33);
                }
                i = i2;
            }
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableString, editTextOutline.getPaint().getFontMetricsInt(), false);
            if ((charSequenceReplaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) charSequenceReplaceEmoji).getSpans(0, charSequenceReplaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                    emojiSpan.scale = 0.85f;
                }
            }
            editTextOutline.setText(charSequenceReplaceEmoji);
            editTextOutline.setTextColor(mediaEntity.color);
            int i4 = mediaEntity.textAlign;
            editTextOutline.setGravity(i4 != 1 ? i4 != 2 ? 19 : 21 : 17);
            int i5 = Build.VERSION.SDK_INT;
            int i6 = mediaEntity.textAlign;
            editTextOutline.setTextAlignment(i6 != 1 ? (i6 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) ? 3 : 2 : 4);
            editTextOutline.setHorizontallyScrolling(false);
            editTextOutline.setImeOptions(268435456);
            editTextOutline.setFocusableInTouchMode(true);
            editTextOutline.setInputType(editTextOutline.getInputType() | 16384);
            if (i5 >= 23) {
                setBreakStrategy(editTextOutline);
            }
            byte b = mediaEntity.subType;
            if (b == 0) {
                editTextOutline.setFrameColor(mediaEntity.color);
                editTextOutline.setTextColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f ? -16777216 : -1);
            } else if (b == 1) {
                editTextOutline.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -1728053248 : -1711276033);
                editTextOutline.setTextColor(mediaEntity.color);
            } else if (b == 2) {
                editTextOutline.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -16777216 : -1);
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

        private void setupMatrix(VideoEditedInfo.MediaEntity mediaEntity) {
            AnimatedFileDrawable animatedFileDrawable;
            Matrix matrix = new Matrix();
            mediaEntity.matrix = matrix;
            Bitmap bitmap = mediaEntity.bitmap;
            if (bitmap == null && (animatedFileDrawable = mediaEntity.animatedFileDrawable) != null) {
                AnimatedFileBuffer animatedFileBuffer = animatedFileDrawable.backgroundBuffer;
                bitmap = animatedFileBuffer != null ? animatedFileBuffer.bitmap : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (mediaEntity.type != 1 && (mediaEntity.subType & 2) != 0) {
                mediaEntity.matrix.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            mediaEntity.matrix.postScale(mediaEntity.width * this.W, mediaEntity.height * this.H);
            mediaEntity.matrix.postTranslate(mediaEntity.x * this.W, mediaEntity.y * this.H);
            mediaEntity.matrix.postRotate((float) ((((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d), ((mediaEntity.width / 2.0f) + mediaEntity.x) * this.W, ((mediaEntity.height / 2.0f) + mediaEntity.y) * this.H);
        }

        public void draw(Canvas canvas, int i) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j = (1000000000 / ((long) this.fps)) * ((long) i);
            int size = this.mediaEntities.size();
            for (int i2 = 0; i2 < size; i2++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i2);
                drawEntity(canvas, mediaEntity, mediaEntity.color, j);
            }
            canvas.restore();
        }

        public void setBreakStrategy(EditTextOutline editTextOutline) {
            editTextOutline.setBreakStrategy(0);
        }
    }

    public static boolean convert(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams, int i) throws Throwable {
        boolean z;
        long length;
        MediaController.VideoConvertorListener videoConvertorListener;
        Bitmap bitmap;
        MediaController.VideoConvertorListener videoConvertorListener2;
        int i2 = convertVideoParams.resultWidth;
        int i3 = convertVideoParams.resultHeight;
        long jCreateEncoder = createEncoder(convertVideoParams.cacheFile.getAbsolutePath(), i2, i3, convertVideoParams.framerate, convertVideoParams.bitrate);
        boolean z2 = true;
        if (jCreateEncoder == 0) {
            return true;
        }
        Bitmap bitmapCreateBitmap = null;
        try {
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                try {
                    try {
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmapCreateBitmap.getByteCount());
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        FrameDrawer frameDrawer = new FrameDrawer(convertVideoParams);
                        int iCeil = (int) Math.ceil((convertVideoParams.duration / 1000.0d) * ((double) convertVideoParams.framerate));
                        int i4 = 0;
                        while (i4 < iCeil) {
                            frameDrawer.draw(canvas, i4);
                            bitmapCreateBitmap.copyPixelsToBuffer(byteBufferAllocateDirect);
                            byteBufferAllocateDirect.flip();
                            if (!writeFrame(jCreateEncoder, byteBufferAllocateDirect, i2, i3)) {
                                FileLog.d("webm writeFile error at " + i4 + "/" + iCeil);
                                stop(jCreateEncoder);
                                bitmapCreateBitmap.recycle();
                                return z2;
                            }
                            MediaController.VideoConvertorListener videoConvertorListener3 = convertVideoParams.callback;
                            if (videoConvertorListener3 != null) {
                                try {
                                    bitmap = bitmapCreateBitmap;
                                    try {
                                        videoConvertorListener3.didWriteData(Math.min(261120L, convertVideoParams.cacheFile.length()), i4 / iCeil);
                                    } catch (Exception e) {
                                        e = e;
                                        bitmapCreateBitmap = bitmap;
                                        FileLog.e(e);
                                        stop(jCreateEncoder);
                                        if (bitmapCreateBitmap != null) {
                                            bitmapCreateBitmap.recycle();
                                        }
                                        z = true;
                                        length = convertVideoParams.cacheFile.length();
                                        if (i > 0) {
                                        }
                                        videoConvertorListener = convertVideoParams.callback;
                                        if (videoConvertorListener != null) {
                                            videoConvertorListener.didWriteData(length, 1.0f);
                                        }
                                        FileLog.d("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i);
                                        return z;
                                    } catch (Throwable th) {
                                        th = th;
                                        bitmapCreateBitmap = bitmap;
                                        stop(jCreateEncoder);
                                        if (bitmapCreateBitmap != null) {
                                            bitmapCreateBitmap.recycle();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                }
                            } else {
                                bitmap = bitmapCreateBitmap;
                            }
                            if (i4 % 3 == 0 && (videoConvertorListener2 = convertVideoParams.callback) != null) {
                                videoConvertorListener2.checkConversionCanceled();
                            }
                            i4++;
                            bitmapCreateBitmap = bitmap;
                            i2 = i2;
                            z2 = true;
                        }
                        stop(jCreateEncoder);
                        bitmapCreateBitmap.recycle();
                        z = false;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    FileLog.e(e);
                    stop(jCreateEncoder);
                    if (bitmapCreateBitmap != null) {
                        bitmapCreateBitmap.recycle();
                    }
                    z = true;
                    length = convertVideoParams.cacheFile.length();
                    if (i > 0) {
                    }
                    videoConvertorListener = convertVideoParams.callback;
                    if (videoConvertorListener != null) {
                        videoConvertorListener.didWriteData(length, 1.0f);
                    }
                    FileLog.d("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i);
                    return z;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e4) {
            e = e4;
        }
        length = convertVideoParams.cacheFile.length();
        if (i > 0 || length <= 261120) {
            videoConvertorListener = convertVideoParams.callback;
            if (videoConvertorListener != null) {
                videoConvertorListener.didWriteData(length, 1.0f);
            }
            FileLog.d("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i);
            return z;
        }
        int i5 = convertVideoParams.bitrate;
        convertVideoParams.bitrate = (int) ((261120.0f / length) * 0.9f * i5);
        convertVideoParams.cacheFile.delete();
        FileLog.d("webm encoded too much, got " + length + ", old bitrate = " + i5 + " new bitrate = " + convertVideoParams.bitrate);
        return convert(convertVideoParams, i - 1);
    }

    private static native long createEncoder(String str, int i, int i2, int i3, long j);

    public static native void stop(long j);

    private static native boolean writeFrame(long j, ByteBuffer byteBuffer, int i, int i2);
}
