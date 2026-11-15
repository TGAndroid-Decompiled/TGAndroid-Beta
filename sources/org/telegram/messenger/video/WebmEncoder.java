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
import com.google.android.gms.internal.vision.e2;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.e20;
import org.telegram.messenger.g0;
import org.telegram.messenger.g6;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.m10;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.t5;
import sg.a0;
public class WebmEncoder {

    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<e20> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<e20> arrayList = new ArrayList<>();
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
                e20 e20Var = this.mediaEntities.get(i11);
                byte b10 = e20Var.f23224a;
                if (b10 != 0 && b10 != 2 && b10 != 5) {
                    if (b10 == 1) {
                        initTextEntity(e20Var);
                    }
                } else {
                    initStickerEntity(e20Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(e20 e20Var, Bitmap bitmap, int i7) {
            if (bitmap != null && e20Var != null) {
                if (e20Var.f23240s != 0.0f || i7 != 0) {
                    if (e20Var.L == null) {
                        e20Var.L = new Canvas(bitmap);
                    }
                    if (e20Var.f23240s != 0.0f) {
                        if (this.path == null) {
                            this.path = new Path();
                        }
                        if (this.xRefPaint == null) {
                            Paint paint = new Paint(1);
                            this.xRefPaint = paint;
                            paint.setColor(-16777216);
                            this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * e20Var.f23240s;
                        this.path.rewind();
                        this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                        this.path.toggleInverseFillType();
                        e20Var.L.drawPath(this.path, this.xRefPaint);
                    }
                    if (i7 != 0) {
                        if (this.textColorPaint == null) {
                            Paint paint2 = new Paint(1);
                            this.textColorPaint = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        }
                        this.textColorPaint.setColor(i7);
                        e20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                    }
                }
            }
        }

        private void drawEntity(Canvas canvas, e20 e20Var, int i7, long j3) {
            e20 e20Var2;
            Canvas canvas2;
            long j10;
            Bitmap bitmap;
            RLottieNative rLottieNative = e20Var.D;
            int i10 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap2 = e20Var.G;
                if (bitmap2 != null && e20Var.U > 0 && e20Var.V > 0) {
                    rLottieNative.c((int) e20Var.E, bitmap2, true);
                    Bitmap bitmap3 = e20Var.G;
                    if ((e20Var.f23225b & 8) == 0) {
                        i7 = 0;
                    }
                    applyRoundRadius(e20Var, bitmap3, i7);
                    canvas.drawBitmap(e20Var.G, e20Var.H, this.bitmapPaint);
                    float f10 = e20Var.E + e20Var.F;
                    e20Var.E = f10;
                    if (f10 >= e20Var.D.f32652a[0]) {
                        e20Var.E = 0.0f;
                    }
                }
            } else if (e20Var.J != null) {
                float f11 = e20Var.E;
                int i11 = (int) f11;
                float f12 = f11 + e20Var.F;
                e20Var.E = f12;
                for (int i12 = (int) f12; i11 != i12; i12--) {
                    e20Var.J.r(true);
                }
                q5 q5Var = e20Var.J.f39537w;
                if (q5Var != null) {
                    bitmap = q5Var.f38521b;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, e20Var.H, this.bitmapPaint);
                }
            } else {
                canvas.drawBitmap(e20Var.G, e20Var.H, this.bitmapPaint);
                ArrayList arrayList = e20Var.f23232k;
                if (arrayList != null && !arrayList.isEmpty()) {
                    while (i10 < e20Var.f23232k.size()) {
                        d20 d20Var = (d20) e20Var.f23232k.get(i10);
                        if (d20Var == null || (e20Var2 = d20Var.f23017b) == null) {
                            canvas2 = canvas;
                            j10 = j3;
                        } else {
                            canvas2 = canvas;
                            j10 = j3;
                            drawEntity(canvas2, e20Var2, e20Var.f23233l, j10);
                        }
                        i10++;
                        canvas = canvas2;
                        j3 = j10;
                    }
                }
            }
        }

        public void initStickerEntity(e20 e20Var) {
            int i7;
            float f10;
            int i10 = (int) (e20Var.f23228f * this.W);
            e20Var.U = i10;
            int i11 = (int) (e20Var.f23229g * this.H);
            e20Var.V = i11;
            if (i10 > 512) {
                e20Var.V = (int) ((i11 / i10) * 512.0f);
                e20Var.U = 512;
            }
            int i12 = e20Var.V;
            if (i12 > 512) {
                e20Var.U = (int) ((e20Var.U / i12) * 512.0f);
                e20Var.V = 512;
            }
            byte b10 = e20Var.f23225b;
            if ((b10 & 1) != 0) {
                int i13 = e20Var.U;
                if (i13 > 0 && (i7 = e20Var.V) > 0) {
                    e20Var.G = Bitmap.createBitmap(i13, i7, Bitmap.Config.ARGB_8888);
                    RLottieNative a10 = RLottieNative.a(e20Var.f23231j, null, null, null, 0, null);
                    e20Var.D = a10;
                    if (a10 != null) {
                        f10 = a10.f32652a[1] / this.fps;
                    } else {
                        f10 = 0.0f;
                    }
                    e20Var.F = f10;
                } else {
                    return;
                }
            } else if ((b10 & 4) != 0) {
                e20Var.K = false;
                t5 t5Var = new t5(new File(e20Var.f23231j), true, 0L, 0, null, null, null, 0L, m10.f24934t0, true, 512, 512, null, 0, true);
                e20Var.J = t5Var;
                e20Var.F = t5Var.d[5] / this.fps;
                e20Var.E = 1.0f;
                t5Var.r(true);
            } else {
                String str = e20Var.f23231j;
                if (!TextUtils.isEmpty(e20Var.f23241t) && (e20Var.f23225b & 16) != 0) {
                    str = e20Var.f23241t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (e20Var.f23224a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                e20Var.G = decodeFile;
                if (e20Var.f23224a == 2 && decodeFile != null) {
                    e20Var.f23240s = g0.L(12.0f) / Math.min(e20Var.f23238q, e20Var.f23239r);
                    Pair N0 = g0.N0(e20Var.f23231j);
                    e20Var.f23227e = (float) (e20Var.f23227e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f11 = e20Var.f23226c;
                        float f12 = e20Var.f23228f;
                        float f13 = (f12 / 2.0f) + f11;
                        float f14 = e20Var.d;
                        float f15 = e20Var.f23229g;
                        float f16 = (f15 / 2.0f) + f14;
                        float f17 = this.W;
                        float f18 = this.H;
                        float f19 = (f12 * f17) / f18;
                        float f20 = (f15 * f18) / f17;
                        e20Var.f23228f = f20;
                        e20Var.f23229g = f19;
                        e20Var.f23226c = f13 - (f20 / 2.0f);
                        e20Var.d = f16 - (f19 / 2.0f);
                    }
                    applyRoundRadius(e20Var, e20Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / e20Var.G.getHeight();
                    if (width > 1.0f) {
                        float f21 = e20Var.f23229g;
                        float f22 = f21 / width;
                        e20Var.d = e2.A(f21, f22, 2.0f, e20Var.d);
                        e20Var.f23229g = f22;
                    } else if (width < 1.0f) {
                        float f23 = e20Var.f23228f;
                        float f24 = width * f23;
                        e20Var.f23226c = e2.A(f23, f24, 2.0f, e20Var.f23226c);
                        e20Var.f23228f = f24;
                    }
                }
            }
            setupMatrix(e20Var);
        }

        private void initTextEntity(final e20 e20Var) {
            int i7;
            int i10;
            int i11;
            g6[] g6VarArr;
            Typeface d;
            final tg.b bVar = new tg.b(t0.f26600b);
            bVar.getPaint().setAntiAlias(true);
            bVar.H = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
            a0 a0Var = e20Var.f23235n;
            if (a0Var != null && (d = a0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, e20Var.f23234m);
            SpannableString spannableString = new SpannableString(e20Var.f23231j);
            ArrayList arrayList = e20Var.f23232k;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                final d20 d20Var = (d20) arrayList.get(i12);
                if (d20Var.f23016a != null) {
                    e20 e20Var2 = new e20();
                    d20Var.f23017b = e20Var2;
                    e20Var2.f23231j = d20Var.f23016a;
                    e20Var2.f23225b = d20Var.f23018c;
                    p5 p5Var = new p5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f10, int i16, int i17, int i18, Paint paint) {
                            super.draw(canvas, charSequence, i14, i15, f10, i16, i17, i18, paint);
                            e20 e20Var3 = e20Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / e20Var3.f23238q) * e20Var3.f23228f) + e20Var.f23226c;
                            float f11 = e20Var3.d;
                            e20 e20Var4 = e20Var;
                            float f12 = e20Var4.f23229g;
                            float paddingTop = (((((i18 - i16) / 2.0f) + (bVar.getPaddingTop() + i16)) / e20Var4.f23239r) * f12) + f11;
                            if (e20Var4.f23227e != 0.0f) {
                                float f13 = (e20Var4.f23228f / 2.0f) + e20Var4.f23226c;
                                float f14 = (f12 / 2.0f) + e20Var4.d;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d2 = paddingLeft - f13;
                                double d10 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-e20Var.f23227e) * d2) - (Math.sin(-e20Var.f23227e) * d10))) + f13;
                                paddingTop = (((float) i5.c.c(-e20Var.f23227e, d10, Math.sin(-e20Var.f23227e) * d2)) * f15) + f14;
                            }
                            e20 e20Var5 = d20Var.f23017b;
                            int i19 = this.measuredSize;
                            e20 e20Var6 = e20Var;
                            float f16 = (i19 / e20Var6.f23238q) * e20Var6.f23228f;
                            e20Var5.f23228f = f16;
                            float f17 = (i19 / e20Var6.f23239r) * e20Var6.f23229g;
                            e20Var5.f23229g = f17;
                            e20Var5.f23226c = paddingLeft - (f16 / 2.0f);
                            e20Var5.d = paddingTop - (f17 / 2.0f);
                            e20Var5.f23227e = e20Var6.f23227e;
                            if (e20Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(e20Var5);
                            }
                        }
                    };
                    int i14 = d20Var.offset;
                    spannableString.setSpan(p5Var, i14, d20Var.length + i14, 33);
                }
                i12 = i13;
            }
            CharSequence m10 = j6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (g6VarArr = (g6[]) ((Spanned) m10).getSpans(0, m10.length(), g6.class)) != null) {
                for (g6 g6Var : g6VarArr) {
                    g6Var.f23694b = 0.85f;
                }
            }
            bVar.setText(m10);
            bVar.setTextColor(e20Var.f23233l);
            int i15 = e20Var.f23237p;
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
            int i16 = e20Var.f23237p;
            if (i16 != 1) {
                if (i16 == 2 ? !hd.f24101a0 : hd.f24101a0) {
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
            byte b10 = e20Var.f23225b;
            int i17 = -1;
            if (b10 == 0) {
                bVar.setFrameColor(e20Var.f23233l);
                if (g0.B(e20Var.f23233l) >= 0.721f) {
                    i17 = -16777216;
                }
                bVar.setTextColor(i17);
            } else if (b10 == 1) {
                if (g0.B(e20Var.f23233l) >= 0.25f) {
                    i11 = -1728053248;
                } else {
                    i11 = -1711276033;
                }
                bVar.setFrameColor(i11);
                bVar.setTextColor(e20Var.f23233l);
            } else if (b10 == 2) {
                if (g0.B(e20Var.f23233l) >= 0.25f) {
                    i17 = -16777216;
                }
                bVar.setFrameColor(i17);
                bVar.setTextColor(e20Var.f23233l);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(e20Var.f23233l);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(e20Var.f23238q, 1073741824), View.MeasureSpec.makeMeasureSpec(e20Var.f23239r, 1073741824));
            bVar.layout(0, 0, e20Var.f23238q, e20Var.f23239r);
            e20Var.G = Bitmap.createBitmap(e20Var.f23238q, e20Var.f23239r, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(e20Var.G));
            setupMatrix(e20Var);
        }

        private void setupMatrix(e20 e20Var) {
            t5 t5Var;
            Matrix matrix = new Matrix();
            e20Var.H = matrix;
            Bitmap bitmap = e20Var.G;
            if (bitmap == null && (t5Var = e20Var.J) != null) {
                q5 q5Var = t5Var.f39537w;
                bitmap = q5Var != null ? q5Var.f38521b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (e20Var.f23224a != 1 && (e20Var.f23225b & 2) != 0) {
                e20Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            e20Var.H.postScale(e20Var.f23228f * this.W, e20Var.f23229g * this.H);
            e20Var.H.postTranslate(e20Var.f23226c * this.W, e20Var.d * this.H);
            e20Var.H.postRotate((float) (((-e20Var.f23227e) / 3.141592653589793d) * 180.0d), ((e20Var.f23228f / 2.0f) + e20Var.f23226c) * this.W, ((e20Var.f23229g / 2.0f) + e20Var.d) * this.H);
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
                e20 e20Var = this.mediaEntities.get(i10);
                drawEntity(canvas, e20Var, e20Var.f23233l, j3);
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
