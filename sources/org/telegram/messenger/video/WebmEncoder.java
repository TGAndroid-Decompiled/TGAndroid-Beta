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
import ig.h0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h6;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.messenger.u20;
import org.telegram.messenger.v20;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.w0;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.s5;
public class WebmEncoder {

    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<v20> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<v20> arrayList = new ArrayList<>();
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
                v20 v20Var = this.mediaEntities.get(i12);
                byte b10 = v20Var.f18455a;
                if (b10 != 0 && b10 != 2 && b10 != 5) {
                    if (b10 == 1) {
                        initTextEntity(v20Var);
                    }
                } else {
                    initStickerEntity(v20Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(v20 v20Var, Bitmap bitmap, int i10) {
            if (bitmap != null && v20Var != null) {
                if (v20Var.f18470s != 0.0f || i10 != 0) {
                    if (v20Var.L == null) {
                        v20Var.L = new Canvas(bitmap);
                    }
                    if (v20Var.f18470s != 0.0f) {
                        if (this.path == null) {
                            this.path = new Path();
                        }
                        if (this.xRefPaint == null) {
                            Paint paint = new Paint(1);
                            this.xRefPaint = paint;
                            paint.setColor(-16777216);
                            this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * v20Var.f18470s;
                        this.path.rewind();
                        this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                        this.path.toggleInverseFillType();
                        v20Var.L.drawPath(this.path, this.xRefPaint);
                    }
                    if (i10 != 0) {
                        if (this.textColorPaint == null) {
                            Paint paint2 = new Paint(1);
                            this.textColorPaint = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        }
                        this.textColorPaint.setColor(i10);
                        v20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                    }
                }
            }
        }

        private void drawEntity(Canvas canvas, v20 v20Var, int i10, long j10) {
            v20 v20Var2;
            Canvas canvas2;
            long j11;
            Bitmap bitmap;
            RLottieNative rLottieNative = v20Var.D;
            int i11 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap2 = v20Var.G;
                if (bitmap2 != null && v20Var.U > 0 && v20Var.V > 0) {
                    rLottieNative.c((int) v20Var.E, bitmap2, true);
                    Bitmap bitmap3 = v20Var.G;
                    if ((v20Var.f18456b & 8) == 0) {
                        i10 = 0;
                    }
                    applyRoundRadius(v20Var, bitmap3, i10);
                    canvas.drawBitmap(v20Var.G, v20Var.H, this.bitmapPaint);
                    float f7 = v20Var.E + v20Var.F;
                    v20Var.E = f7;
                    if (f7 >= v20Var.D.f24120a[0]) {
                        v20Var.E = 0.0f;
                    }
                }
            } else if (v20Var.J != null) {
                float f10 = v20Var.E;
                int i12 = (int) f10;
                float f11 = f10 + v20Var.F;
                v20Var.E = f11;
                for (int i13 = (int) f11; i12 != i13; i13--) {
                    v20Var.J.r(true);
                }
                p5 p5Var = v20Var.J.f30153w;
                if (p5Var != null) {
                    bitmap = p5Var.f29288b;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, v20Var.H, this.bitmapPaint);
                }
            } else {
                canvas.drawBitmap(v20Var.G, v20Var.H, this.bitmapPaint);
                ArrayList arrayList = v20Var.f18462k;
                if (arrayList != null && !arrayList.isEmpty()) {
                    while (i11 < v20Var.f18462k.size()) {
                        u20 u20Var = (u20) v20Var.f18462k.get(i11);
                        if (u20Var == null || (v20Var2 = u20Var.f18225b) == null) {
                            canvas2 = canvas;
                            j11 = j10;
                        } else {
                            canvas2 = canvas;
                            j11 = j10;
                            drawEntity(canvas2, v20Var2, v20Var.f18463l, j11);
                        }
                        i11++;
                        canvas = canvas2;
                        j10 = j11;
                    }
                }
            }
        }

        public void initStickerEntity(v20 v20Var) {
            int i10;
            float f7;
            int i11 = (int) (v20Var.f18458f * this.W);
            v20Var.U = i11;
            int i12 = (int) (v20Var.f18459g * this.H);
            v20Var.V = i12;
            if (i11 > 512) {
                v20Var.V = (int) ((i12 / i11) * 512.0f);
                v20Var.U = 512;
            }
            int i13 = v20Var.V;
            if (i13 > 512) {
                v20Var.U = (int) ((v20Var.U / i13) * 512.0f);
                v20Var.V = 512;
            }
            byte b10 = v20Var.f18456b;
            if ((b10 & 1) != 0) {
                int i14 = v20Var.U;
                if (i14 > 0 && (i10 = v20Var.V) > 0) {
                    v20Var.G = Bitmap.createBitmap(i14, i10, Bitmap.Config.ARGB_8888);
                    RLottieNative a2 = RLottieNative.a(v20Var.f18461j, null, null, null, 0, null);
                    v20Var.D = a2;
                    if (a2 != null) {
                        f7 = a2.f24120a[1] / this.fps;
                    } else {
                        f7 = 0.0f;
                    }
                    v20Var.F = f7;
                } else {
                    return;
                }
            } else if ((b10 & 4) != 0) {
                v20Var.K = false;
                s5 s5Var = new s5(new File(v20Var.f18461j), true, 0L, 0, null, null, null, 0L, d20.f15147s0, true, 512, 512, null, 0, true);
                v20Var.J = s5Var;
                v20Var.F = s5Var.d[5] / this.fps;
                v20Var.E = 1.0f;
                s5Var.r(true);
            } else {
                String str = v20Var.f18461j;
                if (!TextUtils.isEmpty(v20Var.f18471t) && (v20Var.f18456b & 16) != 0) {
                    str = v20Var.f18471t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (v20Var.f18455a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                v20Var.G = decodeFile;
                if (v20Var.f18455a == 2 && decodeFile != null) {
                    v20Var.f18470s = i0.L(12.0f) / Math.min(v20Var.f18468q, v20Var.f18469r);
                    Pair N0 = i0.N0(v20Var.f18461j);
                    v20Var.e = (float) (v20Var.e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f10 = v20Var.f18457c;
                        float f11 = v20Var.f18458f;
                        float f12 = (f11 / 2.0f) + f10;
                        float f13 = v20Var.d;
                        float f14 = v20Var.f18459g;
                        float f15 = (f14 / 2.0f) + f13;
                        float f16 = this.W;
                        float f17 = this.H;
                        float f18 = (f11 * f16) / f17;
                        float f19 = (f14 * f17) / f16;
                        v20Var.f18458f = f19;
                        v20Var.f18459g = f18;
                        v20Var.f18457c = f12 - (f19 / 2.0f);
                        v20Var.d = f15 - (f18 / 2.0f);
                    }
                    applyRoundRadius(v20Var, v20Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / v20Var.G.getHeight();
                    if (width > 1.0f) {
                        float f20 = v20Var.f18459g;
                        float f21 = f20 / width;
                        v20Var.d = c3.i0.B(f20, f21, 2.0f, v20Var.d);
                        v20Var.f18459g = f21;
                    } else if (width < 1.0f) {
                        float f22 = v20Var.f18458f;
                        float f23 = width * f22;
                        v20Var.f18457c = c3.i0.B(f22, f23, 2.0f, v20Var.f18457c);
                        v20Var.f18458f = f23;
                    }
                }
            }
            setupMatrix(v20Var);
        }

        private void initTextEntity(final v20 v20Var) {
            int i10;
            int i11;
            int i12;
            h6[] h6VarArr;
            Typeface d;
            final jg.b bVar = new jg.b(w0.f19025b);
            bVar.getPaint().setAntiAlias(true);
            bVar.G = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(i0.L(7.0f), i0.L(7.0f), i0.L(7.0f), i0.L(7.0f));
            h0 h0Var = v20Var.f18465n;
            if (h0Var != null && (d = h0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, v20Var.f18464m);
            SpannableString spannableString = new SpannableString(v20Var.f18461j);
            ArrayList arrayList = v20Var.f18462k;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                int i14 = i13 + 1;
                final u20 u20Var = (u20) arrayList.get(i13);
                if (u20Var.f18224a != null) {
                    v20 v20Var2 = new v20();
                    u20Var.f18225b = v20Var2;
                    v20Var2.f18461j = u20Var.f18224a;
                    v20Var2.f18456b = u20Var.f18226c;
                    o5 o5Var = new o5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i15, int i16, float f7, int i17, int i18, int i19, Paint paint) {
                            super.draw(canvas, charSequence, i15, i16, f7, i17, i18, i19, paint);
                            v20 v20Var3 = v20Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f7)) / v20Var3.f18468q) * v20Var3.f18458f) + v20Var.f18457c;
                            float f10 = v20Var3.d;
                            v20 v20Var4 = v20Var;
                            float f11 = v20Var4.f18459g;
                            float paddingTop = (((((i19 - i17) / 2.0f) + (bVar.getPaddingTop() + i17)) / v20Var4.f18469r) * f11) + f10;
                            if (v20Var4.e != 0.0f) {
                                float f12 = (v20Var4.f18458f / 2.0f) + v20Var4.f18457c;
                                float f13 = (f11 / 2.0f) + v20Var4.d;
                                float f14 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d10 = paddingLeft - f12;
                                double d11 = (paddingTop - f13) / f14;
                                paddingLeft = ((float) ((Math.cos(-v20Var.e) * d10) - (Math.sin(-v20Var.e) * d11))) + f12;
                                paddingTop = (((float) i0.a.c(-v20Var.e, d11, Math.sin(-v20Var.e) * d10)) * f14) + f13;
                            }
                            v20 v20Var5 = u20Var.f18225b;
                            int i20 = this.measuredSize;
                            v20 v20Var6 = v20Var;
                            float f15 = (i20 / v20Var6.f18468q) * v20Var6.f18458f;
                            v20Var5.f18458f = f15;
                            float f16 = (i20 / v20Var6.f18469r) * v20Var6.f18459g;
                            v20Var5.f18459g = f16;
                            v20Var5.f18457c = paddingLeft - (f15 / 2.0f);
                            v20Var5.d = paddingTop - (f16 / 2.0f);
                            v20Var5.e = v20Var6.e;
                            if (v20Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(v20Var5);
                            }
                        }
                    };
                    int i15 = u20Var.offset;
                    spannableString.setSpan(o5Var, i15, u20Var.length + i15, 33);
                }
                i13 = i14;
            }
            CharSequence m10 = k6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (h6VarArr = (h6[]) ((Spanned) m10).getSpans(0, m10.length(), h6.class)) != null) {
                for (h6 h6Var : h6VarArr) {
                    h6Var.f15839b = 0.85f;
                }
            }
            bVar.setText(m10);
            bVar.setTextColor(v20Var.f18463l);
            int i16 = v20Var.f18467p;
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
            int i17 = v20Var.f18467p;
            if (i17 != 1) {
                if (i17 == 2 ? !cd.X : cd.X) {
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
            setBreakStrategy(bVar);
            byte b10 = v20Var.f18456b;
            int i18 = -1;
            if (b10 == 0) {
                bVar.setFrameColor(v20Var.f18463l);
                if (i0.B(v20Var.f18463l) >= 0.721f) {
                    i18 = -16777216;
                }
                bVar.setTextColor(i18);
            } else if (b10 == 1) {
                if (i0.B(v20Var.f18463l) >= 0.25f) {
                    i12 = -1728053248;
                } else {
                    i12 = -1711276033;
                }
                bVar.setFrameColor(i12);
                bVar.setTextColor(v20Var.f18463l);
            } else if (b10 == 2) {
                if (i0.B(v20Var.f18463l) >= 0.25f) {
                    i18 = -16777216;
                }
                bVar.setFrameColor(i18);
                bVar.setTextColor(v20Var.f18463l);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(v20Var.f18463l);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(v20Var.f18468q, 1073741824), View.MeasureSpec.makeMeasureSpec(v20Var.f18469r, 1073741824));
            bVar.layout(0, 0, v20Var.f18468q, v20Var.f18469r);
            v20Var.G = Bitmap.createBitmap(v20Var.f18468q, v20Var.f18469r, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(v20Var.G));
            setupMatrix(v20Var);
        }

        private void setupMatrix(v20 v20Var) {
            s5 s5Var;
            Matrix matrix = new Matrix();
            v20Var.H = matrix;
            Bitmap bitmap = v20Var.G;
            if (bitmap == null && (s5Var = v20Var.J) != null) {
                p5 p5Var = s5Var.f30153w;
                bitmap = p5Var != null ? p5Var.f29288b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (v20Var.f18455a != 1 && (v20Var.f18456b & 2) != 0) {
                v20Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            v20Var.H.postScale(v20Var.f18458f * this.W, v20Var.f18459g * this.H);
            v20Var.H.postTranslate(v20Var.f18457c * this.W, v20Var.d * this.H);
            v20Var.H.postRotate((float) (((-v20Var.e) / 3.141592653589793d) * 180.0d), ((v20Var.f18458f / 2.0f) + v20Var.f18457c) * this.W, ((v20Var.f18459g / 2.0f) + v20Var.d) * this.H);
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
                v20 v20Var = this.mediaEntities.get(i11);
                drawEntity(canvas, v20Var, v20Var.f18463l, j10);
            }
            canvas.restore();
        }

        public void setBreakStrategy(jg.b bVar) {
            bVar.setBreakStrategy(0);
        }
    }

    public static boolean convert(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.WebmEncoder.convert(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, int):boolean");
    }

    private static native long createEncoder(String str, int i10, int i11, int i12, long j10);

    public static native void stop(long j10);

    private static native boolean writeFrame(long j10, ByteBuffer byteBuffer, int i10, int i11);
}
