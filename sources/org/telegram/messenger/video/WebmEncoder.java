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
import j3.r0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.x5;
import xf.i0;
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
            int i9 = convertVideoParams.resultWidth;
            this.W = i9;
            int i10 = convertVideoParams.resultHeight;
            this.H = i10;
            this.fps = convertVideoParams.framerate;
            Path path = new Path();
            this.clipPath = path;
            path.addRoundRect(new RectF(0.0f, 0.0f, i9, i10), i9 * 0.125f, i10 * 0.125f, Path.Direction.CW);
            this.photo = BitmapFactory.decodeFile(convertVideoParams.videoPath);
            arrayList.addAll(convertVideoParams.mediaEntities);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i11);
                byte b10 = mediaEntity.type;
                if (b10 != 0 && b10 != 2 && b10 != 5) {
                    if (b10 == 1) {
                        initTextEntity(mediaEntity);
                    }
                } else {
                    initStickerEntity(mediaEntity);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(VideoEditedInfo.MediaEntity mediaEntity, Bitmap bitmap, int i9) {
            if (bitmap != null && mediaEntity != null) {
                if (mediaEntity.roundRadius != 0.0f || i9 != 0) {
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
                    if (i9 != 0) {
                        if (this.textColorPaint == null) {
                            Paint paint2 = new Paint(1);
                            this.textColorPaint = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        }
                        this.textColorPaint.setColor(i9);
                        mediaEntity.roundRadiusCanvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                    }
                }
            }
        }

        private void drawEntity(Canvas canvas, VideoEditedInfo.MediaEntity mediaEntity, int i9, long j10) {
            VideoEditedInfo.MediaEntity mediaEntity2;
            Canvas canvas2;
            long j11;
            Bitmap bitmap;
            RLottieNative rLottieNative = mediaEntity.lottieNative;
            int i10 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap2 = mediaEntity.bitmap;
                if (bitmap2 != null && mediaEntity.W > 0 && mediaEntity.H > 0) {
                    rLottieNative.c((int) mediaEntity.currentFrame, bitmap2, true);
                    Bitmap bitmap3 = mediaEntity.bitmap;
                    if ((mediaEntity.subType & 8) == 0) {
                        i9 = 0;
                    }
                    applyRoundRadius(mediaEntity, bitmap3, i9);
                    canvas.drawBitmap(mediaEntity.bitmap, mediaEntity.matrix, this.bitmapPaint);
                    float f10 = mediaEntity.currentFrame + mediaEntity.framesPerDraw;
                    mediaEntity.currentFrame = f10;
                    if (f10 >= mediaEntity.lottieNative.f26465a[0]) {
                        mediaEntity.currentFrame = 0.0f;
                    }
                }
            } else if (mediaEntity.animatedFileDrawable != null) {
                float f11 = mediaEntity.currentFrame;
                int i11 = (int) f11;
                float f12 = f11 + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f12;
                for (int i12 = (int) f12; i11 != i12; i12--) {
                    mediaEntity.animatedFileDrawable.r(true);
                }
                u5 u5Var = mediaEntity.animatedFileDrawable.v;
                if (u5Var != null) {
                    bitmap = u5Var.f32920b;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, mediaEntity.matrix, this.bitmapPaint);
                }
            } else {
                canvas.drawBitmap(mediaEntity.bitmap, mediaEntity.matrix, this.bitmapPaint);
                ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
                if (arrayList != null && !arrayList.isEmpty()) {
                    while (i10 < mediaEntity.entities.size()) {
                        VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i10);
                        if (emojiEntity == null || (mediaEntity2 = emojiEntity.entity) == null) {
                            canvas2 = canvas;
                            j11 = j10;
                        } else {
                            canvas2 = canvas;
                            j11 = j10;
                            drawEntity(canvas2, mediaEntity2, mediaEntity.color, j11);
                        }
                        i10++;
                        canvas = canvas2;
                        j10 = j11;
                    }
                }
            }
        }

        public void initStickerEntity(VideoEditedInfo.MediaEntity mediaEntity) {
            int i9;
            float f10;
            int i10 = (int) (mediaEntity.width * this.W);
            mediaEntity.W = i10;
            int i11 = (int) (mediaEntity.height * this.H);
            mediaEntity.H = i11;
            if (i10 > 512) {
                mediaEntity.H = (int) ((i11 / i10) * 512.0f);
                mediaEntity.W = 512;
            }
            int i12 = mediaEntity.H;
            if (i12 > 512) {
                mediaEntity.W = (int) ((mediaEntity.W / i12) * 512.0f);
                mediaEntity.H = 512;
            }
            byte b10 = mediaEntity.subType;
            if ((b10 & 1) != 0) {
                int i13 = mediaEntity.W;
                if (i13 > 0 && (i9 = mediaEntity.H) > 0) {
                    mediaEntity.bitmap = Bitmap.createBitmap(i13, i9, Bitmap.Config.ARGB_8888);
                    RLottieNative a2 = RLottieNative.a(mediaEntity.text, null, mediaEntity.W, mediaEntity.H, null, false, null, false, 0, null);
                    mediaEntity.lottieNative = a2;
                    if (a2 != null) {
                        f10 = a2.f26465a[1] / this.fps;
                    } else {
                        f10 = 0.0f;
                    }
                    mediaEntity.framesPerDraw = f10;
                } else {
                    return;
                }
            } else if ((b10 & 4) != 0) {
                mediaEntity.looped = false;
                x5 x5Var = new x5(new File(mediaEntity.text), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null, 0, true);
                mediaEntity.animatedFileDrawable = x5Var;
                mediaEntity.framesPerDraw = x5Var.d[5] / this.fps;
                mediaEntity.currentFrame = 1.0f;
                x5Var.r(true);
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
                    mediaEntity.rotation = (float) (mediaEntity.rotation - Math.toRadians(((Integer) imageOrientation.first).intValue()));
                    if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
                        float f11 = mediaEntity.f19673x;
                        float f12 = mediaEntity.width;
                        float f13 = (f12 / 2.0f) + f11;
                        float f14 = mediaEntity.f19674y;
                        float f15 = mediaEntity.height;
                        float f16 = (f15 / 2.0f) + f14;
                        float f17 = this.W;
                        float f18 = this.H;
                        float f19 = (f12 * f17) / f18;
                        float f20 = (f15 * f18) / f17;
                        mediaEntity.width = f20;
                        mediaEntity.height = f19;
                        mediaEntity.f19673x = f13 - (f20 / 2.0f);
                        mediaEntity.f19674y = f16 - (f19 / 2.0f);
                    }
                    applyRoundRadius(mediaEntity, mediaEntity.bitmap, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / mediaEntity.bitmap.getHeight();
                    if (width > 1.0f) {
                        float f21 = mediaEntity.height;
                        float f22 = f21 / width;
                        mediaEntity.f19674y = e2.c.A(f21, f22, 2.0f, mediaEntity.f19674y);
                        mediaEntity.height = f22;
                    } else if (width < 1.0f) {
                        float f23 = mediaEntity.width;
                        float f24 = width * f23;
                        mediaEntity.f19673x = e2.c.A(f23, f24, 2.0f, mediaEntity.f19673x);
                        mediaEntity.width = f24;
                    }
                }
            }
            setupMatrix(mediaEntity);
        }

        private void initTextEntity(final VideoEditedInfo.MediaEntity mediaEntity) {
            int i9;
            int i10;
            int i11;
            Emoji.EmojiSpan[] emojiSpanArr;
            Typeface d;
            final yf.b bVar = new yf.b(ApplicationLoader.applicationContext);
            bVar.getPaint().setAntiAlias(true);
            bVar.drawAnimatedEmojiDrawables = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            i0 i0Var = mediaEntity.textTypeface;
            if (i0Var != null && (d = i0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, mediaEntity.fontSize);
            SpannableString spannableString = new SpannableString(mediaEntity.text);
            ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                final VideoEditedInfo.EmojiEntity emojiEntity = arrayList.get(i12);
                if (emojiEntity.documentAbsolutePath != null) {
                    VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                    emojiEntity.entity = mediaEntity2;
                    mediaEntity2.text = emojiEntity.documentAbsolutePath;
                    mediaEntity2.subType = emojiEntity.subType;
                    t5 t5Var = new t5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f10, int i16, int i17, int i18, Paint paint) {
                            super.draw(canvas, charSequence, i14, i15, f10, i16, i17, i18, paint);
                            VideoEditedInfo.MediaEntity mediaEntity3 = mediaEntity;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / mediaEntity3.viewWidth) * mediaEntity3.width) + mediaEntity.f19673x;
                            float f11 = mediaEntity3.f19674y;
                            VideoEditedInfo.MediaEntity mediaEntity4 = mediaEntity;
                            float f12 = mediaEntity4.height;
                            float paddingTop = (((((i18 - i16) / 2.0f) + (bVar.getPaddingTop() + i16)) / mediaEntity4.viewHeight) * f12) + f11;
                            if (mediaEntity4.rotation != 0.0f) {
                                float f13 = (mediaEntity4.width / 2.0f) + mediaEntity4.f19673x;
                                float f14 = (f12 / 2.0f) + mediaEntity4.f19674y;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d9 = paddingLeft - f13;
                                double d10 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-mediaEntity.rotation) * d9) - (Math.sin(-mediaEntity.rotation) * d10))) + f13;
                                paddingTop = (((float) r0.b(-mediaEntity.rotation, d10, Math.sin(-mediaEntity.rotation) * d9)) * f15) + f14;
                            }
                            VideoEditedInfo.MediaEntity mediaEntity5 = emojiEntity.entity;
                            int i19 = this.measuredSize;
                            VideoEditedInfo.MediaEntity mediaEntity6 = mediaEntity;
                            float f16 = (i19 / mediaEntity6.viewWidth) * mediaEntity6.width;
                            mediaEntity5.width = f16;
                            float f17 = (i19 / mediaEntity6.viewHeight) * mediaEntity6.height;
                            mediaEntity5.height = f17;
                            mediaEntity5.f19673x = paddingLeft - (f16 / 2.0f);
                            mediaEntity5.f19674y = paddingTop - (f17 / 2.0f);
                            mediaEntity5.rotation = mediaEntity6.rotation;
                            if (mediaEntity5.bitmap == null) {
                                FrameDrawer.this.initStickerEntity(mediaEntity5);
                            }
                        }
                    };
                    int i14 = emojiEntity.offset;
                    spannableString.setSpan(t5Var, i14, emojiEntity.length + i14, 33);
                }
                i12 = i13;
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, bVar.getPaint().getFontMetricsInt(), false);
            if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                    emojiSpan.scale = 0.85f;
                }
            }
            bVar.setText(replaceEmoji);
            bVar.setTextColor(mediaEntity.color);
            int i15 = mediaEntity.textAlign;
            if (i15 != 1) {
                if (i15 != 2) {
                    i9 = 19;
                } else {
                    i9 = 21;
                }
            } else {
                i9 = 17;
            }
            bVar.setGravity(i9);
            int i16 = Build.VERSION.SDK_INT;
            int i17 = mediaEntity.textAlign;
            if (i17 != 1) {
                if (i17 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
            } else {
                i10 = 4;
            }
            bVar.setTextAlignment(i10);
            bVar.setHorizontallyScrolling(false);
            bVar.setImeOptions(268435456);
            bVar.setFocusableInTouchMode(true);
            bVar.setInputType(bVar.getInputType() | 16384);
            if (i16 >= 23) {
                setBreakStrategy(bVar);
            }
            byte b10 = mediaEntity.subType;
            int i18 = -1;
            if (b10 == 0) {
                bVar.setFrameColor(mediaEntity.color);
                if (AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f) {
                    i18 = -16777216;
                }
                bVar.setTextColor(i18);
            } else if (b10 == 1) {
                if (AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f) {
                    i11 = -1728053248;
                } else {
                    i11 = -1711276033;
                }
                bVar.setFrameColor(i11);
                bVar.setTextColor(mediaEntity.color);
            } else if (b10 == 2) {
                if (AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f) {
                    i18 = -16777216;
                }
                bVar.setFrameColor(i18);
                bVar.setTextColor(mediaEntity.color);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(mediaEntity.color);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, 1073741824));
            bVar.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
            mediaEntity.bitmap = Bitmap.createBitmap(mediaEntity.viewWidth, mediaEntity.viewHeight, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(mediaEntity.bitmap));
            setupMatrix(mediaEntity);
        }

        private void setupMatrix(VideoEditedInfo.MediaEntity mediaEntity) {
            x5 x5Var;
            Matrix matrix = new Matrix();
            mediaEntity.matrix = matrix;
            Bitmap bitmap = mediaEntity.bitmap;
            if (bitmap == null && (x5Var = mediaEntity.animatedFileDrawable) != null) {
                u5 u5Var = x5Var.v;
                bitmap = u5Var != null ? u5Var.f32920b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (mediaEntity.type != 1 && (mediaEntity.subType & 2) != 0) {
                mediaEntity.matrix.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            mediaEntity.matrix.postScale(mediaEntity.width * this.W, mediaEntity.height * this.H);
            mediaEntity.matrix.postTranslate(mediaEntity.f19673x * this.W, mediaEntity.f19674y * this.H);
            mediaEntity.matrix.postRotate((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d), ((mediaEntity.width / 2.0f) + mediaEntity.f19673x) * this.W, ((mediaEntity.height / 2.0f) + mediaEntity.f19674y) * this.H);
        }

        public void draw(Canvas canvas, int i9) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j10 = (1000000000 / this.fps) * i9;
            int size = this.mediaEntities.size();
            for (int i10 = 0; i10 < size; i10++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i10);
                drawEntity(canvas, mediaEntity, mediaEntity.color, j10);
            }
            canvas.restore();
        }

        public void setBreakStrategy(yf.b bVar) {
            bVar.setBreakStrategy(0);
        }
    }

    public static boolean convert(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.WebmEncoder.convert(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, int):boolean");
    }

    private static native long createEncoder(String str, int i9, int i10, int i11, long j10);

    public static native void stop(long j10);

    private static native boolean writeFrame(long j10, ByteBuffer byteBuffer, int i9, int i10);
}
