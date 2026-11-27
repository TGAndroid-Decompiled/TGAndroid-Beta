package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class c49 extends v79 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final i49 e;

    public c49(i49 i49Var) {
        this.e = i49Var;
    }

    public static ValueAnimator c(float f, float f2, pt2 pt2Var, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration(Math.abs(f2 - f) * 150.0f);
        duration.addUpdateListener(new b49(pt2Var, (byte) 0));
        duration.addListener(new n88(runnable, (byte) 26));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        float f;
        i49 i49Var = this.e;
        of2 of2Var = i49Var.a0;
        boolean z2 = false;
        if (of2Var.K0() != 0) {
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
            float f3 = i49Var.r;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.c = c(f3, f, new pt2(this) {
                public final c49 b;

                {
                    this.b = this;
                }

                @Override
                public final void accept(Object obj) {
                    byte b = r2;
                    c49 c49Var = this.b;
                    Float f4 = (Float) obj;
                    switch (b) {
                        case 0:
                            i49 i49Var2 = c49Var.e;
                            Paint paint = i49Var2.h;
                            float floatValue = f4.floatValue();
                            i49Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            i49Var2.invalidate();
                            return;
                        default:
                            i49 i49Var3 = c49Var.e;
                            Paint paint2 = i49Var3.n;
                            float floatValue2 = f4.floatValue();
                            i49Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            i49Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final c49 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    c49 c49Var = this.b;
                    switch (b) {
                        case 0:
                            c49Var.c = null;
                            return;
                        default:
                            c49Var.d = null;
                            return;
                    }
                }
            });
            this.a = z;
        }
        if (of2Var.M0() != i49Var.b0.b() - 1) {
            z2 = true;
        }
        if (z2 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f4 = i49Var.s;
            if (z2) {
                f2 = 1.0f;
            }
            this.d = c(f4, f2, new pt2(this) {
                public final c49 b;

                {
                    this.b = this;
                }

                @Override
                public final void accept(Object obj) {
                    byte b = r2;
                    c49 c49Var = this.b;
                    Float f42 = (Float) obj;
                    switch (b) {
                        case 0:
                            i49 i49Var2 = c49Var.e;
                            Paint paint = i49Var2.h;
                            float floatValue = f42.floatValue();
                            i49Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            i49Var2.invalidate();
                            return;
                        default:
                            i49 i49Var3 = c49Var.e;
                            Paint paint2 = i49Var3.n;
                            float floatValue2 = f42.floatValue();
                            i49Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            i49Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final c49 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    c49 c49Var = this.b;
                    switch (b) {
                        case 0:
                            c49Var.c = null;
                            return;
                        default:
                            c49Var.d = null;
                            return;
                    }
                }
            });
            this.b = z2;
        }
    }
}
