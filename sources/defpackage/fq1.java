package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class fq1 extends AnimatorListenerAdapter {
    public final byte a = 1;
    public final boolean b;
    public int c;
    public final Object d;
    public final fn7 e;

    public fq1(eja ejaVar, boolean z, int i, zha zhaVar) {
        this.e = ejaVar;
        this.b = z;
        this.c = i;
        this.d = zhaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a aVar;
        View m;
        int i;
        j79 adapter;
        byte b = this.a;
        Object obj = this.d;
        boolean z = this.b;
        fn7 fn7Var = this.e;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) fn7Var;
                zu1Var.g6 = true;
                ((e) zu1Var).fragmentBeginToShow = true;
                zu1Var.sa = null;
                if (z) {
                    zu1Var.Ha = false;
                }
                aVar = ((e) zu1Var).actionBar;
                aVar.invalidate();
                zu1Var.m1.invalidate();
                hl.d3(new go1(this, (byte) 3), 32L);
                ((Runnable) obj).run();
                return;
            default:
                int i2 = this.c;
                eja ejaVar = (eja) fn7Var;
                int[] iArr = ejaVar.p1;
                zha[] zhaVarArr = ejaVar.n0;
                ejaVar.r1 = false;
                if (z) {
                    int i3 = ejaVar.t1;
                    iArr[i2] = i3;
                    if (i2 == 0) {
                        xea.A(i3);
                    } else if (ejaVar.W(((zha) obj).F) >= 5) {
                        xea.E(ejaVar.t1);
                    }
                }
                for (int i4 = 0; i4 < zhaVarArr.length; i4++) {
                    zha zhaVar = zhaVarArr[i4];
                    if (zhaVar != null && zhaVar.h != null && (((i = zhaVar.F) == 0 || eja.j0(i)) && (adapter = zhaVarArr[i4].h.getAdapter()) != null)) {
                        int b2 = adapter.b();
                        if (i4 == 0) {
                            ejaVar.w1[0].g(false);
                        }
                        if (z) {
                            zhaVarArr[i4].x.x1(iArr[i2]);
                            zhaVarArr[i4].h.c0();
                            if (adapter.b() == b2) {
                                hl.V3(zhaVarArr[i4].h);
                            } else {
                                adapter.f();
                            }
                        }
                        zhaVarArr[i4].n.setVisibility(8);
                    }
                }
                if (ejaVar.s >= 0) {
                    for (int i5 = 0; i5 < zhaVarArr.length; i5++) {
                        zha zhaVar2 = zhaVarArr[i5];
                        if (zhaVar2.F == ejaVar.s1) {
                            if (z && (m = zhaVar2.r.m(ejaVar.s)) != null) {
                                ejaVar.w = m.getTop();
                            }
                            zha zhaVar3 = zhaVarArr[i5];
                            zhaVar3.x.g1(ejaVar.s, (-zhaVar3.h.getPaddingTop()) + ejaVar.w);
                        }
                    }
                } else {
                    ejaVar.e1();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        int i;
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                i = ((e) ((zu1) this.e)).currentAccount;
                this.c = jn7.f(i).p(null, this.c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public fq1(zu1 zu1Var, boolean z, Runnable runnable) {
        this.e = zu1Var;
        this.b = z;
        this.d = runnable;
    }
}
