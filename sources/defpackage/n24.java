package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
public class n24 extends v79 {
    public final byte a;
    public boolean b;
    public final o24 c;

    public n24(o24 o24Var, int i) {
        this.c = o24Var;
        this.a = i;
    }

    @Override
    public void a(RecyclerView recyclerView, int i) {
        ObjectAnimator objectAnimator;
        c24 c24Var;
        float f;
        int i2;
        final o24 o24Var = this.c;
        ObjectAnimator[] objectAnimatorArr = o24Var.S0;
        b89 b89Var = recyclerView.getLayoutManager().e;
        boolean z = true;
        if (b89Var != null && b89Var.e) {
            this.b = true;
            return;
        }
        final byte b = this.a;
        if (i == 0) {
            if (!this.b) {
                int[] iArr = o24Var.R0;
                p14 p14Var = o24Var.u1;
                if ((p14Var == null || !p14Var.z()) && b != 0) {
                    float f2 = 48.0f;
                    if (b == 1) {
                        f = 36.0f;
                    } else {
                        f = 48.0f;
                    }
                    float N = hl.N(f);
                    float f3 = iArr[b] / (-N);
                    if (f3 > 0.0f && f3 < 1.0f) {
                        HorizontalScrollView x = o24Var.x(b);
                        if (f3 > 0.5f) {
                            i2 = (int) (-Math.ceil(N));
                            o24Var.e(b, i2, false);
                        } else {
                            i2 = 0;
                        }
                        if (b == 1) {
                            o24Var.i(i2);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[b];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x, View.TRANSLATION_Y, x.getTranslationY(), i2);
                            objectAnimatorArr[b] = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    o24.this.R0[b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                }
                            });
                            objectAnimatorArr[b].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(x.getTranslationY(), i2);
                        }
                        objectAnimatorArr[b].start();
                    } else {
                        d79 w = o24Var.w(b);
                        if (b == 1) {
                            f2 = 38.0f;
                        }
                        int L = hl.L(f2);
                        f89 L2 = w.L(0);
                        if (L2 != null) {
                            int bottom = L2.a.getBottom();
                            int i3 = iArr[b];
                            float f4 = (bottom - (L + i3)) / o24Var.c1;
                            if (f4 > 0.0f || f4 < 1.0f) {
                                if (f4 <= 0.5f) {
                                    z = false;
                                }
                                o24Var.e(b, i3, z);
                            }
                        }
                    }
                }
            }
            if (o24Var.K0) {
                o24Var.K0 = false;
            }
            this.b = false;
            return;
        }
        if (i == 1) {
            if (o24Var.K0) {
                o24Var.K0 = false;
            }
            if (b != 0) {
                if (b != 1) {
                    if (b == 2) {
                        c24Var = o24Var.p0;
                    } else {
                        lq5.j(uh9.k(b, "Unexpected argument: "));
                        return;
                    }
                } else {
                    c24Var = o24Var.W;
                }
            } else {
                c24Var = o24Var.H0;
            }
            if (c24Var != null) {
                c24Var.a();
            }
            this.b = false;
        }
        if (!this.b && (objectAnimator = objectAnimatorArr[b]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[b].cancel();
        }
        if (b == 0) {
            if (o24Var.U0 == null) {
                h04 h04Var = new h04(o24Var, o24Var.d1, o24Var.u1.a(), o24Var.u1.f(), (byte) 0);
                o24Var.U0 = h04Var;
                h04Var.a();
            }
            o24Var.U0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i, int i2) {
        int L;
        o24 o24Var = this.c;
        byte b = this.a;
        o24Var.m(b);
        o24Var.o(b, i2);
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    o24Var.k(false);
                }
            } else {
                o24Var.h(false);
            }
        } else {
            o24Var.n(false);
        }
        if (!this.b) {
            float f = i2;
            FrameLayout frameLayout = o24Var.n;
            if (SystemClock.elapsedRealtime() - o24Var.D2 >= ViewConfiguration.getTapTimeout()) {
                o24Var.I += f;
                if (o24Var.h.getCurrentItem() == 0) {
                    L = hl.L(38.0f);
                } else {
                    L = hl.L(48.0f);
                }
                float f2 = o24Var.I;
                if (f2 >= L) {
                    o24Var.L(false);
                } else if (f2 <= (-L)) {
                    o24Var.L(true);
                } else if ((frameLayout.getTag() == null && o24Var.I < 0.0f) || (frameLayout.getTag() != null && o24Var.I > 0.0f)) {
                    o24Var.I = 0.0f;
                }
            }
        }
    }
}
