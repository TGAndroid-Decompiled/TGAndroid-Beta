package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
public final class tl1 {
    public ng0 a;
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
    public rl1[] n;

    public final boolean a(int i, int i2, int i3) {
        rl1 rl1Var;
        Rect rect = this.i;
        Rect rect2 = this.h;
        rl1[] rl1VarArr = this.n;
        if (i3 == 0) {
            if (rect2.contains(i, i2)) {
                rl1 rl1Var2 = rl1VarArr[0];
                if (rl1Var2 != null) {
                    rl1VarArr[1] = rl1Var2;
                }
                rl1 rl1Var3 = new rl1(this, 1);
                rl1VarArr[0] = rl1Var3;
                rl1Var3.c = this.k;
                rl1Var3.b = i;
                rl1Var3.a();
                ValueAnimator valueAnimator = this.g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    return true;
                }
            } else if (rect.contains(i, i2)) {
                rl1 rl1Var4 = rl1VarArr[0];
                if (rl1Var4 != null) {
                    rl1VarArr[1] = rl1Var4;
                }
                rl1 rl1Var5 = new rl1(this, 2);
                rl1VarArr[0] = rl1Var5;
                rl1Var5.d = this.l;
                rl1Var5.b = i;
                rl1Var5.a();
                ValueAnimator valueAnimator2 = this.g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.j.contains(i, i2)) {
                rl1 rl1Var6 = new rl1(this, 4);
                rl1VarArr[0] = rl1Var6;
                rl1Var6.d = this.l;
                rl1Var6.c = this.k;
                rl1Var6.b = i;
                rl1Var6.a();
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
        if (i3 == 1 && (rl1Var = rl1VarArr[0]) != null && rl1Var.a != 4) {
            if (rect2.contains(i, i2) && rl1VarArr[0].a != 1) {
                rl1 rl1Var7 = new rl1(this, 1);
                rl1VarArr[1] = rl1Var7;
                rl1Var7.c = this.k;
                rl1Var7.b = i;
                rl1Var7.a();
                ValueAnimator valueAnimator5 = this.g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i, i2) && rl1VarArr[0].a != 2) {
                rl1 rl1Var8 = new rl1(this, 2);
                rl1VarArr[1] = rl1Var8;
                rl1Var8.d = this.l;
                rl1Var8.b = i;
                rl1Var8.a();
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
        rl1 rl1Var;
        boolean z;
        if (this.c || (rl1Var = this.n[i2]) == null) {
            return false;
        }
        byte b = rl1Var.a;
        float f = rl1Var.c;
        float f2 = rl1Var.d;
        int i3 = rl1Var.b;
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
        rl1[] rl1VarArr = this.n;
        if (i == 0) {
            if (this.c) {
                this.c = false;
                float x = this.d - motionEvent.getX();
                float y = this.e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f < 300) {
                    if (Math.sqrt((y * y) + (x * x)) < gm.L(10.0f)) {
                        float f3 = (this.d - ng0.l1) / this.b;
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
                        this.g.addUpdateListener(new zm(this, f5, f2, f4, f, (byte) 1));
                        this.g.setInterpolator(ng0.D1);
                        this.g.start();
                    }
                }
                return true;
            }
            rl1 rl1Var = rl1VarArr[0];
            if (rl1Var != null && (valueAnimator2 = rl1Var.e) != null) {
                valueAnimator2.cancel();
            }
            rl1VarArr[0] = null;
            rl1 rl1Var2 = rl1VarArr[1];
            if (rl1Var2 != null) {
                rl1VarArr[0] = rl1Var2;
                rl1VarArr[1] = null;
            }
            return false;
        }
        rl1 rl1Var3 = rl1VarArr[1];
        if (rl1Var3 != null && (valueAnimator = rl1Var3.e) != null) {
            valueAnimator.cancel();
        }
        rl1VarArr[1] = null;
        return false;
    }
}
