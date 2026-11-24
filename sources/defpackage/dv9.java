package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
public final class dv9 {
    public static Paint N;
    public static Paint O;
    public long A;
    public lm B;
    public Paint C;
    public float D;
    public int E;
    public int F;
    public float[] G;
    public float[] H;
    public float[] I;
    public boolean J;
    public float K;
    public float L;
    public cv9 M;
    public int a;
    public int b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public gb2 k;
    public byte[] l;
    public k27 m;
    public gb2 n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public float s;
    public float t;
    public boolean u;
    public lm v;
    public float w;
    public Path x;
    public Path y;
    public boolean z;

    public final void a(Path path, float f, float f2) {
        float N2 = gl.N(2.0f);
        int D = ug8.D(14.0f, this.h, 2);
        float f3 = f2 * this.w;
        RectF rectF = gl.P;
        float f4 = N2 / 2.0f;
        rectF.set((gl.N(1.0f) + f) - f4, ((-f3) - f4) + gl.L(7.0f) + D, gl.N(1.0f) + f + f4, f3 + f4 + gl.L(7.0f) + D);
        path.addRoundRect(rectF, N2, N2, Path.Direction.CW);
    }

    public final float[] b(int i) {
        int i2;
        byte[] bArr = this.l;
        if (bArr != null && i > 0) {
            float[] fArr = new float[i];
            int i3 = 5;
            int length = (bArr.length << 3) / 5;
            float f = length / i;
            float f2 = 0.0f;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            loop0: while (i4 < length) {
                if (i4 == i5) {
                    int i7 = i5;
                    int i8 = 0;
                    while (i5 == i7) {
                        f2 += f;
                        i7 = (int) f2;
                        i8++;
                    }
                    int i9 = i4 * 5;
                    int i10 = i9 / 8;
                    int i11 = i9 - (i10 << 3);
                    int i12 = 5 - (8 - i11);
                    byte min = (byte) ((this.l[i10] >> i11) & ((2 << (Math.min(i3, i2) - 1)) - 1));
                    if (i12 > 0) {
                        int i13 = i10 + 1;
                        byte[] bArr2 = this.l;
                        if (i13 < bArr2.length) {
                            min = (byte) (((byte) (min << i12)) | (bArr2[i13] & ((2 << (4 - i2)) - 1)));
                        }
                    }
                    int i14 = 0;
                    while (i14 < i8) {
                        if (i6 >= i) {
                            break loop0;
                        }
                        fArr[i6] = Math.max(0.0f, (min * 7) / 31.0f);
                        i14++;
                        i6++;
                    }
                    i5 = i7;
                }
                i4++;
                i3 = 5;
            }
            return fArr;
        }
        return null;
    }

    public final void c(android.graphics.Canvas r21, defpackage.gb2 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv9.c(android.graphics.Canvas, gb2):void");
    }

    public final void d(Canvas canvas, float f) {
        boolean z;
        int i;
        float f2;
        Paint paint;
        Paint paint2;
        lm lmVar = this.B;
        float N2 = gl.N(2.0f);
        k27 k27Var = this.m;
        if (k27Var != null && k27Var.k.media_unread && !k27Var.N3() && this.c <= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.u = z;
        Paint paint3 = N;
        if (z) {
            i = this.q;
        } else if (this.o) {
            i = this.r;
        } else {
            i = this.p;
        }
        paint3.setColor(i);
        O.setColor(this.q);
        lmVar.a = this.n;
        boolean D = MediaController.w().D(this.m);
        if (this.z && !D) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        float e = lmVar.e(false, f2);
        Paint paint4 = N;
        paint4.setColor(bm2.f(e, paint4.getColor(), this.p));
        float f3 = 1.0f - e;
        O.setAlpha((int) (paint.getAlpha() * f3 * f));
        N.setAlpha((int) (paint2.getAlpha() * f));
        canvas.drawRect(0.0f, 0.0f, this.g + N2, this.h, N);
        if (e < 1.0f) {
            canvas.drawRect(0.0f, 0.0f, (this.g + N2) * this.c * f3, this.h, O);
        }
        if (e > 0.0f) {
            if (this.C == null || Math.abs(this.D - this.g) > gl.L(8.0f) || this.E != this.p || this.F != this.q) {
                Paint paint5 = this.C;
                if (paint5 == null) {
                    paint5 = new Paint(1);
                    this.C = paint5;
                }
                this.E = this.p;
                this.F = this.q;
                float f4 = this.g;
                this.D = f4;
                int i2 = this.E;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, f4, 0.0f, new int[]{i2, this.F, i2}, new float[]{0.0f, 0.2f, 0.4f}, Shader.TileMode.CLAMP));
            }
            this.C.setAlpha((int) (e * 255.0f * f));
            canvas.save();
            float pow = ((((float) Math.pow(((float) (SystemClock.elapsedRealtime() - this.A)) / 270.0f, 0.75d)) % 1.6f) - 0.6f) * this.D;
            canvas.translate(pow, 0.0f);
            canvas.drawRect(-pow, 0.0f, (this.g + 5) - pow, this.h, this.C);
            canvas.restore();
            gb2 gb2Var = this.n;
            if (gb2Var != null) {
                gb2Var.invalidate();
            }
        }
    }

    public final void e() {
        f(false, 0.0f);
    }

    public final void f(boolean z, float f) {
        float f2;
        int i;
        if (!this.k.N2()) {
            this.c = 1.0f;
            return;
        }
        boolean z2 = this.u;
        if (z2) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        this.c = f2;
        if (z2) {
            i = this.g;
        } else {
            i = this.a;
        }
        if (z && i != 0 && f == 0.0f) {
            this.t = 0.0f;
        } else if (!z) {
            this.t = 1.0f;
        }
        int ceil = (int) Math.ceil(this.g * f);
        this.a = ceil;
        if (ceil < 0) {
            this.a = 0;
            return;
        }
        int i2 = this.g;
        if (ceil > i2) {
            this.a = i2;
        }
    }

    public final void g(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        float[] fArr = this.G;
        if (fArr == null || fArr.length != ((int) (i / gl.N(3.0f)))) {
            this.G = b((int) (this.g / gl.N(3.0f)));
        }
        if (i3 != i4) {
            if (this.i == i3 && this.j == i4) {
                return;
            }
            this.i = i3;
            this.j = i4;
            this.H = b((int) (i3 / gl.N(3.0f)));
            this.I = b((int) (this.j / gl.N(3.0f)));
            return;
        }
        this.I = null;
        this.H = null;
    }
}
