package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
public final class tbc {
    public static Paint Q;
    public static Paint R;
    public static int S;
    public static float[] T;
    public static Path U;
    public int A;
    public final lm D;
    public float E;
    public ArrayList F;
    public CharSequence G;
    public long H;
    public StaticLayout[] K;
    public TextPaint L;
    public int N;
    public long O;
    public float a;
    public int h;
    public int i;
    public sbc j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float p;
    public boolean q;
    public float s;
    public float t;
    public long u;
    public final View v;
    public float y;
    public int z;
    public int b = 0;
    public float c = 0.0f;
    public int d = 0;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public final RectF o = new RectF();
    public float r = 1.0f;
    public final int w = gl.L(4.0f);
    public final int x = gl.L(2.0f);
    public int B = 0;
    public float C = 1.0f;
    public float I = 0.0f;
    public int J = -1;
    public float M = 1.0f;
    public float P = -1.0f;

    public tbc(View view) {
        if (Q == null) {
            Q = new Paint(1);
            Paint paint = new Paint(1);
            R = paint;
            paint.setStyle(Paint.Style.STROKE);
            R.setColor(-16777216);
            R.setStrokeWidth(1.0f);
        }
        this.v = view;
        S = gl.L(24.0f);
        this.t = gl.L(6.0f);
        this.D = new lm(0.0f, view, 0L, 300L, s33.h);
    }

    public static void g(float f, int i) {
        if (f < 1.0f) {
            i = bm2.o(i, (int) (Color.alpha(i) * f));
        }
        Q.setColor(i);
    }

    public final void a(Canvas canvas, View view) {
        float f;
        int i;
        float f2;
        float f3;
        float f4;
        int i2;
        float f5;
        float f6;
        int i3;
        float f7;
        float f8;
        float f9;
        char c;
        int i4;
        float f10;
        int i5;
        int i6;
        int i7;
        int i8;
        float R1 = gl.R1(S / 2.0f, 0.0f, this.y) + this.z;
        RectF rectF = this.o;
        rectF.left = R1;
        int i9 = this.i;
        int i10 = this.w;
        rectF.top = gl.R1((i9 - i10) / 2.0f, (i9 - gl.L(3.0f)) - this.x, this.y);
        int i11 = this.i;
        rectF.bottom = gl.R1((i11 + i10) / 2.0f, i11 - gl.L(3.0f), this.y);
        float f11 = this.b;
        float min = Math.min(this.c, f11);
        this.c = min;
        float R12 = gl.R1(min, f11, 0.5f);
        this.c = R12;
        int i12 = (Math.abs(f11 - R12) > 0.005f ? 1 : (Math.abs(f11 - R12) == 0.005f ? 0 : -1));
        View view2 = this.v;
        if (i12 > 0) {
            view2.invalidate();
        }
        float f12 = this.c;
        float f13 = this.C;
        if (f13 != 1.0f) {
            float f14 = f13 + 0.07272727f;
            this.C = f14;
            if (f14 >= 1.0f) {
                this.C = 1.0f;
            } else {
                view.invalidate();
                float interpolation = s33.f.getInterpolation(this.C);
                f12 = (f12 * interpolation) + ((1.0f - interpolation) * this.B);
            }
        }
        float e = this.D.e(false, 0.0f);
        if (this.f) {
            e = 0.0f;
        }
        rectF.right = gl.R1(this.h - (S / 2.0f), view2.getWidth() - (this.z * 2.0f), this.y) + this.z;
        g(1.0f - this.y, this.k);
        b(canvas, rectF, Q);
        float f15 = this.r;
        if (f15 != 1.0f) {
            float f16 = f15 + 0.16f;
            this.r = f16;
            if (f16 > 1.0f) {
                this.r = 1.0f;
            } else {
                view2.invalidate();
            }
        }
        boolean z = this.q;
        float f17 = this.p;
        if (z) {
            if (f17 > 0.0f) {
                f = 2.0f;
                rectF.right = gl.R1((f17 * (this.h - i8)) + (S / 2.0f), view2.getWidth() - (this.z * 2.0f), this.y) + this.z;
                g((1.0f - this.r) * (1.0f - this.y), this.l);
                b(canvas, rectF, Q);
            } else {
                f = 2.0f;
            }
            float f18 = this.s;
            if (f18 > 0.0f) {
                rectF.right = gl.R1((f18 * (this.h - i7)) + (S / f), view2.getWidth() - (this.z * f), this.y) + this.z;
                g(1.0f - this.y, this.l);
                b(canvas, rectF, Q);
            }
        } else {
            f = 2.0f;
            float f19 = this.r;
            float f20 = (this.s * f19) + ((1.0f - f19) * f17);
            if (f20 > 0.0f) {
                rectF.right = gl.R1((f20 * (this.h - i)) + (S / 2.0f), view2.getWidth() - (this.z * 2.0f), this.y) + this.z;
                g(1.0f - this.y, this.l);
                b(canvas, rectF, Q);
            }
        }
        if (this.f) {
            f2 = 8.0f;
        } else {
            f2 = 6.0f;
        }
        float L = gl.L(f2);
        if (this.t != L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            f3 = 3.0f;
            f4 = e;
            long j = elapsedRealtime - this.u;
            this.u = elapsedRealtime;
            if (j > 18) {
                j = 16;
            }
            float f21 = this.t;
            i2 = 0;
            if (f21 < L) {
                float A = b00.A((float) j, 60.0f, gl.L(1.0f), f21);
                this.t = A;
                if (A > L) {
                    this.t = L;
                }
            } else {
                float x = de9.x((float) j, 60.0f, gl.L(1.0f), f21);
                this.t = x;
                if (x < L) {
                    this.t = L;
                }
            }
            view2.invalidate();
        } else {
            f3 = 3.0f;
            f4 = e;
            i2 = 0;
        }
        float R13 = gl.R1(this.t, 0.0f, this.y);
        if (f4 > 0.0f) {
            float f22 = rectF.left;
            f5 = 0.2f;
            f6 = 8.0f;
            float R14 = gl.R1((S / f) + (this.h - i5), view2.getWidth() - (this.z * f), this.y) + this.z;
            rectF.right = R14;
            rectF.left = gl.R1(f22, R14, 1.0f - f4);
            if (this.y > 0.0f && rectF.width() > 0.0f) {
                R.setAlpha((int) (this.y * 255.0f * 0.2f));
                b(canvas, rectF, R);
            }
            g(1.0f, bm2.f(this.y, this.n, this.A));
            b(canvas, rectF, Q);
            rectF.left = f22;
            int i13 = this.m;
            if (c() == 0.0f) {
                i6 = i2;
            } else {
                i6 = this.A;
            }
            g(1.0f - this.y, bm2.f(this.y, i13, i6));
            canvas.drawCircle(gl.R1((S / f) + this.E, (this.E / (this.h - S)) * (view2.getWidth() - (this.z * f)), this.y) + this.z, rectF.centerY(), R13 * f4, Q);
        } else {
            f5 = 0.2f;
            f6 = 8.0f;
        }
        float f23 = this.z;
        float f24 = S / f;
        if (this.f) {
            f12 = this.d;
        }
        rectF.right = gl.R1(f24 + f12, c() * (view2.getWidth() - (this.z * f)), this.y) + f23;
        if (this.y > 0.0f && rectF.width() > 0.0f) {
            R.setAlpha((int) (this.y * 255.0f * f5));
            b(canvas, rectF, R);
        }
        g(1.0f, bm2.f(this.y, this.n, this.A));
        b(canvas, rectF, Q);
        int i14 = this.m;
        if (c() == 0.0f) {
            i3 = i2;
        } else {
            i3 = this.A;
        }
        g(1.0f - this.y, bm2.f(this.y, i14, i3));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - f4) * R13, Q);
        ArrayList arrayList = this.F;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (!this.f && !this.g) {
                f7 = this.c;
            } else {
                f7 = this.d;
            }
            float f25 = f7 / (this.h - S);
            int size = this.F.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((Float) ((Pair) this.F.get(size)).first).floatValue() - 0.001f <= f25) {
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (this.K == null) {
                this.K = new StaticLayout[2];
            }
            float R15 = gl.R1(S / f, 0.0f, this.y) + this.z;
            float R16 = gl.R1(this.h - (S / f), view2.getWidth() - (this.z * f), this.y) + this.z;
            float f26 = (this.h - (S / f)) + this.z;
            float abs = Math.abs(R15 - f26) - gl.L(16.0f);
            float f27 = this.P;
            if (f27 > 0.0f && Math.abs(f27 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.K;
                StaticLayout staticLayout = staticLayoutArr[i2];
                if (staticLayout != null) {
                    f9 = f3;
                    CharSequence text = staticLayout.getText();
                    f8 = 255.0f;
                    staticLayoutArr[i2] = d((int) abs, text);
                } else {
                    f8 = 255.0f;
                    f9 = f3;
                }
                StaticLayout[] staticLayoutArr2 = this.K;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = d((int) abs, staticLayout2.getText());
                }
            } else {
                f8 = 255.0f;
                f9 = f3;
            }
            this.P = abs;
            if (size != this.J) {
                StaticLayout[] staticLayoutArr3 = this.K;
                staticLayoutArr3[1] = staticLayoutArr3[i2];
                if (this.f) {
                    gl.X3(view2);
                }
                if (size >= 0 && size < this.F.size()) {
                    CharSequence charSequence = (CharSequence) ((Pair) this.F.get(size)).second;
                    StaticLayout[] staticLayoutArr4 = this.K;
                    if (charSequence == null) {
                        staticLayoutArr4[i2] = null;
                    } else {
                        staticLayoutArr4[i2] = d((int) abs, charSequence);
                    }
                } else {
                    this.K[i2] = null;
                }
                this.M = 0.0f;
                if (size == -1) {
                    this.N = -1;
                } else {
                    int i15 = this.J;
                    if (i15 == -1) {
                        this.N = 1;
                    } else if (size < i15) {
                        this.N = -1;
                    } else if (size > i15) {
                        this.N = 1;
                    }
                }
                this.J = size;
            }
            if (this.M < 1.0f) {
                c = 1;
                i4 = i10;
                long min2 = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O));
                if (this.F.size() > 8) {
                    f10 = 160.0f;
                } else {
                    f10 = 220.0f;
                }
                this.M = Math.min((((float) min2) / f10) + this.M, 1.0f);
                view2.invalidate();
                this.O = SystemClock.elapsedRealtime();
            } else {
                c = 1;
                i4 = i10;
            }
            if (this.I < 1.0f) {
                this.I = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.O))) / 200.0f) + this.I, 1.0f);
                view2.invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation2 = s33.f.getInterpolation(this.M);
            canvas.save();
            int i16 = this.i;
            canvas.translate(((R16 - f26) * this.y) + R15, gl.R1((i16 + i4) / f, i16 - gl.L(f9), this.y) + gl.L(12.0f));
            if (this.K[c] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate((gl.L(16.0f) * (-this.N) * interpolation2) + gl.L(f6), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[c].getHeight()) / f);
                this.L.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.y) * f8 * this.I));
                this.K[c].draw(canvas);
                canvas.restore();
            }
            if (this.K[i2] != null) {
                canvas.save();
                if (this.N != 0) {
                    canvas.translate(tb4.A(1.0f, interpolation2, gl.L(16.0f) * this.N, gl.L(f6)), 0.0f);
                }
                canvas.translate(0.0f, (-this.K[i2].getHeight()) / f);
                this.L.setAlpha((int) (tb4.z(1.0f, this.y, f8, interpolation2) * this.I));
                this.K[i2].draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, RectF rectF, Paint paint) {
        int i;
        char c;
        float floatValue;
        float floatValue2;
        float f;
        float f2;
        char c2;
        char c3 = 2;
        char c4 = 1;
        float L = gl.L(gl.U1(this.y, 2, 1));
        ArrayList arrayList = this.F;
        if (arrayList != null && !arrayList.isEmpty()) {
            float f3 = 0.0f;
            float R1 = gl.R1(S / 2.0f, 0.0f, this.y) + this.z;
            float R12 = gl.R1(this.h - (S / 2.0f), this.v.getWidth() - (this.z * 2.0f), this.y) + this.z;
            gl.P.set(rectF);
            float f4 = 1.0f;
            float L2 = gl.L(this.I * 1.0f) / 2.0f;
            Path path = U;
            if (path == null) {
                path = new Path();
                U = path;
            }
            path.reset();
            float L3 = gl.L(4.0f) / (R12 - R1);
            int i2 = 0;
            while (true) {
                i = -1;
                if (i2 < this.F.size()) {
                    if (((Float) ((Pair) this.F.get(i2)).first).floatValue() >= L3) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 < 0) {
                i2 = 0;
            }
            int size = this.F.size() - 1;
            while (true) {
                c = c3;
                if (size < 0) {
                    break;
                } else if (1.0f - ((Float) ((Pair) this.F.get(size)).first).floatValue() >= L3) {
                    i = size + 1;
                    break;
                } else {
                    size--;
                    c3 = c;
                }
            }
            if (i < 0) {
                i = this.F.size();
            }
            int i3 = i;
            int i4 = i2;
            while (i4 <= i3) {
                char c5 = c4;
                if (i4 == i2) {
                    floatValue = f3;
                } else {
                    floatValue = ((Float) ((Pair) this.F.get(i4 - 1)).first).floatValue();
                }
                if (i4 == i3) {
                    floatValue2 = f4;
                } else {
                    floatValue2 = ((Float) ((Pair) this.F.get(i4)).first).floatValue();
                }
                while (i4 != i3 && i4 != 0 && i4 < this.F.size() - 1 && ((Float) ((Pair) this.F.get(i4)).first).floatValue() - floatValue <= L3) {
                    i4++;
                    floatValue2 = ((Float) ((Pair) this.F.get(i4)).first).floatValue();
                }
                RectF rectF2 = gl.P;
                float R13 = gl.R1(R1, R12, floatValue);
                if (i4 > 0) {
                    f = L2;
                } else {
                    f = 0.0f;
                }
                rectF2.left = R13 + f;
                float R14 = gl.R1(R1, R12, floatValue2);
                if (i4 < i3) {
                    f2 = L2;
                } else {
                    f2 = 0.0f;
                }
                float f5 = R14 - f2;
                rectF2.right = f5;
                float f6 = rectF.right;
                if (f5 > f6) {
                    c2 = c5;
                } else {
                    c2 = 0;
                }
                if (c2 != 0) {
                    rectF2.right = f6;
                    f5 = f6;
                }
                float f7 = rectF.left;
                if (f5 >= f7) {
                    float f8 = rectF2.left;
                    if (f8 < f7) {
                        rectF2.left = f7;
                    } else {
                        f7 = f8;
                    }
                    float[] fArr = T;
                    if (fArr == null) {
                        fArr = new float[8];
                        T = fArr;
                    }
                    if (i4 != i2 && (c2 == 0 || f7 < rectF.left)) {
                        float f9 = 0.7f * L * this.I;
                        if (i4 >= i3) {
                            fArr[7] = f9;
                            fArr[6] = f9;
                            fArr[c5] = f9;
                            fArr[0] = f9;
                            fArr[5] = L;
                            fArr[4] = L;
                            fArr[3] = L;
                            fArr[c] = L;
                        } else {
                            fArr[5] = f9;
                            fArr[4] = f9;
                            fArr[3] = f9;
                            fArr[c] = f9;
                            fArr[7] = f9;
                            fArr[6] = f9;
                            fArr[c5] = f9;
                            fArr[0] = f9;
                        }
                    } else {
                        fArr[7] = L;
                        fArr[6] = L;
                        fArr[c5] = L;
                        fArr[0] = L;
                        float f10 = 0.7f * L * this.I;
                        fArr[5] = f10;
                        fArr[4] = f10;
                        fArr[3] = f10;
                        fArr[c] = f10;
                    }
                    U.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (c2 != 0) {
                        break;
                    }
                }
                i4++;
                c4 = c5;
                f3 = 0.0f;
                f4 = 1.0f;
            }
            canvas.drawPath(U, paint);
            return;
        }
        canvas.drawRoundRect(rectF, L, L, paint);
    }

    public final float c() {
        return this.b / (this.h - S);
    }

    public final StaticLayout d(int i, CharSequence charSequence) {
        if (this.L == null) {
            TextPaint textPaint = new TextPaint(1);
            this.L = textPaint;
            textPaint.setTextSize(gl.L(12.0f));
            this.L.setColor(-1);
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.L, i).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(gl.L(400.0f), i)).build();
    }

    public final boolean e(float f, float f2, int i) {
        sbc sbcVar;
        int i2 = 0;
        if (i == 0) {
            if (this.y <= 0.0f) {
                int i3 = this.i;
                int i4 = S;
                int i5 = (i3 - i4) / 2;
                if (f >= (-i5)) {
                    int i6 = this.h;
                    if (f <= i6 + i5 && f2 >= 0.0f && f2 <= i3) {
                        int i7 = this.b;
                        if (i7 - i5 > f || f > i7 + i4 + i5) {
                            int i8 = ((int) f) - (i4 / 2);
                            this.b = i8;
                            if (i8 < 0) {
                                this.b = 0;
                            } else if (i8 > i6 - i4) {
                                i2 = i4 - i6;
                                this.b = i2;
                            } else {
                                i2 = i8;
                            }
                            this.c = i2;
                            i7 = i2;
                        }
                        this.g = true;
                        this.f = true;
                        this.d = i7;
                        this.e = (int) (f - i7);
                        return true;
                    }
                }
            }
        } else if (i != 1 && i != 3) {
            if (i == 2 && this.f) {
                int i9 = (int) (f - this.e);
                this.d = i9;
                if (i9 < 0) {
                    this.d = 0;
                } else {
                    i2 = this.h - S;
                    if (i9 > i2) {
                        this.d = i2;
                    } else {
                        i2 = i9;
                    }
                }
                sbc sbcVar2 = this.j;
                if (sbcVar2 != null) {
                    sbcVar2.h(i2 / (this.h - S));
                }
                return true;
            }
        } else if (this.f) {
            int i10 = this.d;
            this.b = i10;
            float f3 = i10;
            this.c = f3;
            if (i == 1 && (sbcVar = this.j) != null) {
                sbcVar.f(f3 / (this.h - S));
            }
            this.f = false;
            gl.e3(new kbc(this, (byte) 1), 50L);
            return true;
        }
        return false;
    }

    public final void f(float f) {
        boolean z;
        float f2 = this.s;
        if (f != f2) {
            this.p = f2;
            if (f < f2) {
                z = true;
            } else {
                z = false;
            }
            this.q = z;
            this.s = f;
            this.r = 0.0f;
        }
    }

    public final void h(boolean z, float f) {
        if (Math.abs(this.a - 1.0f) < 0.04f && Math.abs(f) < 0.04f) {
            this.D.e(true, 1.0f);
            this.E = this.b;
        }
        this.a = f;
        int ceil = (int) Math.ceil((this.h - S) * f);
        if (z) {
            if (Math.abs(ceil - this.b) > gl.L(10.0f)) {
                float interpolation = s33.f.getInterpolation(this.C);
                this.B = (int) tb4.A(1.0f, interpolation, this.B, this.b * interpolation);
                this.C = 0.0f;
            } else if (this.C == 1.0f) {
                this.C = 0.0f;
                this.B = this.b;
            }
        }
        this.b = ceil;
        if (ceil < 0) {
            ceil = 0;
            this.b = 0;
        } else {
            int i = this.h - S;
            if (ceil > i) {
                this.b = i;
                ceil = i;
            }
        }
        if (Math.abs(this.c - ceil) > gl.L(8.0f)) {
            this.c = this.b;
        }
    }
}
