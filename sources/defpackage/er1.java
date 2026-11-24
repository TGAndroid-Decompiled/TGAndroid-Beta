package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class er1 extends AnimatorListenerAdapter {
    public final byte a = 1;
    public final boolean b;
    public int c;
    public final Object d;
    public final jm7 e;

    public er1(nha nhaVar, boolean z, int i, iga igaVar) {
        this.e = nhaVar;
        this.b = z;
        this.c = i;
        this.d = igaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a aVar;
        View m;
        int i;
        y59 adapter;
        byte b = this.a;
        Object obj = this.d;
        boolean z = this.b;
        jm7 jm7Var = this.e;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) jm7Var;
                yv1Var.g6 = true;
                ((d) yv1Var).fragmentBeginToShow = true;
                yv1Var.sa = null;
                if (z) {
                    yv1Var.Ha = false;
                }
                aVar = ((d) yv1Var).actionBar;
                aVar.invalidate();
                yv1Var.m1.invalidate();
                gm.d3(new fo1(this, (byte) 3), 32L);
                ((Runnable) obj).run();
                return;
            default:
                int i2 = this.c;
                nha nhaVar = (nha) jm7Var;
                int[] iArr = nhaVar.p1;
                iga[] igaVarArr = nhaVar.n0;
                nhaVar.r1 = false;
                if (z) {
                    int i3 = nhaVar.t1;
                    iArr[i2] = i3;
                    if (i2 == 0) {
                        gda.A(i3);
                    } else if (nhaVar.W(((iga) obj).F) >= 5) {
                        gda.E(nhaVar.t1);
                    }
                }
                for (int i4 = 0; i4 < igaVarArr.length; i4++) {
                    iga igaVar = igaVarArr[i4];
                    if (igaVar != null && igaVar.h != null && (((i = igaVar.F) == 0 || nha.j0(i)) && (adapter = igaVarArr[i4].h.getAdapter()) != null)) {
                        int b2 = adapter.b();
                        if (i4 == 0) {
                            nhaVar.w1[0].g(false);
                        }
                        if (z) {
                            igaVarArr[i4].x.x1(iArr[i2]);
                            igaVarArr[i4].h.b0();
                            if (adapter.b() == b2) {
                                gm.V3(igaVarArr[i4].h);
                            } else {
                                adapter.f();
                            }
                        }
                        igaVarArr[i4].n.setVisibility(8);
                    }
                }
                if (nhaVar.s >= 0) {
                    for (int i5 = 0; i5 < igaVarArr.length; i5++) {
                        iga igaVar2 = igaVarArr[i5];
                        if (igaVar2.F == nhaVar.s1) {
                            if (z && (m = igaVar2.r.m(nhaVar.s)) != null) {
                                nhaVar.w = m.getTop();
                            }
                            iga igaVar3 = igaVarArr[i5];
                            igaVar3.x.g1(nhaVar.s, (-igaVar3.h.getPaddingTop()) + nhaVar.w);
                        }
                    }
                } else {
                    nhaVar.e1();
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
                i = ((d) ((yv1) this.e)).currentAccount;
                this.c = nm7.f(i).p(null, this.c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public er1(yv1 yv1Var, boolean z, Runnable runnable) {
        this.e = yv1Var;
        this.b = z;
        this.d = runnable;
    }
}
