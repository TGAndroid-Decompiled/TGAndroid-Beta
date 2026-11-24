package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class h20 extends n39 {
    public final Activity c;
    public ArrayList d = new ArrayList();
    public String e;
    public f20 f;
    public boolean h;
    public final i20 n;

    public h20(i20 i20Var, Activity activity) {
        this.n = i20Var;
        this.c = activity;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (this.n.o2 && s49Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            f();
            return;
        }
        co3 co3Var = Utilities.g;
        f20 f20Var = new f20(this, str, (byte) 0);
        this.f = f20Var;
        co3Var.d(f20Var, 300L);
    }

    @Override
    public final int b() {
        int size;
        i20 i20Var = this.n;
        boolean z = i20Var.o2;
        if (i20Var.p1) {
            size = this.d.size();
        } else if (i20Var.q2.size() > 1) {
            size = i20Var.q2.size();
        } else {
            return 0;
        }
        return size + (z ? 1 : 0);
    }

    @Override
    public final int d(int i) {
        if (this.n.o2 && i == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        boolean z;
        boolean z2;
        super.f();
        i20 i20Var = this.n;
        View view = i20Var.o1;
        p10 p10Var = i20Var.r1;
        int i = 0;
        if (i20Var.q2.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.h) {
            if (i20Var.q2.size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.h = z2;
            if (z2) {
                p10Var.setVisibility(0);
                p10Var.setTranslationY(gl.q.y);
                p10Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final h20 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b = r2;
                        h20 h20Var = this.b;
                        switch (b) {
                            case 0:
                                h20Var.n.b.invalidate();
                                return;
                            default:
                                h20Var.n.b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(s33.h).start();
            } else {
                p10Var.animate().translationY(gl.q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final h20 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b = r2;
                        h20 h20Var = this.b;
                        switch (b) {
                            case 0:
                                h20Var.n.b.invalidate();
                                return;
                            default:
                                h20Var.n.b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(s33.h).withEndAction(new oz(this, (byte) 2)).start();
            }
        }
        int size = i20Var.q2.size();
        k10 k10Var = i20Var.x1;
        if (size > 1) {
            zkb.h(bkb.Hj, i20Var.J0, k10Var);
            view.setVisibility(0);
            p10Var.setPadding(0, p10Var.getPaddingTop(), 0, gl.L(231.0f));
        } else {
            zkb.h(bkb.Hj, i20Var.J0, k10Var);
            view.setVisibility(0);
            p10Var.setPadding(0, p10Var.getPaddingTop(), 0, 0);
        }
        i20Var.u1.setVisibility((i20Var.q1 && i20Var.t1.b() == 0) ? 8 : 8);
        i20Var.T0();
    }

    @Override
    public final void t(defpackage.s49 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h20.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        Activity activity = this.c;
        int i2 = 1;
        if (i == 1) {
            d62 d62Var = new d62(activity, (byte) 3);
            d62Var.setTag(-33024);
            return new s49(d62Var);
        }
        if (MediaController.w().D0 == null) {
            i2 = 0;
        }
        return new s49(new j20(i2, this.n.J0, activity));
    }
}
