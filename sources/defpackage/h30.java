package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class h30 extends q59 {
    public final Activity c;
    public ArrayList d = new ArrayList();
    public String e;
    public f30 f;
    public boolean h;
    public final i30 n;

    public h30(i30 i30Var, Activity activity) {
        this.n = i30Var;
        this.c = activity;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (this.n.o2 && u69Var.b() == 0) {
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
        mp3 mp3Var = Utilities.g;
        f30 f30Var = new f30(this, str, (byte) 0);
        this.f = f30Var;
        mp3Var.d(f30Var, 300L);
    }

    @Override
    public final int b() {
        int size;
        i30 i30Var = this.n;
        boolean z = i30Var.o2;
        if (i30Var.p1) {
            size = this.d.size();
        } else if (i30Var.q2.size() > 1) {
            size = i30Var.q2.size();
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
        i30 i30Var = this.n;
        View view = i30Var.o1;
        p20 p20Var = i30Var.r1;
        int i = 0;
        if (i30Var.q2.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.h) {
            if (i30Var.q2.size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.h = z2;
            if (z2) {
                p20Var.setVisibility(0);
                p20Var.setTranslationY(gm.q.y);
                p20Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final h30 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b = r2;
                        h30 h30Var = this.b;
                        switch (b) {
                            case 0:
                                h30Var.n.b.invalidate();
                                return;
                            default:
                                h30Var.n.b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(d53.h).start();
            } else {
                p20Var.animate().translationY(gm.q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final h30 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b = r2;
                        h30 h30Var = this.b;
                        switch (b) {
                            case 0:
                                h30Var.n.b.invalidate();
                                return;
                            default:
                                h30Var.n.b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(d53.h).withEndAction(new f00(this, (byte) 4)).start();
            }
        }
        int size = i30Var.q2.size();
        k20 k20Var = i30Var.x1;
        if (size > 1) {
            anb.h(cmb.Hj, i30Var.J0, k20Var);
            view.setVisibility(0);
            p20Var.setPadding(0, p20Var.getPaddingTop(), 0, gm.L(231.0f));
        } else {
            anb.h(cmb.Hj, i30Var.J0, k20Var);
            view.setVisibility(0);
            p20Var.setPadding(0, p20Var.getPaddingTop(), 0, 0);
        }
        i30Var.u1.setVisibility((i30Var.q1 && i30Var.t1.b() == 0) ? 8 : 8);
        i30Var.T0();
    }

    @Override
    public final void t(defpackage.u69 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h30.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        Activity activity = this.c;
        int i2 = 1;
        if (i == 1) {
            o72 o72Var = new o72(activity, (byte) 3);
            o72Var.setTag(-33024);
            return new u69(o72Var);
        }
        if (MediaController.w().D0 == null) {
            i2 = 0;
        }
        return new u69(new j30(i2, this.n.J0, activity));
    }
}
