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
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.f6;
import org.telegram.messenger.g0;
import org.telegram.messenger.g20;
import org.telegram.messenger.h20;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.p10;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.v5;
import sg.b0;
public class WebmEncoder {

    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<h20> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<h20> arrayList = new ArrayList<>();
            this.mediaEntities = arrayList;
            this.clearPaint = new Paint(1);
            this.bitmapPaint = new Paint(5);
            int i7 = convertVideoParams.resultWidth;
            this.W = i7;
            int i10 = convertVideoParams.resultHeight;
            this.H = i10;
            this.fps = convertVideoParams.framerate;
            Path path = new Path();
            this.clipPath = path;
            path.addRoundRect(new RectF(0.0f, 0.0f, i7, i10), i7 * 0.125f, i10 * 0.125f, Path.Direction.CW);
            this.photo = BitmapFactory.decodeFile(convertVideoParams.videoPath);
            arrayList.addAll(convertVideoParams.mediaEntities);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                h20 h20Var = this.mediaEntities.get(i11);
                byte b10 = h20Var.f22800a;
                if (b10 != 0 && b10 != 2 && b10 != 5) {
                    if (b10 == 1) {
                        initTextEntity(h20Var);
                    }
                } else {
                    initStickerEntity(h20Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(h20 h20Var, Bitmap bitmap, int i7) {
            if (bitmap != null && h20Var != null) {
                if (h20Var.f22816s != 0.0f || i7 != 0) {
                    if (h20Var.L == null) {
                        h20Var.L = new Canvas(bitmap);
                    }
                    if (h20Var.f22816s != 0.0f) {
                        if (this.path == null) {
                            this.path = new Path();
                        }
                        if (this.xRefPaint == null) {
                            Paint paint = new Paint(1);
                            this.xRefPaint = paint;
                            paint.setColor(-16777216);
                            this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * h20Var.f22816s;
                        this.path.rewind();
                        this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                        this.path.toggleInverseFillType();
                        h20Var.L.drawPath(this.path, this.xRefPaint);
                    }
                    if (i7 != 0) {
                        if (this.textColorPaint == null) {
                            Paint paint2 = new Paint(1);
                            this.textColorPaint = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        }
                        this.textColorPaint.setColor(i7);
                        h20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                    }
                }
            }
        }

        private void drawEntity(Canvas canvas, h20 h20Var, int i7, long j3) {
            h20 h20Var2;
            Canvas canvas2;
            long j10;
            Bitmap bitmap;
            RLottieNative rLottieNative = h20Var.D;
            int i10 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap2 = h20Var.G;
                if (bitmap2 != null && h20Var.U > 0 && h20Var.V > 0) {
                    rLottieNative.c((int) h20Var.E, bitmap2, true);
                    Bitmap bitmap3 = h20Var.G;
                    if ((h20Var.f22801b & 8) == 0) {
                        i7 = 0;
                    }
                    applyRoundRadius(h20Var, bitmap3, i7);
                    canvas.drawBitmap(h20Var.G, h20Var.H, this.bitmapPaint);
                    float f10 = h20Var.E + h20Var.F;
                    h20Var.E = f10;
                    if (f10 >= h20Var.D.f31468a[0]) {
                        h20Var.E = 0.0f;
                    }
                }
            } else if (h20Var.J != null) {
                float f11 = h20Var.E;
                int i11 = (int) f11;
                float f12 = f11 + h20Var.F;
                h20Var.E = f12;
                for (int i12 = (int) f12; i11 != i12; i12--) {
                    h20Var.J.r(true);
                }
                s5 s5Var = h20Var.J.f38859w;
                if (s5Var != null) {
                    bitmap = s5Var.f37942b;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, h20Var.H, this.bitmapPaint);
                }
            } else {
                canvas.drawBitmap(h20Var.G, h20Var.H, this.bitmapPaint);
                ArrayList arrayList = h20Var.f22808k;
                if (arrayList != null && !arrayList.isEmpty()) {
                    while (i10 < h20Var.f22808k.size()) {
                        g20 g20Var = (g20) h20Var.f22808k.get(i10);
                        if (g20Var == null || (h20Var2 = g20Var.f22560b) == null) {
                            canvas2 = canvas;
                            j10 = j3;
                        } else {
                            canvas2 = canvas;
                            j10 = j3;
                            drawEntity(canvas2, h20Var2, h20Var.f22809l, j10);
                        }
                        i10++;
                        canvas = canvas2;
                        j3 = j10;
                    }
                }
            }
        }

        public void initStickerEntity(h20 h20Var) {
            int i7;
            float f10;
            int i10 = (int) (h20Var.f22804f * this.W);
            h20Var.U = i10;
            int i11 = (int) (h20Var.f22805g * this.H);
            h20Var.V = i11;
            if (i10 > 512) {
                h20Var.V = (int) ((i11 / i10) * 512.0f);
                h20Var.U = 512;
            }
            int i12 = h20Var.V;
            if (i12 > 512) {
                h20Var.U = (int) ((h20Var.U / i12) * 512.0f);
                h20Var.V = 512;
            }
            byte b10 = h20Var.f22801b;
            if ((b10 & 1) != 0) {
                int i13 = h20Var.U;
                if (i13 > 0 && (i7 = h20Var.V) > 0) {
                    h20Var.G = Bitmap.createBitmap(i13, i7, Bitmap.Config.ARGB_8888);
                    RLottieNative a10 = RLottieNative.a(h20Var.f22807j, null, null, null, 0, null);
                    h20Var.D = a10;
                    if (a10 != null) {
                        f10 = a10.f31468a[1] / this.fps;
                    } else {
                        f10 = 0.0f;
                    }
                    h20Var.F = f10;
                } else {
                    return;
                }
            } else if ((b10 & 4) != 0) {
                h20Var.K = false;
                v5 v5Var = new v5(new File(h20Var.f22807j), true, 0L, 0, null, null, null, 0L, p10.f24459s0, true, 512, 512, null, 0, true);
                h20Var.J = v5Var;
                h20Var.F = v5Var.d[5] / this.fps;
                h20Var.E = 1.0f;
                v5Var.r(true);
            } else {
                String str = h20Var.f22807j;
                if (!TextUtils.isEmpty(h20Var.f22817t) && (h20Var.f22801b & 16) != 0) {
                    str = h20Var.f22817t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (h20Var.f22800a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                h20Var.G = decodeFile;
                if (h20Var.f22800a == 2 && decodeFile != null) {
                    h20Var.f22816s = g0.L(12.0f) / Math.min(h20Var.f22814q, h20Var.f22815r);
                    Pair N0 = g0.N0(h20Var.f22807j);
                    h20Var.f22803e = (float) (h20Var.f22803e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f11 = h20Var.f22802c;
                        float f12 = h20Var.f22804f;
                        float f13 = (f12 / 2.0f) + f11;
                        float f14 = h20Var.d;
                        float f15 = h20Var.f22805g;
                        float f16 = (f15 / 2.0f) + f14;
                        float f17 = this.W;
                        float f18 = this.H;
                        float f19 = (f12 * f17) / f18;
                        float f20 = (f15 * f18) / f17;
                        h20Var.f22804f = f20;
                        h20Var.f22805g = f19;
                        h20Var.f22802c = f13 - (f20 / 2.0f);
                        h20Var.d = f16 - (f19 / 2.0f);
                    }
                    applyRoundRadius(h20Var, h20Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / h20Var.G.getHeight();
                    if (width > 1.0f) {
                        float f21 = h20Var.f22805g;
                        float f22 = f21 / width;
                        h20Var.d = com.google.android.recaptcha.internal.a.A(f21, f22, 2.0f, h20Var.d);
                        h20Var.f22805g = f22;
                    } else if (width < 1.0f) {
                        float f23 = h20Var.f22804f;
                        float f24 = width * f23;
                        h20Var.f22802c = com.google.android.recaptcha.internal.a.A(f23, f24, 2.0f, h20Var.f22802c);
                        h20Var.f22804f = f24;
                    }
                }
            }
            setupMatrix(h20Var);
        }

        private void initTextEntity(final h20 h20Var) {
            int i7;
            int i10;
            int i11;
            f6[] f6VarArr;
            Typeface d;
            final tg.b bVar = new tg.b(t0.f25555b);
            bVar.getPaint().setAntiAlias(true);
            bVar.G = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
            b0 b0Var = h20Var.f22811n;
            if (b0Var != null && (d = b0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, h20Var.f22810m);
            SpannableString spannableString = new SpannableString(h20Var.f22807j);
            ArrayList arrayList = h20Var.f22808k;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                final g20 g20Var = (g20) arrayList.get(i12);
                if (g20Var.f22559a != null) {
                    h20 h20Var2 = new h20();
                    g20Var.f22560b = h20Var2;
                    h20Var2.f22807j = g20Var.f22559a;
                    h20Var2.f22801b = g20Var.f22561c;
                    r5 r5Var = new r5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f10, int i16, int i17, int i18, Paint paint) {
                            super.draw(canvas, charSequence, i14, i15, f10, i16, i17, i18, paint);
                            h20 h20Var3 = h20Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / h20Var3.f22814q) * h20Var3.f22804f) + h20Var.f22802c;
                            float f11 = h20Var3.d;
                            h20 h20Var4 = h20Var;
                            float f12 = h20Var4.f22805g;
                            float paddingTop = (((((i18 - i16) / 2.0f) + (bVar.getPaddingTop() + i16)) / h20Var4.f22815r) * f12) + f11;
                            if (h20Var4.f22803e != 0.0f) {
                                float f13 = (h20Var4.f22804f / 2.0f) + h20Var4.f22802c;
                                float f14 = (f12 / 2.0f) + h20Var4.d;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d2 = paddingLeft - f13;
                                double d10 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-h20Var.f22803e) * d2) - (Math.sin(-h20Var.f22803e) * d10))) + f13;
                                paddingTop = (((float) jg.g.d(-h20Var.f22803e, d10, Math.sin(-h20Var.f22803e) * d2)) * f15) + f14;
                            }
                            h20 h20Var5 = g20Var.f22560b;
                            int i19 = this.measuredSize;
                            h20 h20Var6 = h20Var;
                            float f16 = (i19 / h20Var6.f22814q) * h20Var6.f22804f;
                            h20Var5.f22804f = f16;
                            float f17 = (i19 / h20Var6.f22815r) * h20Var6.f22805g;
                            h20Var5.f22805g = f17;
                            h20Var5.f22802c = paddingLeft - (f16 / 2.0f);
                            h20Var5.d = paddingTop - (f17 / 2.0f);
                            h20Var5.f22803e = h20Var6.f22803e;
                            if (h20Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(h20Var5);
                            }
                        }
                    };
                    int i14 = g20Var.offset;
                    spannableString.setSpan(r5Var, i14, g20Var.length + i14, 33);
                }
                i12 = i13;
            }
            CharSequence m10 = i6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (f6VarArr = (f6[]) ((Spanned) m10).getSpans(0, m10.length(), f6.class)) != null) {
                for (f6 f6Var : f6VarArr) {
                    f6Var.f22344b = 0.85f;
                }
            }
            bVar.setText(m10);
            bVar.setTextColor(h20Var.f22809l);
            int i15 = h20Var.f22813p;
            if (i15 != 1) {
                if (i15 != 2) {
                    i7 = 19;
                } else {
                    i7 = 21;
                }
            } else {
                i7 = 17;
            }
            bVar.setGravity(i7);
            int i16 = h20Var.f22813p;
            if (i16 != 1) {
                if (i16 == 2 ? !hd.f22871a0 : hd.f22871a0) {
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
            setBreakStrategy(bVar);
            byte b10 = h20Var.f22801b;
            int i17 = -1;
            if (b10 == 0) {
                bVar.setFrameColor(h20Var.f22809l);
                if (g0.B(h20Var.f22809l) >= 0.721f) {
                    i17 = -16777216;
                }
                bVar.setTextColor(i17);
            } else if (b10 == 1) {
                if (g0.B(h20Var.f22809l) >= 0.25f) {
                    i11 = -1728053248;
                } else {
                    i11 = -1711276033;
                }
                bVar.setFrameColor(i11);
                bVar.setTextColor(h20Var.f22809l);
            } else if (b10 == 2) {
                if (g0.B(h20Var.f22809l) >= 0.25f) {
                    i17 = -16777216;
                }
                bVar.setFrameColor(i17);
                bVar.setTextColor(h20Var.f22809l);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(h20Var.f22809l);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(h20Var.f22814q, 1073741824), View.MeasureSpec.makeMeasureSpec(h20Var.f22815r, 1073741824));
            bVar.layout(0, 0, h20Var.f22814q, h20Var.f22815r);
            h20Var.G = Bitmap.createBitmap(h20Var.f22814q, h20Var.f22815r, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(h20Var.G));
            setupMatrix(h20Var);
        }

        private void setupMatrix(h20 h20Var) {
            v5 v5Var;
            Matrix matrix = new Matrix();
            h20Var.H = matrix;
            Bitmap bitmap = h20Var.G;
            if (bitmap == null && (v5Var = h20Var.J) != null) {
                s5 s5Var = v5Var.f38859w;
                bitmap = s5Var != null ? s5Var.f37942b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (h20Var.f22800a != 1 && (h20Var.f22801b & 2) != 0) {
                h20Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            h20Var.H.postScale(h20Var.f22804f * this.W, h20Var.f22805g * this.H);
            h20Var.H.postTranslate(h20Var.f22802c * this.W, h20Var.d * this.H);
            h20Var.H.postRotate((float) (((-h20Var.f22803e) / 3.141592653589793d) * 180.0d), ((h20Var.f22804f / 2.0f) + h20Var.f22802c) * this.W, ((h20Var.f22805g / 2.0f) + h20Var.d) * this.H);
        }

        public void draw(Canvas canvas, int i7) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j3 = (1000000000 / this.fps) * i7;
            int size = this.mediaEntities.size();
            for (int i10 = 0; i10 < size; i10++) {
                h20 h20Var = this.mediaEntities.get(i10);
                drawEntity(canvas, h20Var, h20Var.f22809l, j3);
            }
            canvas.restore();
        }

        public void setBreakStrategy(tg.b bVar) {
            bVar.setBreakStrategy(0);
        }
    }

    public static boolean convert(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.WebmEncoder.convert(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, int):boolean");
    }

    private static native long createEncoder(String str, int i7, int i10, int i11, long j3);

    public static native void stop(long j3);

    private static native boolean writeFrame(long j3, ByteBuffer byteBuffer, int i7, int i10);
}
