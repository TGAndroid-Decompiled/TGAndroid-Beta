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
import com.google.android.gms.internal.vision.e2;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import og.m0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.z5;
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

        private void drawEntity(Canvas canvas, VideoEditedInfo.MediaEntity mediaEntity, int i10, long j3) {
            VideoEditedInfo.MediaEntity mediaEntity2;
            Canvas canvas2;
            long j10;
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
                    float f7 = mediaEntity.currentFrame + mediaEntity.framesPerDraw;
                    mediaEntity.currentFrame = f7;
                    if (f7 >= mediaEntity.lottieNative.f21207a[0]) {
                        mediaEntity.currentFrame = 0.0f;
                    }
                }
            } else if (mediaEntity.animatedFileDrawable != null) {
                float f10 = mediaEntity.currentFrame;
                int i12 = (int) f10;
                float f11 = f10 + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f11;
                for (int i13 = (int) f11; i12 != i13; i13--) {
                    mediaEntity.animatedFileDrawable.r(true);
                }
                z5 z5Var = mediaEntity.animatedFileDrawable.v;
                if (z5Var != null) {
                    bitmap = z5Var.f29592b;
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
                            j10 = j3;
                        } else {
                            canvas2 = canvas;
                            j10 = j3;
                            drawEntity(canvas2, mediaEntity2, mediaEntity.color, j10);
                        }
                        i11++;
                        canvas = canvas2;
                        j3 = j10;
                    }
                }
            }
        }

        public void initStickerEntity(VideoEditedInfo.MediaEntity mediaEntity) {
            int i10;
            float f7;
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
                    RLottieNative a2 = RLottieNative.a(mediaEntity.text, null, null, null, 0, null);
                    mediaEntity.lottieNative = a2;
                    if (a2 != null) {
                        f7 = a2.f21207a[1] / this.fps;
                    } else {
                        f7 = 0.0f;
                    }
                    mediaEntity.framesPerDraw = f7;
                } else {
                    return;
                }
            } else if ((b10 & 4) != 0) {
                mediaEntity.looped = false;
                c6 c6Var = new c6(new File(mediaEntity.text), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null, 0, true);
                mediaEntity.animatedFileDrawable = c6Var;
                mediaEntity.framesPerDraw = c6Var.d[5] / this.fps;
                mediaEntity.currentFrame = 1.0f;
                c6Var.r(true);
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
                        float f10 = mediaEntity.f14669x;
                        float f11 = mediaEntity.width;
                        float f12 = (f11 / 2.0f) + f10;
                        float f13 = mediaEntity.f14670y;
                        float f14 = mediaEntity.height;
                        float f15 = (f14 / 2.0f) + f13;
                        float f16 = this.W;
                        float f17 = this.H;
                        float f18 = (f11 * f16) / f17;
                        float f19 = (f14 * f17) / f16;
                        mediaEntity.width = f19;
                        mediaEntity.height = f18;
                        mediaEntity.f14669x = f12 - (f19 / 2.0f);
                        mediaEntity.f14670y = f15 - (f18 / 2.0f);
                    }
                    applyRoundRadius(mediaEntity, mediaEntity.bitmap, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / mediaEntity.bitmap.getHeight();
                    if (width > 1.0f) {
                        float f20 = mediaEntity.height;
                        float f21 = f20 / width;
                        mediaEntity.f14670y = e2.A(f20, f21, 2.0f, mediaEntity.f14670y);
                        mediaEntity.height = f21;
                    } else if (width < 1.0f) {
                        float f22 = mediaEntity.width;
                        float f23 = width * f22;
                        mediaEntity.f14669x = e2.A(f22, f23, 2.0f, mediaEntity.f14669x);
                        mediaEntity.width = f23;
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
            final pg.b bVar = new pg.b(ApplicationLoader.applicationContext);
            bVar.getPaint().setAntiAlias(true);
            bVar.drawAnimatedEmojiDrawables = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            m0 m0Var = mediaEntity.textTypeface;
            if (m0Var != null && (d = m0Var.d()) != null) {
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
                    y5 y5Var = new y5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i15, int i16, float f7, int i17, int i18, int i19, Paint paint) {
                            super.draw(canvas, charSequence, i15, i16, f7, i17, i18, i19, paint);
                            VideoEditedInfo.MediaEntity mediaEntity3 = mediaEntity;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f7)) / mediaEntity3.viewWidth) * mediaEntity3.width) + mediaEntity.f14669x;
                            float f10 = mediaEntity3.f14670y;
                            VideoEditedInfo.MediaEntity mediaEntity4 = mediaEntity;
                            float f11 = mediaEntity4.height;
                            float paddingTop = (((((i19 - i17) / 2.0f) + (bVar.getPaddingTop() + i17)) / mediaEntity4.viewHeight) * f11) + f10;
                            if (mediaEntity4.rotation != 0.0f) {
                                float f12 = (mediaEntity4.width / 2.0f) + mediaEntity4.f14669x;
                                float f13 = (f11 / 2.0f) + mediaEntity4.f14670y;
                                float f14 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d10 = paddingLeft - f12;
                                double d11 = (paddingTop - f13) / f14;
                                paddingLeft = ((float) ((Math.cos(-mediaEntity.rotation) * d10) - (Math.sin(-mediaEntity.rotation) * d11))) + f12;
                                paddingTop = (((float) hc.b.f(-mediaEntity.rotation, d11, Math.sin(-mediaEntity.rotation) * d10)) * f14) + f13;
                            }
                            VideoEditedInfo.MediaEntity mediaEntity5 = emojiEntity.entity;
                            int i20 = this.measuredSize;
                            VideoEditedInfo.MediaEntity mediaEntity6 = mediaEntity;
                            float f15 = (i20 / mediaEntity6.viewWidth) * mediaEntity6.width;
                            mediaEntity5.width = f15;
                            float f16 = (i20 / mediaEntity6.viewHeight) * mediaEntity6.height;
                            mediaEntity5.height = f16;
                            mediaEntity5.f14669x = paddingLeft - (f15 / 2.0f);
                            mediaEntity5.f14670y = paddingTop - (f16 / 2.0f);
                            mediaEntity5.rotation = mediaEntity6.rotation;
                            if (mediaEntity5.bitmap == null) {
                                FrameDrawer.this.initStickerEntity(mediaEntity5);
                            }
                        }
                    };
                    int i15 = emojiEntity.offset;
                    spannableString.setSpan(y5Var, i15, emojiEntity.length + i15, 33);
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
            c6 c6Var;
            Matrix matrix = new Matrix();
            mediaEntity.matrix = matrix;
            Bitmap bitmap = mediaEntity.bitmap;
            if (bitmap == null && (c6Var = mediaEntity.animatedFileDrawable) != null) {
                z5 z5Var = c6Var.v;
                bitmap = z5Var != null ? z5Var.f29592b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (mediaEntity.type != 1 && (mediaEntity.subType & 2) != 0) {
                mediaEntity.matrix.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            mediaEntity.matrix.postScale(mediaEntity.width * this.W, mediaEntity.height * this.H);
            mediaEntity.matrix.postTranslate(mediaEntity.f14669x * this.W, mediaEntity.f14670y * this.H);
            mediaEntity.matrix.postRotate((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d), ((mediaEntity.width / 2.0f) + mediaEntity.f14669x) * this.W, ((mediaEntity.height / 2.0f) + mediaEntity.f14670y) * this.H);
        }

        public void draw(Canvas canvas, int i10) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j3 = (1000000000 / this.fps) * i10;
            int size = this.mediaEntities.size();
            for (int i11 = 0; i11 < size; i11++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i11);
                drawEntity(canvas, mediaEntity, mediaEntity.color, j3);
            }
            canvas.restore();
        }

        public void setBreakStrategy(pg.b bVar) {
            bVar.setBreakStrategy(0);
        }
    }

    public static boolean convert(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.WebmEncoder.convert(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, int):boolean");
    }

    private static native long createEncoder(String str, int i10, int i11, int i12, long j3);

    public static native void stop(long j3);

    private static native boolean writeFrame(long j3, ByteBuffer byteBuffer, int i10, int i11);
}
