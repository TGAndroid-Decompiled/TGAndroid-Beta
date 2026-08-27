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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.x5;
import yf.i0;

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
                if (b10 == 0 || b10 == 2 || b10 == 5) {
                    initStickerEntity(mediaEntity);
                } else if (b10 == 1) {
                    initTextEntity(mediaEntity);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(VideoEditedInfo.MediaEntity mediaEntity, Bitmap bitmap, int i10) {
            if (bitmap == null || mediaEntity == null) {
                return;
            }
            if (mediaEntity.roundRadius == 0.0f && i10 == 0) {
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

        private void drawEntity(Canvas canvas, VideoEditedInfo.MediaEntity mediaEntity, int i10, long j10) {
            VideoEditedInfo.MediaEntity mediaEntity2;
            Canvas canvas2;
            long j11;
            RLottieNative rLottieNative = mediaEntity.lottieNative;
            int i11 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap = mediaEntity.bitmap;
                if (bitmap == null || mediaEntity.W <= 0 || mediaEntity.H <= 0) {
                    return;
                }
                rLottieNative.c((int) mediaEntity.currentFrame, bitmap, true);
                Bitmap bitmap2 = mediaEntity.bitmap;
                if ((mediaEntity.subType & 8) == 0) {
                    i10 = 0;
                }
                applyRoundRadius(mediaEntity, bitmap2, i10);
                canvas.drawBitmap(mediaEntity.bitmap, mediaEntity.matrix, this.bitmapPaint);
                float f10 = mediaEntity.currentFrame + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f10;
                if (f10 >= mediaEntity.lottieNative.f26461a[0]) {
                    mediaEntity.currentFrame = 0.0f;
                    return;
                }
                return;
            }
            if (mediaEntity.animatedFileDrawable != null) {
                float f11 = mediaEntity.currentFrame;
                int i12 = (int) f11;
                float f12 = f11 + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f12;
                for (int i13 = (int) f12; i12 != i13; i13--) {
                    mediaEntity.animatedFileDrawable.r(true);
                }
                u5 u5Var = mediaEntity.animatedFileDrawable.v;
                Bitmap bitmap3 = u5Var != null ? u5Var.f32971b : null;
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

        public void initStickerEntity(VideoEditedInfo.MediaEntity mediaEntity) {
            int i10;
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
                if (i14 <= 0 || (i10 = mediaEntity.H) <= 0) {
                    return;
                }
                mediaEntity.bitmap = Bitmap.createBitmap(i14, i10, Bitmap.Config.ARGB_8888);
                RLottieNative rLottieNativeA = RLottieNative.a(mediaEntity.text, null, mediaEntity.W, mediaEntity.H, null, false, null, false, 0, null);
                mediaEntity.lottieNative = rLottieNativeA;
                mediaEntity.framesPerDraw = rLottieNativeA != null ? rLottieNativeA.f26461a[1] / this.fps : 0.0f;
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
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                mediaEntity.bitmap = bitmapDecodeFile;
                if (mediaEntity.type == 2 && bitmapDecodeFile != null) {
                    mediaEntity.roundRadius = AndroidUtilities.dp(12.0f) / Math.min(mediaEntity.viewWidth, mediaEntity.viewHeight);
                    Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(mediaEntity.text);
                    mediaEntity.rotation = (float) (((double) mediaEntity.rotation) - Math.toRadians(((Integer) imageOrientation.first).intValue()));
                    if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
                        float f10 = mediaEntity.f19646x;
                        float f11 = mediaEntity.width;
                        float f12 = (f11 / 2.0f) + f10;
                        float f13 = mediaEntity.f19647y;
                        float f14 = mediaEntity.height;
                        float f15 = (f14 / 2.0f) + f13;
                        float f16 = this.W;
                        float f17 = this.H;
                        float f18 = (f11 * f16) / f17;
                        float f19 = (f14 * f17) / f16;
                        mediaEntity.width = f19;
                        mediaEntity.height = f18;
                        mediaEntity.f19646x = f12 - (f19 / 2.0f);
                        mediaEntity.f19647y = f15 - (f18 / 2.0f);
                    }
                    applyRoundRadius(mediaEntity, mediaEntity.bitmap, 0);
                } else if (bitmapDecodeFile != null) {
                    float width = bitmapDecodeFile.getWidth() / mediaEntity.bitmap.getHeight();
                    if (width > 1.0f) {
                        float f20 = mediaEntity.height;
                        float f21 = f20 / width;
                        mediaEntity.f19647y = com.google.android.recaptcha.internal.a.A(f20, f21, 2.0f, mediaEntity.f19647y);
                        mediaEntity.height = f21;
                    } else if (width < 1.0f) {
                        float f22 = mediaEntity.width;
                        float f23 = width * f22;
                        mediaEntity.f19646x = com.google.android.recaptcha.internal.a.A(f22, f23, 2.0f, mediaEntity.f19646x);
                        mediaEntity.width = f23;
                    }
                }
            }
            setupMatrix(mediaEntity);
        }

        private void initTextEntity(final VideoEditedInfo.MediaEntity mediaEntity) {
            Emoji.EmojiSpan[] emojiSpanArr;
            Typeface typefaceD;
            final zf.b bVar = new zf.b(ApplicationLoader.applicationContext);
            bVar.getPaint().setAntiAlias(true);
            bVar.drawAnimatedEmojiDrawables = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            i0 i0Var = mediaEntity.textTypeface;
            if (i0Var != null && (typefaceD = i0Var.d()) != null) {
                bVar.setTypeface(typefaceD);
            }
            bVar.setTextSize(0, mediaEntity.fontSize);
            SpannableString spannableString = new SpannableString(mediaEntity.text);
            ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                final VideoEditedInfo.EmojiEntity emojiEntity = arrayList.get(i10);
                if (emojiEntity.documentAbsolutePath != null) {
                    VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                    emojiEntity.entity = mediaEntity2;
                    mediaEntity2.text = emojiEntity.documentAbsolutePath;
                    mediaEntity2.subType = emojiEntity.subType;
                    t5 t5Var = new t5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i12, int i13, float f10, int i14, int i15, int i16, Paint paint) {
                            super.draw(canvas, charSequence, i12, i13, f10, i14, i15, i16, paint);
                            float f11 = mediaEntity.f19646x;
                            float paddingLeft = (this.measuredSize / 2.0f) + bVar.getPaddingLeft() + f10;
                            VideoEditedInfo.MediaEntity mediaEntity3 = mediaEntity;
                            float fCos = ((paddingLeft / mediaEntity3.viewWidth) * mediaEntity3.width) + f11;
                            float f12 = mediaEntity3.f19647y;
                            float paddingTop = ((i16 - i14) / 2.0f) + bVar.getPaddingTop() + i14;
                            VideoEditedInfo.MediaEntity mediaEntity4 = mediaEntity;
                            float f13 = paddingTop / mediaEntity4.viewHeight;
                            float f14 = mediaEntity4.height;
                            float fB = (f13 * f14) + f12;
                            if (mediaEntity4.rotation != 0.0f) {
                                float f15 = (mediaEntity4.width / 2.0f) + mediaEntity4.f19646x;
                                float f16 = (f14 / 2.0f) + mediaEntity4.f19647y;
                                float f17 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d = fCos - f15;
                                double d10 = (fB - f16) / f17;
                                fCos = ((float) ((Math.cos(-mediaEntity.rotation) * d) - (Math.sin(-mediaEntity.rotation) * d10))) + f15;
                                fB = (((float) i0.a.b(-mediaEntity.rotation, d10, Math.sin(-mediaEntity.rotation) * d)) * f17) + f16;
                            }
                            VideoEditedInfo.MediaEntity mediaEntity5 = emojiEntity.entity;
                            int i17 = this.measuredSize;
                            VideoEditedInfo.MediaEntity mediaEntity6 = mediaEntity;
                            float f18 = (i17 / mediaEntity6.viewWidth) * mediaEntity6.width;
                            mediaEntity5.width = f18;
                            float f19 = (i17 / mediaEntity6.viewHeight) * mediaEntity6.height;
                            mediaEntity5.height = f19;
                            mediaEntity5.f19646x = fCos - (f18 / 2.0f);
                            mediaEntity5.f19647y = fB - (f19 / 2.0f);
                            mediaEntity5.rotation = mediaEntity6.rotation;
                            if (mediaEntity5.bitmap == null) {
                                FrameDrawer.this.initStickerEntity(mediaEntity5);
                            }
                        }
                    };
                    int i12 = emojiEntity.offset;
                    spannableString.setSpan(t5Var, i12, emojiEntity.length + i12, 33);
                }
                i10 = i11;
            }
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableString, bVar.getPaint().getFontMetricsInt(), false);
            if ((charSequenceReplaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) charSequenceReplaceEmoji).getSpans(0, charSequenceReplaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                    emojiSpan.scale = 0.85f;
                }
            }
            bVar.setText(charSequenceReplaceEmoji);
            bVar.setTextColor(mediaEntity.color);
            int i13 = mediaEntity.textAlign;
            bVar.setGravity(i13 != 1 ? i13 != 2 ? 19 : 21 : 17);
            int i14 = Build.VERSION.SDK_INT;
            int i15 = mediaEntity.textAlign;
            bVar.setTextAlignment(i15 != 1 ? (i15 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) ? 3 : 2 : 4);
            bVar.setHorizontallyScrolling(false);
            bVar.setImeOptions(268435456);
            bVar.setFocusableInTouchMode(true);
            bVar.setInputType(bVar.getInputType() | 16384);
            if (i14 >= 23) {
                setBreakStrategy(bVar);
            }
            byte b10 = mediaEntity.subType;
            if (b10 == 0) {
                bVar.setFrameColor(mediaEntity.color);
                bVar.setTextColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f ? -16777216 : -1);
            } else if (b10 == 1) {
                bVar.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -1728053248 : -1711276033);
                bVar.setTextColor(mediaEntity.color);
            } else if (b10 == 2) {
                bVar.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -16777216 : -1);
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
                bitmap = u5Var != null ? u5Var.f32971b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (mediaEntity.type != 1 && (mediaEntity.subType & 2) != 0) {
                mediaEntity.matrix.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            mediaEntity.matrix.postScale(mediaEntity.width * this.W, mediaEntity.height * this.H);
            mediaEntity.matrix.postTranslate(mediaEntity.f19646x * this.W, mediaEntity.f19647y * this.H);
            mediaEntity.matrix.postRotate((float) ((((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d), ((mediaEntity.width / 2.0f) + mediaEntity.f19646x) * this.W, ((mediaEntity.height / 2.0f) + mediaEntity.f19647y) * this.H);
        }

        public void draw(Canvas canvas, int i10) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j10 = (1000000000 / ((long) this.fps)) * ((long) i10);
            int size = this.mediaEntities.size();
            for (int i11 = 0; i11 < size; i11++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i11);
                drawEntity(canvas, mediaEntity, mediaEntity.color, j10);
            }
            canvas.restore();
        }

        public void setBreakStrategy(zf.b bVar) {
            bVar.setBreakStrategy(0);
        }
    }

    public static boolean convert(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams, int i10) throws Throwable {
        boolean z10;
        long length;
        MediaController.VideoConvertorListener videoConvertorListener;
        Bitmap bitmap;
        MediaController.VideoConvertorListener videoConvertorListener2;
        int i11 = convertVideoParams.resultWidth;
        int i12 = convertVideoParams.resultHeight;
        long jCreateEncoder = createEncoder(convertVideoParams.cacheFile.getAbsolutePath(), i11, i12, convertVideoParams.framerate, convertVideoParams.bitrate);
        boolean z11 = true;
        if (jCreateEncoder == 0) {
            return true;
        }
        Bitmap bitmapCreateBitmap = null;
        try {
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                try {
                    try {
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmapCreateBitmap.getByteCount());
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        FrameDrawer frameDrawer = new FrameDrawer(convertVideoParams);
                        int iCeil = (int) Math.ceil((convertVideoParams.duration / 1000.0d) * ((double) convertVideoParams.framerate));
                        int i13 = 0;
                        while (i13 < iCeil) {
                            frameDrawer.draw(canvas, i13);
                            bitmapCreateBitmap.copyPixelsToBuffer(byteBufferAllocateDirect);
                            byteBufferAllocateDirect.flip();
                            if (!writeFrame(jCreateEncoder, byteBufferAllocateDirect, i11, i12)) {
                                FileLog.d("webm writeFile error at " + i13 + "/" + iCeil);
                                stop(jCreateEncoder);
                                bitmapCreateBitmap.recycle();
                                return z11;
                            }
                            MediaController.VideoConvertorListener videoConvertorListener3 = convertVideoParams.callback;
                            if (videoConvertorListener3 != null) {
                                try {
                                    bitmap = bitmapCreateBitmap;
                                    try {
                                        videoConvertorListener3.didWriteData(Math.min(261120L, convertVideoParams.cacheFile.length()), i13 / iCeil);
                                    } catch (Exception e9) {
                                        e = e9;
                                        bitmapCreateBitmap = bitmap;
                                        FileLog.e(e);
                                        stop(jCreateEncoder);
                                        if (bitmapCreateBitmap != null) {
                                            bitmapCreateBitmap.recycle();
                                        }
                                        z10 = true;
                                        length = convertVideoParams.cacheFile.length();
                                        if (i10 > 0) {
                                        }
                                        videoConvertorListener = convertVideoParams.callback;
                                        if (videoConvertorListener != null) {
                                            videoConvertorListener.didWriteData(length, 1.0f);
                                        }
                                        FileLog.d("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i10);
                                        return z10;
                                    } catch (Throwable th) {
                                        th = th;
                                        bitmapCreateBitmap = bitmap;
                                        stop(jCreateEncoder);
                                        if (bitmapCreateBitmap != null) {
                                            bitmapCreateBitmap.recycle();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                }
                            } else {
                                bitmap = bitmapCreateBitmap;
                            }
                            if (i13 % 3 == 0 && (videoConvertorListener2 = convertVideoParams.callback) != null) {
                                videoConvertorListener2.checkConversionCanceled();
                            }
                            i13++;
                            bitmapCreateBitmap = bitmap;
                            i11 = i11;
                            z11 = true;
                        }
                        stop(jCreateEncoder);
                        bitmapCreateBitmap.recycle();
                        z10 = false;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e11) {
                    e = e11;
                    FileLog.e(e);
                    stop(jCreateEncoder);
                    if (bitmapCreateBitmap != null) {
                        bitmapCreateBitmap.recycle();
                    }
                    z10 = true;
                    length = convertVideoParams.cacheFile.length();
                    if (i10 > 0) {
                    }
                    videoConvertorListener = convertVideoParams.callback;
                    if (videoConvertorListener != null) {
                        videoConvertorListener.didWriteData(length, 1.0f);
                    }
                    FileLog.d("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i10);
                    return z10;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
        }
        length = convertVideoParams.cacheFile.length();
        if (i10 > 0 || length <= 261120) {
            videoConvertorListener = convertVideoParams.callback;
            if (videoConvertorListener != null) {
                videoConvertorListener.didWriteData(length, 1.0f);
            }
            FileLog.d("webm encoded to " + convertVideoParams.cacheFile + " with size=" + length + " triesLeft=" + i10);
            return z10;
        }
        int i14 = convertVideoParams.bitrate;
        convertVideoParams.bitrate = (int) ((261120.0f / length) * 0.9f * i14);
        convertVideoParams.cacheFile.delete();
        FileLog.d("webm encoded too much, got " + length + ", old bitrate = " + i14 + " new bitrate = " + convertVideoParams.bitrate);
        return convert(convertVideoParams, i10 - 1);
    }

    private static native long createEncoder(String str, int i10, int i11, int i12, long j10);

    public static native void stop(long j10);

    private static native boolean writeFrame(long j10, ByteBuffer byteBuffer, int i10, int i11);
}
