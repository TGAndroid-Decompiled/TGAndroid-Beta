package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
public final class lk1 {
    public nf0 a;
    public float b;
    public boolean c;
    public float d;
    public float e;
    public long f;
    public ValueAnimator g;
    public Rect h;
    public Rect i;
    public Rect j;
    public float k;
    public float l;
    public float m;
    public jk1[] n;

    public final boolean a(int i, int i2, int i3) {
        jk1 jk1Var;
        Rect rect = this.i;
        Rect rect2 = this.h;
        jk1[] jk1VarArr = this.n;
        if (i3 == 0) {
            if (rect2.contains(i, i2)) {
                jk1 jk1Var2 = jk1VarArr[0];
                if (jk1Var2 != null) {
                    jk1VarArr[1] = jk1Var2;
                }
                jk1 jk1Var3 = new jk1(this, 1);
                jk1VarArr[0] = jk1Var3;
                jk1Var3.c = this.k;
                jk1Var3.b = i;
                jk1Var3.a();
                ValueAnimator valueAnimator = this.g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    return true;
                }
            } else if (rect.contains(i, i2)) {
                jk1 jk1Var4 = jk1VarArr[0];
                if (jk1Var4 != null) {
                    jk1VarArr[1] = jk1Var4;
                }
                jk1 jk1Var5 = new jk1(this, 2);
                jk1VarArr[0] = jk1Var5;
                jk1Var5.d = this.l;
                jk1Var5.b = i;
                jk1Var5.a();
                ValueAnimator valueAnimator2 = this.g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.j.contains(i, i2)) {
                jk1 jk1Var6 = new jk1(this, 4);
                jk1VarArr[0] = jk1Var6;
                jk1Var6.d = this.l;
                jk1Var6.c = this.k;
                jk1Var6.b = i;
                jk1Var6.a();
                ValueAnimator valueAnimator3 = this.g;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return true;
                }
            } else {
                if (i2 < rect2.bottom && i2 > rect2.top) {
                    this.c = true;
                    this.d = i;
                    this.e = i2;
                    this.f = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.g;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.a.a(this.k, this.l, true);
                        }
                        this.g.cancel();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 1 && (jk1Var = jk1VarArr[0]) != null && jk1Var.a != 4) {
            if (rect2.contains(i, i2) && jk1VarArr[0].a != 1) {
                jk1 jk1Var7 = new jk1(this, 1);
                jk1VarArr[1] = jk1Var7;
                jk1Var7.c = this.k;
                jk1Var7.b = i;
                jk1Var7.a();
                ValueAnimator valueAnimator5 = this.g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i, i2) && jk1VarArr[0].a != 2) {
                jk1 jk1Var8 = new jk1(this, 2);
                jk1VarArr[1] = jk1Var8;
                jk1Var8.d = this.l;
                jk1Var8.b = i;
                jk1Var8.a();
                ValueAnimator valueAnimator6 = this.g;
                if (valueAnimator6 != null) {
                    valueAnimator6.cancel();
                }
            }
            return true;
        }
        return false;
    }

    public final boolean b(int i, int i2) {
        jk1 jk1Var;
        boolean z;
        if (this.c || (jk1Var = this.n[i2]) == null) {
            return false;
        }
        byte b = jk1Var.a;
        float f = jk1Var.c;
        float f2 = jk1Var.d;
        int i3 = jk1Var.b;
        if (b == 1) {
            float f3 = f - ((i3 - i) / this.b);
            this.k = f3;
            if (f3 < 0.0f) {
                this.k = 0.0f;
                f3 = 0.0f;
            }
            float f4 = this.l;
            float f5 = this.m;
            if (f4 - f3 < f5) {
                this.k = f4 - f5;
            }
            z = true;
        } else {
            z = false;
        }
        if (b == 2) {
            float f6 = f2 - ((i3 - i) / this.b);
            this.l = f6;
            if (f6 > 1.0f) {
                this.l = 1.0f;
                f6 = 1.0f;
            }
            float f7 = this.k;
            float f8 = this.m;
            if (f6 - f7 < f8) {
                this.l = f7 + f8;
            }
            z = true;
        }
        if (b == 4) {
            float f9 = (i3 - i) / this.b;
            float f10 = f - f9;
            this.k = f10;
            float f11 = f2 - f9;
            this.l = f11;
            if (f10 < 0.0f) {
                this.k = 0.0f;
                f11 = f2 - f;
                this.l = f11;
            }
            if (f11 > 1.0f) {
                this.l = 1.0f;
                this.k = 1.0f - (f2 - f);
            }
            z = true;
        }
        if (z) {
            this.a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f;
        float f2;
        jk1[] jk1VarArr = this.n;
        if (i == 0) {
            if (this.c) {
                this.c = false;
                float x = this.d - motionEvent.getX();
                float y = this.e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f < 300) {
                    if (Math.sqrt((y * y) + (x * x)) < gl.L(10.0f)) {
                        float f3 = (this.d - nf0.l1) / this.b;
                        float f4 = this.l;
                        float f5 = this.k;
                        float f6 = f4 - f5;
                        float f7 = f6 / 2.0f;
                        float f8 = f3 - f7;
                        float f9 = f3 + f7;
                        if (f8 < 0.0f) {
                            f = f6;
                            f2 = 0.0f;
                        } else {
                            if (f9 > 1.0f) {
                                f8 = 1.0f - f6;
                                f = 1.0f;
                            } else {
                                f = f9;
                            }
                            f2 = f8;
                        }
                        this.g = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.a.a(f2, f, true);
                        this.g.addUpdateListener(new zl(this, f5, f2, f4, f, (byte) 1));
                        this.g.setInterpolator(nf0.D1);
                        this.g.start();
                    }
                }
                return true;
            }
            jk1 jk1Var = jk1VarArr[0];
            if (jk1Var != null && (valueAnimator2 = jk1Var.e) != null) {
                valueAnimator2.cancel();
            }
            jk1VarArr[0] = null;
            jk1 jk1Var2 = jk1VarArr[1];
            if (jk1Var2 != null) {
                jk1VarArr[0] = jk1Var2;
                jk1VarArr[1] = null;
            }
            return false;
        }
        jk1 jk1Var3 = jk1VarArr[1];
        if (jk1Var3 != null && (valueAnimator = jk1Var3.e) != null) {
            valueAnimator.cancel();
        }
        jk1VarArr[1] = null;
        return false;
    }
}
