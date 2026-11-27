package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class i20 extends c79 {
    public final Activity c;
    public ArrayList d = new ArrayList();
    public String e;
    public g20 f;
    public boolean h;
    public final j20 n;

    public i20(j20 j20Var, Activity activity) {
        this.n = j20Var;
        this.c = activity;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (this.n.o2 && f89Var.b() == 0) {
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
        to3 to3Var = Utilities.g;
        g20 g20Var = new g20(this, str, (byte) 0);
        this.f = g20Var;
        to3Var.d(g20Var, 300L);
    }

    @Override
    public final int b() {
        int size;
        j20 j20Var = this.n;
        boolean z = j20Var.o2;
        if (j20Var.p1) {
            size = this.d.size();
        } else if (j20Var.q2.size() > 1) {
            size = j20Var.q2.size();
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
        j20 j20Var = this.n;
        View view = j20Var.o1;
        q10 q10Var = j20Var.r1;
        int i = 0;
        if (j20Var.q2.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.h) {
            if (j20Var.q2.size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.h = z2;
            if (z2) {
                q10Var.setVisibility(0);
                q10Var.setTranslationY(hl.q.y);
                q10Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final i20 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b = r2;
                        i20 i20Var = this.b;
                        switch (b) {
                            case 0:
                                i20Var.n.b.invalidate();
                                return;
                            default:
                                i20Var.n.b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(k43.h).start();
            } else {
                q10Var.animate().translationY(hl.q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final i20 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b = r2;
                        i20 i20Var = this.b;
                        switch (b) {
                            case 0:
                                i20Var.n.b.invalidate();
                                return;
                            default:
                                i20Var.n.b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(k43.h).withEndAction(new pz(this, (byte) 2)).start();
            }
        }
        int size = j20Var.q2.size();
        l10 l10Var = j20Var.x1;
        if (size > 1) {
            yob.h(aob.Ij, j20Var.J0, l10Var);
            view.setVisibility(0);
            q10Var.setPadding(0, q10Var.getPaddingTop(), 0, hl.L(231.0f));
        } else {
            yob.h(aob.Ij, j20Var.J0, l10Var);
            view.setVisibility(0);
            q10Var.setPadding(0, q10Var.getPaddingTop(), 0, 0);
        }
        j20Var.u1.setVisibility((j20Var.q1 && j20Var.t1.b() == 0) ? 8 : 8);
        j20Var.U0();
    }

    @Override
    public final void t(defpackage.f89 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i20.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        Activity activity = this.c;
        int i2 = 1;
        if (i == 1) {
            t62 t62Var = new t62(activity, (byte) 3);
            t62Var.setTag(-33024);
            return new f89(t62Var);
        }
        if (MediaController.z().D0 == null) {
            i2 = 0;
        }
        return new f89(new k20(i2, this.n.J0, activity));
    }
}
