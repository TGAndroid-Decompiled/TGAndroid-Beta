package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
public class d34 extends k69 {
    public final byte a;
    public boolean b;
    public final e34 c;

    public d34(e34 e34Var, int i) {
        this.c = e34Var;
        this.a = i;
    }

    @Override
    public void a(RecyclerView recyclerView, int i) {
        ObjectAnimator objectAnimator;
        s24 s24Var;
        float f;
        int i2;
        final e34 e34Var = this.c;
        ObjectAnimator[] objectAnimatorArr = e34Var.S0;
        q69 q69Var = recyclerView.getLayoutManager().e;
        boolean z = true;
        if (q69Var != null && q69Var.e) {
            this.b = true;
            return;
        }
        final byte b = this.a;
        if (i == 0) {
            if (!this.b) {
                int[] iArr = e34Var.R0;
                f24 f24Var = e34Var.u1;
                if ((f24Var == null || !f24Var.z()) && b != 0) {
                    float f2 = 48.0f;
                    if (b == 1) {
                        f = 36.0f;
                    } else {
                        f = 48.0f;
                    }
                    float N = gm.N(f);
                    float f3 = iArr[b] / (-N);
                    if (f3 > 0.0f && f3 < 1.0f) {
                        HorizontalScrollView w = e34Var.w(b);
                        if (f3 > 0.5f) {
                            i2 = (int) (-Math.ceil(N));
                            e34Var.e(b, i2, false);
                        } else {
                            i2 = 0;
                        }
                        if (b == 1) {
                            e34Var.i(i2);
                        }
                        ObjectAnimator objectAnimator2 = objectAnimatorArr[b];
                        if (objectAnimator2 == null) {
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(w, View.TRANSLATION_Y, w.getTranslationY(), i2);
                            objectAnimatorArr[b] = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    e34.this.R0[b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                }
                            });
                            objectAnimatorArr[b].setDuration(200L);
                        } else {
                            objectAnimator2.setFloatValues(w.getTranslationY(), i2);
                        }
                        objectAnimatorArr[b].start();
                    } else {
                        r59 v = e34Var.v(b);
                        if (b == 1) {
                            f2 = 38.0f;
                        }
                        int L = gm.L(f2);
                        u69 K = v.K(0);
                        if (K != null) {
                            int bottom = K.a.getBottom();
                            int i3 = iArr[b];
                            float f4 = (bottom - (L + i3)) / e34Var.c1;
                            if (f4 > 0.0f || f4 < 1.0f) {
                                if (f4 <= 0.5f) {
                                    z = false;
                                }
                                e34Var.e(b, i3, z);
                            }
                        }
                    }
                }
            }
            if (e34Var.K0) {
                e34Var.K0 = false;
            }
            this.b = false;
            return;
        }
        if (i == 1) {
            if (e34Var.K0) {
                e34Var.K0 = false;
            }
            if (b != 0) {
                if (b != 1) {
                    if (b == 2) {
                        s24Var = e34Var.p0;
                    } else {
                        u36.j(hg9.j(b, "Unexpected argument: "));
                        return;
                    }
                } else {
                    s24Var = e34Var.W;
                }
            } else {
                s24Var = e34Var.H0;
            }
            if (s24Var != null) {
                s24Var.a();
            }
            this.b = false;
        }
        if (!this.b && (objectAnimator = objectAnimatorArr[b]) != null && objectAnimator.isRunning()) {
            objectAnimatorArr[b].cancel();
        }
        if (b == 0) {
            if (e34Var.U0 == null) {
                w04 w04Var = new w04(e34Var, e34Var.d1, e34Var.u1.a(), e34Var.u1.f(), (byte) 0);
                e34Var.U0 = w04Var;
                w04Var.a();
            }
            e34Var.U0.b();
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i, int i2) {
        int L;
        e34 e34Var = this.c;
        byte b = this.a;
        e34Var.m(b);
        e34Var.o(b, i2);
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    e34Var.k(false);
                }
            } else {
                e34Var.h(false);
            }
        } else {
            e34Var.n(false);
        }
        if (!this.b) {
            float f = i2;
            FrameLayout frameLayout = e34Var.n;
            if (SystemClock.elapsedRealtime() - e34Var.D2 >= ViewConfiguration.getTapTimeout()) {
                e34Var.I += f;
                if (e34Var.h.getCurrentItem() == 0) {
                    L = gm.L(38.0f);
                } else {
                    L = gm.L(48.0f);
                }
                float f2 = e34Var.I;
                if (f2 >= L) {
                    e34Var.L(false);
                } else if (f2 <= (-L)) {
                    e34Var.L(true);
                } else if ((frameLayout.getTag() == null && e34Var.I < 0.0f) || (frameLayout.getTag() != null && e34Var.I > 0.0f)) {
                    e34Var.I = 0.0f;
                }
            }
        }
    }
}
