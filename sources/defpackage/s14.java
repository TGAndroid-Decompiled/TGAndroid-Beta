package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
public class s14 extends i49 {
    public final byte a;
    public boolean b;
    public final t14 c;

    public s14(t14 t14Var, int i) {
        this.c = t14Var;
        this.a = i;
    }

    @Override
    public void a(RecyclerView recyclerView, int i) {
        ObjectAnimator objectAnimator;
        h14 h14Var;
        float f;
        int i2;
        final t14 t14Var = this.c;
        ObjectAnimator[] objectAnimatorArr = t14Var.S0;
        o49 o49Var = recyclerView.getLayoutManager().e;
        boolean z = true;
        if (o49Var != null && o49Var.e) {
            this.b = true;
            return;
        }
        final byte b = this.a;
        if (i == 0) {
            if (!this.b) {
                int[] iArr = t14Var.R0;
                u04 u04Var = t14Var.u1;
                if ((u04Var == null || !u04Var.z()) && b != 0) {
                    float f2 = 48.0f;
                    if (b == 1) {
                        f = 36.0f;
                    } else {
                        f = 48.0f;
                    }
                    float N = gl.N(f);
                    float f3 = iArr[b] / (-N);
                    if (f3 > 0.0f && f3 < 1.0f) {
                        HorizontalScrollView x = t14Var.x(b);
                        if (f3 > 0.5f) {
                            i2 = (int) (-Math.ceil(N));
                            t14Var.e(b, i2, false);
                        } else {
                            i2 = 0;
                        }
                        if (b == 1) {
                            t14Var.i(i2);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[b];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x, View.TRANSLATION_Y, x.getTranslationY(), i2);
                            objectAnimatorArr[b] = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    t14.this.R0[b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                }
                            });
                            objectAnimatorArr[b].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(x.getTranslationY(), i2);
                        }
                        objectAnimatorArr[b].start();
                    } else {
                        o39 w = t14Var.w(b);
                        if (b == 1) {
                            f2 = 38.0f;
                        }
                        int L = gl.L(f2);
                        s49 K = w.K(0);
                        if (K != null) {
                            int bottom = K.a.getBottom();
                            int i3 = iArr[b];
                            float f4 = (bottom - (L + i3)) / t14Var.c1;
                            if (f4 > 0.0f || f4 < 1.0f) {
                                if (f4 <= 0.5f) {
                                    z = false;
                                }
                                t14Var.e(b, i3, z);
                            }
                        }
                    }
                }
            }
            if (t14Var.K0) {
                t14Var.K0 = false;
            }
            this.b = false;
            return;
        }
        if (i == 1) {
            if (t14Var.K0) {
                t14Var.K0 = false;
            }
            if (b != 0) {
                if (b != 1) {
                    if (b == 2) {
                        h14Var = t14Var.p0;
                    } else {
                        w26.j(de9.k(b, "Unexpected argument: "));
                        return;
                    }
                } else {
                    h14Var = t14Var.W;
                }
            } else {
                h14Var = t14Var.H0;
            }
            if (h14Var != null) {
                h14Var.a();
            }
            this.b = false;
        }
        if (!this.b && (objectAnimator = objectAnimatorArr[b]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[b].cancel();
        }
        if (b == 0) {
            if (t14Var.U0 == null) {
                mz3 mz3Var = new mz3(t14Var, t14Var.d1, t14Var.u1.a(), t14Var.u1.f(), (byte) 0);
                t14Var.U0 = mz3Var;
                mz3Var.a();
            }
            t14Var.U0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i, int i2) {
        int L;
        t14 t14Var = this.c;
        byte b = this.a;
        t14Var.m(b);
        t14Var.o(b, i2);
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    t14Var.k(false);
                }
            } else {
                t14Var.h(false);
            }
        } else {
            t14Var.n(false);
        }
        if (!this.b) {
            float f = i2;
            FrameLayout frameLayout = t14Var.n;
            if (SystemClock.elapsedRealtime() - t14Var.D2 >= ViewConfiguration.getTapTimeout()) {
                t14Var.I += f;
                if (t14Var.h.getCurrentItem() == 0) {
                    L = gl.L(38.0f);
                } else {
                    L = gl.L(48.0f);
                }
                float f2 = t14Var.I;
                if (f2 >= L) {
                    t14Var.M(false);
                } else if (f2 <= (-L)) {
                    t14Var.M(true);
                } else if ((frameLayout.getTag() == null && t14Var.I < 0.0f) || (frameLayout.getTag() != null && t14Var.I > 0.0f)) {
                    t14Var.I = 0.0f;
                }
            }
        }
    }
}
