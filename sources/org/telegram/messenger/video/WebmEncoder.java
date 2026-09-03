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
import cg.t0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kf.k0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.y5;
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
            int i10 = convertVideoParams.resultWidth;
            this.W = i10;
            int i11 = convertVideoParams.resultHeight;
            this.H = i11;
            this.fps = convertVideoParams.framerate;
            Path path = new Path();
            this.clipPath = path;
            path.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), i10 * 0.125f, i11 * 0.125f, Path.Direction.CW);
            this.photo = BitmapFactory.decodeFile(convertVideoParams.videoPath);
            arrayList.addAll(convertVideoParams.mediaEntities);
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i12);
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

        private void applyRoundRadius(VideoEditedInfo.MediaEntity mediaEntity, Bitmap bitmap, int i10) {
            if (bitmap != null && mediaEntity != null) {
                if (mediaEntity.roundRadius != 0.0f || i10 != 0) {
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
                    if (i10 != 0) {
                        if (this.textColorPaint == null) {
                            Paint paint2 = new Paint(1);
                            this.textColorPaint = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        }
                        this.textColorPaint.setColor(i10);
                        mediaEntity.roundRadiusCanvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                    }
                }
            }
        }

        private void drawEntity(Canvas canvas, VideoEditedInfo.MediaEntity mediaEntity, int i10, long j10) {
            VideoEditedInfo.MediaEntity mediaEntity2;
            Canvas canvas2;
            long j11;
            Bitmap bitmap;
            RLottieNative rLottieNative = mediaEntity.lottieNative;
            int i11 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap2 = mediaEntity.bitmap;
                if (bitmap2 != null && mediaEntity.W > 0 && mediaEntity.H > 0) {
                    rLottieNative.c((int) mediaEntity.currentFrame, bitmap2, true);
                    Bitmap bitmap3 = mediaEntity.bitmap;
                    if ((mediaEntity.subType & 8) == 0) {
                        i10 = 0;
                    }
                    applyRoundRadius(mediaEntity, bitmap3, i10);
                    canvas.drawBitmap(mediaEntity.bitmap, mediaEntity.matrix, this.bitmapPaint);
                    float f10 = mediaEntity.currentFrame + mediaEntity.framesPerDraw;
                    mediaEntity.currentFrame = f10;
                    if (f10 >= mediaEntity.lottieNative.f23082a[0]) {
                        mediaEntity.currentFrame = 0.0f;
                    }
                }
            } else if (mediaEntity.animatedFileDrawable != null) {
                float f11 = mediaEntity.currentFrame;
                int i12 = (int) f11;
                float f12 = f11 + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f12;
                for (int i13 = (int) f12; i12 != i13; i13--) {
                    mediaEntity.animatedFileDrawable.r(true);
                }
                v5 v5Var = mediaEntity.animatedFileDrawable.v;
                if (v5Var != null) {
                    bitmap = v5Var.f29382b;
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
                    while (i11 < mediaEntity.entities.size()) {
                        VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i11);
                        if (emojiEntity == null || (mediaEntity2 = emojiEntity.entity) == null) {
                            canvas2 = canvas;
                            j11 = j10;
                        } else {
                            canvas2 = canvas;
                            j11 = j10;
                            drawEntity(canvas2, mediaEntity2, mediaEntity.color, j11);
                        }
                        i11++;
                        canvas = canvas2;
                        j10 = j11;
                    }
                }
            }
        }

        public void initStickerEntity(VideoEditedInfo.MediaEntity mediaEntity) {
            int i10;
            float f10;
            int i11 = (int) (mediaEntity.width * this.W);
            mediaEntity.W = i11;
            int i12 = (int) (mediaEntity.height * this.H);
            mediaEntity.H = i12;
            if (i11 > 512) {
                mediaEntity.H = (int) ((i12 / i11) * 512.0f);
                mediaEntity.W = 512;
            }
            int i13 = mediaEntity.H;
            if (i13 > 512) {
                mediaEntity.W = (int) ((mediaEntity.W / i13) * 512.0f);
                mediaEntity.H = 512;
            }
            byte b10 = mediaEntity.subType;
            if ((b10 & 1) != 0) {
                int i14 = mediaEntity.W;
                if (i14 > 0 && (i10 = mediaEntity.H) > 0) {
                    mediaEntity.bitmap = Bitmap.createBitmap(i14, i10, Bitmap.Config.ARGB_8888);
                    RLottieNative a2 = RLottieNative.a(mediaEntity.text, null, mediaEntity.W, mediaEntity.H, null, false, null, false, 0, null);
                    mediaEntity.lottieNative = a2;
                    if (a2 != null) {
                        f10 = a2.f23082a[1] / this.fps;
                    } else {
                        f10 = 0.0f;
                    }
                    mediaEntity.framesPerDraw = f10;
                } else {
                    return;
                }
            } else if ((b10 & 4) != 0) {
                mediaEntity.looped = false;
                y5 y5Var = new y5(new File(mediaEntity.text), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null, 0, true);
                mediaEntity.animatedFileDrawable = y5Var;
                mediaEntity.framesPerDraw = y5Var.d[5] / this.fps;
                mediaEntity.currentFrame = 1.0f;
                y5Var.r(true);
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
                        float f11 = mediaEntity.f16673x;
                        float f12 = mediaEntity.width;
                        float f13 = (f12 / 2.0f) + f11;
                        float f14 = mediaEntity.f16674y;
                        float f15 = mediaEntity.height;
                        float f16 = (f15 / 2.0f) + f14;
                        float f17 = this.W;
                        float f18 = this.H;
                        float f19 = (f12 * f17) / f18;
                        float f20 = (f15 * f18) / f17;
                        mediaEntity.width = f20;
                        mediaEntity.height = f19;
                        mediaEntity.f16673x = f13 - (f20 / 2.0f);
                        mediaEntity.f16674y = f16 - (f19 / 2.0f);
                    }
                    applyRoundRadius(mediaEntity, mediaEntity.bitmap, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / mediaEntity.bitmap.getHeight();
                    if (width > 1.0f) {
                        float f21 = mediaEntity.height;
                        float f22 = f21 / width;
                        mediaEntity.f16674y = e2.c.x(f21, f22, 2.0f, mediaEntity.f16674y);
                        mediaEntity.height = f22;
                    } else if (width < 1.0f) {
                        float f23 = mediaEntity.width;
                        float f24 = width * f23;
                        mediaEntity.f16673x = e2.c.x(f23, f24, 2.0f, mediaEntity.f16673x);
                        mediaEntity.width = f24;
                    }
                }
            }
            setupMatrix(mediaEntity);
        }

        private void initTextEntity(final VideoEditedInfo.MediaEntity mediaEntity) {
            int i10;
            int i11;
            int i12;
            Emoji.EmojiSpan[] emojiSpanArr;
            Typeface d;
            final dg.b bVar = new dg.b(ApplicationLoader.applicationContext);
            bVar.getPaint().setAntiAlias(true);
            bVar.drawAnimatedEmojiDrawables = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            t0 t0Var = mediaEntity.textTypeface;
            if (t0Var != null && (d = t0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, mediaEntity.fontSize);
            SpannableString spannableString = new SpannableString(mediaEntity.text);
            ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                int i14 = i13 + 1;
                final VideoEditedInfo.EmojiEntity emojiEntity = arrayList.get(i13);
                if (emojiEntity.documentAbsolutePath != null) {
                    VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                    emojiEntity.entity = mediaEntity2;
                    mediaEntity2.text = emojiEntity.documentAbsolutePath;
                    mediaEntity2.subType = emojiEntity.subType;
                    u5 u5Var = new u5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i15, int i16, float f10, int i17, int i18, int i19, Paint paint) {
                            super.draw(canvas, charSequence, i15, i16, f10, i17, i18, i19, paint);
                            VideoEditedInfo.MediaEntity mediaEntity3 = mediaEntity;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / mediaEntity3.viewWidth) * mediaEntity3.width) + mediaEntity.f16673x;
                            float f11 = mediaEntity3.f16674y;
                            VideoEditedInfo.MediaEntity mediaEntity4 = mediaEntity;
                            float f12 = mediaEntity4.height;
                            float paddingTop = (((((i19 - i17) / 2.0f) + (bVar.getPaddingTop() + i17)) / mediaEntity4.viewHeight) * f12) + f11;
                            if (mediaEntity4.rotation != 0.0f) {
                                float f13 = (mediaEntity4.width / 2.0f) + mediaEntity4.f16673x;
                                float f14 = (f12 / 2.0f) + mediaEntity4.f16674y;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d10 = paddingLeft - f13;
                                double d11 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-mediaEntity.rotation) * d10) - (Math.sin(-mediaEntity.rotation) * d11))) + f13;
                                paddingTop = (((float) k0.a(-mediaEntity.rotation, d11, Math.sin(-mediaEntity.rotation) * d10)) * f15) + f14;
                            }
                            VideoEditedInfo.MediaEntity mediaEntity5 = emojiEntity.entity;
                            int i20 = this.measuredSize;
                            VideoEditedInfo.MediaEntity mediaEntity6 = mediaEntity;
                            float f16 = (i20 / mediaEntity6.viewWidth) * mediaEntity6.width;
                            mediaEntity5.width = f16;
                            float f17 = (i20 / mediaEntity6.viewHeight) * mediaEntity6.height;
                            mediaEntity5.height = f17;
                            mediaEntity5.f16673x = paddingLeft - (f16 / 2.0f);
                            mediaEntity5.f16674y = paddingTop - (f17 / 2.0f);
                            mediaEntity5.rotation = mediaEntity6.rotation;
                            if (mediaEntity5.bitmap == null) {
                                FrameDrawer.this.initStickerEntity(mediaEntity5);
                            }
                        }
                    };
                    int i15 = emojiEntity.offset;
                    spannableString.setSpan(u5Var, i15, emojiEntity.length + i15, 33);
                }
                i13 = i14;
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, bVar.getPaint().getFontMetricsInt(), false);
            if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                    emojiSpan.scale = 0.85f;
                }
            }
            bVar.setText(replaceEmoji);
            bVar.setTextColor(mediaEntity.color);
            int i16 = mediaEntity.textAlign;
            if (i16 != 1) {
                if (i16 != 2) {
                    i10 = 19;
                } else {
                    i10 = 21;
                }
            } else {
                i10 = 17;
            }
            bVar.setGravity(i10);
            int i17 = Build.VERSION.SDK_INT;
            int i18 = mediaEntity.textAlign;
            if (i18 != 1) {
                if (i18 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 4;
            }
            bVar.setTextAlignment(i11);
            bVar.setHorizontallyScrolling(false);
            bVar.setImeOptions(268435456);
            bVar.setFocusableInTouchMode(true);
            bVar.setInputType(bVar.getInputType() | 16384);
            if (i17 >= 23) {
                setBreakStrategy(bVar);
            }
            byte b10 = mediaEntity.subType;
            int i19 = -1;
            if (b10 == 0) {
                bVar.setFrameColor(mediaEntity.color);
                if (AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f) {
                    i19 = -16777216;
                }
                bVar.setTextColor(i19);
            } else if (b10 == 1) {
                if (AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f) {
                    i12 = -1728053248;
                } else {
                    i12 = -1711276033;
                }
                bVar.setFrameColor(i12);
                bVar.setTextColor(mediaEntity.color);
            } else if (b10 == 2) {
                if (AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f) {
                    i19 = -16777216;
                }
                bVar.setFrameColor(i19);
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
            y5 y5Var;
            Matrix matrix = new Matrix();
            mediaEntity.matrix = matrix;
            Bitmap bitmap = mediaEntity.bitmap;
            if (bitmap == null && (y5Var = mediaEntity.animatedFileDrawable) != null) {
                v5 v5Var = y5Var.v;
                bitmap = v5Var != null ? v5Var.f29382b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (mediaEntity.type != 1 && (mediaEntity.subType & 2) != 0) {
                mediaEntity.matrix.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            mediaEntity.matrix.postScale(mediaEntity.width * this.W, mediaEntity.height * this.H);
            mediaEntity.matrix.postTranslate(mediaEntity.f16673x * this.W, mediaEntity.f16674y * this.H);
            mediaEntity.matrix.postRotate((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d), ((mediaEntity.width / 2.0f) + mediaEntity.f16673x) * this.W, ((mediaEntity.height / 2.0f) + mediaEntity.f16674y) * this.H);
        }

        public void draw(Canvas canvas, int i10) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j10 = (1000000000 / this.fps) * i10;
            int size = this.mediaEntities.size();
            for (int i11 = 0; i11 < size; i11++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i11);
                drawEntity(canvas, mediaEntity, mediaEntity.color, j10);
            }
            canvas.restore();
        }

        public void setBreakStrategy(dg.b bVar) {
            bVar.setBreakStrategy(0);
        }
    }

    public static boolean convert(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.WebmEncoder.convert(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, int):boolean");
    }

    private static native long createEncoder(String str, int i10, int i11, int i12, long j10);

    public static native void stop(long j10);

    private static native boolean writeFrame(long j10, ByteBuffer byteBuffer, int i10, int i11);
}
