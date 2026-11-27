package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
public class hn extends Drawable {
    public static final LinearInterpolator d0 = new LinearInterpolator();
    public boolean A;
    public float B;
    public int C;
    public final Rect D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public c1 J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public float O;
    public boolean P;
    public LinearGradient Q;
    public Matrix R;
    public Paint S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public float X;
    public int Y;
    public ValueAnimator Z;
    public final TextPaint a;
    public int a0;
    public int b;
    public ColorFilter b0;
    public boolean c;
    public Runnable c0;
    public float d;
    public float e;
    public float f;
    public float g;
    public en[] h;
    public CharSequence i;
    public float j;
    public float k;
    public float l;
    public float m;
    public en[] n;
    public CharSequence o;
    public int p;
    public float q;
    public float r;
    public boolean s;
    public ValueAnimator t;
    public CharSequence u;
    public boolean v;
    public short w;
    public k43 x;
    public float y;
    public float z;

    public hn(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = new TextPaint(1);
        this.b = 0;
        this.c = false;
        this.p = 0;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = true;
        this.w = (short) 320;
        this.x = k43.h;
        this.y = -1.0f;
        this.z = 0.3f;
        this.B = 0.0f;
        this.C = 255;
        this.D = new Rect();
        this.T = true;
        this.U = true;
        this.V = false;
        this.E = z;
        this.F = z2;
        this.G = z3;
        this.H = z4;
        this.I = z5;
    }

    public static boolean l(int r2, int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn.l(int, int, java.lang.CharSequence, java.lang.CharSequence):boolean");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.n != null) {
            int i = 0;
            while (true) {
                en[] enVarArr = this.n;
                if (i >= enVarArr.length) {
                    break;
                }
                en enVar = enVarArr[i];
                hn hnVar = enVar.i;
                if (hnVar.getCallback() instanceof View) {
                    hm.release((View) hnVar.getCallback(), enVar.a);
                }
                i++;
            }
        }
        this.n = null;
    }

    public final float c() {
        if (this.h != null && this.n != null) {
            return hl.R1(this.j, this.d, this.r);
        }
        return this.d;
    }

    public final float d(defpackage.en r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn.d(en, float):float");
    }

    @Override
    public final void draw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn.draw(android.graphics.Canvas):void");
    }

    public final float e() {
        return Math.max(this.d, this.j);
    }

    public final void f(en enVar) {
        this.f = Math.max(this.f, enVar.g);
        float max = Math.max(this.g, enVar.h);
        this.g = max;
        this.e = this.f + max;
    }

    public final void g(en enVar) {
        this.l = Math.max(this.l, enVar.g);
        float max = Math.max(this.m, enVar.h);
        this.m = max;
        this.k = this.l + max;
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.D;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final boolean h() {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final float i() {
        float f;
        CharSequence charSequence = this.o;
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (charSequence != null && charSequence.length() > 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        CharSequence charSequence2 = this.i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f2 = 1.0f;
        }
        if (this.o != null) {
            f3 = this.r;
        }
        return hl.R1(f, f2, f3);
    }

    public final StaticLayout j(int i, CharSequence charSequence) {
        if (i <= 0) {
            Point point = hl.q;
            i = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.a, i).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i).setIncludePad(this.T).build();
    }

    public final void k(fn fnVar, CharSequence charSequence, int i, int i2) {
        if (this.H && charSequence.length() > 1) {
            int i3 = 0;
            while (i3 < charSequence.length()) {
                int i4 = i3 + 1;
                fnVar.b(charSequence.subSequence(i3, i4));
                i3 = i4;
            }
            return;
        }
        fnVar.b(charSequence);
    }

    public final void m(float f, long j, float f2, k43 k43Var) {
        this.z = f;
        this.w = (int) j;
        this.y = f2;
        this.x = k43Var;
    }

    public final void n(float f, long j, k43 k43Var) {
        m(f, j, 1.0f, k43Var);
    }

    public final void o(float f, float f2, float f3, float f4) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = (int) f3;
        int i4 = (int) f4;
        super.setBounds(i, i2, i3, i4);
        this.D.set(i, i2, i3, i4);
    }

    public final void p(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void q(boolean z) {
        this.P = z;
        invalidateSelf();
    }

    public final void r(boolean z, boolean z2) {
        this.E = z;
        this.F = true;
        this.G = z2;
        this.H = false;
        this.I = false;
    }

    public final void s(float f, float f2, int i) {
        this.V = true;
        this.W = f;
        this.X = f2;
        this.Y = i;
        this.a.setShadowLayer(f, 0.0f, f2, i);
    }

    @Override
    public final void setAlpha(int i) {
        this.C = i;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.D.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public final void t(java.lang.CharSequence r21, boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn.t(java.lang.CharSequence, boolean, boolean):void");
    }

    public final void u(int i) {
        this.a.setColor(i);
        this.C = Color.alpha(i);
    }

    public final void v(int i, boolean z) {
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Z = null;
        }
        if (!z) {
            u(i);
            return;
        }
        int color = this.a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Z = ofFloat;
        ofFloat.addUpdateListener(new cn(this, color, i, (byte) 0));
        this.Z.addListener(new dn(this, i, (byte) 0));
        this.Z.setDuration(240L);
        this.Z.setInterpolator(k43.h);
        this.Z.start();
    }

    public final void w(float f) {
        TextPaint textPaint = this.a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f);
        if (Math.abs(textSize - f) > 0.5f) {
            int i = this.N;
            if (i <= 0) {
                i = this.D.width();
            }
            int i2 = 0;
            if (this.h != null) {
                this.d = 0.0f;
                this.g = 0.0f;
                this.f = 0.0f;
                this.e = 0.0f;
                int i3 = 0;
                while (true) {
                    en[] enVarArr = this.h;
                    if (i3 >= enVarArr.length) {
                        break;
                    }
                    StaticLayout j = j(i - ((int) Math.ceil(Math.min(this.d, this.j))), enVarArr[i3].b.getText());
                    en[] enVarArr2 = this.h;
                    en enVar = enVarArr2[i3];
                    enVarArr2[i3] = new en(this, j, enVar.c, enVar.d);
                    float f2 = this.d;
                    en enVar2 = this.h[i3];
                    this.d = f2 + enVar2.f;
                    f(enVar2);
                    i3++;
                }
            }
            if (this.n != null) {
                this.j = 0.0f;
                this.m = 0.0f;
                this.l = 0.0f;
                this.k = 0.0f;
                while (true) {
                    en[] enVarArr3 = this.n;
                    if (i2 >= enVarArr3.length) {
                        break;
                    }
                    StaticLayout j2 = j(i - ((int) Math.ceil(Math.min(this.d, this.j))), enVarArr3[i2].b.getText());
                    en[] enVarArr4 = this.n;
                    en enVar3 = enVarArr4[i2];
                    enVarArr4[i2] = new en(this, j2, enVar3.c, enVar3.d);
                    float f3 = this.j;
                    en enVar4 = this.n[i2];
                    this.j = f3 + enVar4.f;
                    g(enVar4);
                    i2++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.a.setTypeface(typeface);
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.D.set(i, i2, i3, i4);
    }

    public hn(boolean z, boolean z2, boolean z3) {
        this(z, z2, z3, false, false);
    }
}
