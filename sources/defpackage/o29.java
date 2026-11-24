package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
public final class o29 extends k69 {
    public boolean a;
    public boolean b;
    public ValueAnimator c;
    public ValueAnimator d;
    public final v29 e;

    public o29(v29 v29Var) {
        this.e = v29Var;
    }

    public static ValueAnimator c(float f, float f2, gu2 gu2Var, Runnable runnable) {
        ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration(Math.abs(f2 - f) * 150.0f);
        duration.addUpdateListener(new fx7(gu2Var, (byte) 29));
        duration.addListener(new s38(runnable, (byte) 29));
        duration.start();
        return duration;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        float f;
        v29 v29Var = this.e;
        jg2 jg2Var = v29Var.a0;
        boolean z2 = false;
        if (jg2Var.K0() != 0) {
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
            float f3 = v29Var.r;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.c = c(f3, f, new gu2(this) {
                public final o29 b;

                {
                    this.b = this;
                }

                @Override
                public final void accept(Object obj) {
                    byte b = r2;
                    o29 o29Var = this.b;
                    Float f4 = (Float) obj;
                    switch (b) {
                        case 0:
                            v29 v29Var2 = o29Var.e;
                            Paint paint = v29Var2.h;
                            float floatValue = f4.floatValue();
                            v29Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            v29Var2.invalidate();
                            return;
                        default:
                            v29 v29Var3 = o29Var.e;
                            Paint paint2 = v29Var3.n;
                            float floatValue2 = f4.floatValue();
                            v29Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            v29Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final o29 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    o29 o29Var = this.b;
                    switch (b) {
                        case 0:
                            o29Var.c = null;
                            return;
                        default:
                            o29Var.d = null;
                            return;
                    }
                }
            });
            this.a = z;
        }
        if (jg2Var.M0() != v29Var.b0.b() - 1) {
            z2 = true;
        }
        if (z2 != this.b) {
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f4 = v29Var.s;
            if (z2) {
                f2 = 1.0f;
            }
            this.d = c(f4, f2, new gu2(this) {
                public final o29 b;

                {
                    this.b = this;
                }

                @Override
                public final void accept(Object obj) {
                    byte b = r2;
                    o29 o29Var = this.b;
                    Float f42 = (Float) obj;
                    switch (b) {
                        case 0:
                            v29 v29Var2 = o29Var.e;
                            Paint paint = v29Var2.h;
                            float floatValue = f42.floatValue();
                            v29Var2.r = floatValue;
                            paint.setAlpha((int) (floatValue * 255.0f));
                            v29Var2.invalidate();
                            return;
                        default:
                            v29 v29Var3 = o29Var.e;
                            Paint paint2 = v29Var3.n;
                            float floatValue2 = f42.floatValue();
                            v29Var3.s = floatValue2;
                            paint2.setAlpha((int) (floatValue2 * 255.0f));
                            v29Var3.invalidate();
                            return;
                    }
                }
            }, new Runnable(this) {
                public final o29 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r2;
                    o29 o29Var = this.b;
                    switch (b) {
                        case 0:
                            o29Var.c = null;
                            return;
                        default:
                            o29Var.d = null;
                            return;
                    }
                }
            });
            this.b = z2;
        }
    }
}
