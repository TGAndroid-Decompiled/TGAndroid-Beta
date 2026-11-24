package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class n09 extends i49 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final t09 e;

    public n09(t09 t09Var) {
        this.e = t09Var;
    }

    public static ValueAnimator c(float f, float f2, vs2 vs2Var, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration(Math.abs(f2 - f) * 150.0f);
        duration.addUpdateListener(new u28(vs2Var, (byte) 27));
        duration.addListener(new l48(runnable, (byte) 27));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        float f;
        t09 t09Var = this.e;
        xe2 xe2Var = t09Var.a0;
        boolean z2 = false;
        if (xe2Var.K0() != 0) {
            z = true;
        } else {
            z = false;
        }
        float f2 = 0.0f;
        if (z != this.a) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f3 = t09Var.r;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.c = c(f3, f, new vs2(this) {
                public final n09 b;

                {
                    this.b = this;
                }

                @Override
                public final void accept(Object obj) {
                    byte b = r2;
                    n09 n09Var = this.b;
                    Float f4 = (Float) obj;
                    switch (b) {
                        case 0:
                            t09 t09Var2 = n09Var.e;
                            Paint paint = t09Var2.h;
                            float floatValue = f4.floatValue();
                            t09Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            t09Var2.invalidate();
                            return;
                        default:
                            t09 t09Var3 = n09Var.e;
                            Paint paint2 = t09Var3.n;
                            float floatValue2 = f4.floatValue();
                            t09Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            t09Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final n09 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    n09 n09Var = this.b;
                    switch (b) {
                        case 0:
                            n09Var.c = null;
                            return;
                        default:
                            n09Var.d = null;
                            return;
                    }
                }
            });
            this.a = z;
        }
        if (xe2Var.M0() != t09Var.b0.b() - 1) {
            z2 = true;
        }
        if (z2 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f4 = t09Var.s;
            if (z2) {
                f2 = 1.0f;
            }
            this.d = c(f4, f2, new vs2(this) {
                public final n09 b;

                {
                    this.b = this;
                }

                @Override
                public final void accept(Object obj) {
                    byte b = r2;
                    n09 n09Var = this.b;
                    Float f42 = (Float) obj;
                    switch (b) {
                        case 0:
                            t09 t09Var2 = n09Var.e;
                            Paint paint = t09Var2.h;
                            float floatValue = f42.floatValue();
                            t09Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            t09Var2.invalidate();
                            return;
                        default:
                            t09 t09Var3 = n09Var.e;
                            Paint paint2 = t09Var3.n;
                            float floatValue2 = f42.floatValue();
                            t09Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            t09Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final n09 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    n09 n09Var = this.b;
                    switch (b) {
                        case 0:
                            n09Var.c = null;
                            return;
                        default:
                            n09Var.d = null;
                            return;
                    }
                }
            });
            this.b = z2;
        }
    }
}
