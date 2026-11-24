package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class rp1 extends AnimatorListenerAdapter {
    public final byte a = 0;
    public final boolean b;
    public int c;
    public final Object d;
    public final gk7 e;

    public rp1(nfa nfaVar, boolean z, int i, iea ieaVar) {
        this.e = nfaVar;
        this.b = z;
        this.c = i;
        this.d = ieaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a aVar;
        View m;
        int i;
        w39 adapter;
        byte b = this.a;
        Object obj = this.d;
        boolean z = this.b;
        gk7 gk7Var = this.e;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) gk7Var;
                mu1Var.g6 = true;
                ((d) mu1Var).fragmentBeginToShow = true;
                mu1Var.sa = null;
                if (z) {
                    mu1Var.Ha = false;
                }
                aVar = ((d) mu1Var).actionBar;
                aVar.invalidate();
                mu1Var.m1.invalidate();
                gl.e3(new nv0(this, (byte) 29), 32L);
                ((Runnable) obj).run();
                return;
            default:
                int i2 = this.c;
                nfa nfaVar = (nfa) gk7Var;
                int[] iArr = nfaVar.p1;
                iea[] ieaVarArr = nfaVar.n0;
                nfaVar.r1 = false;
                if (z) {
                    int i3 = nfaVar.t1;
                    iArr[i2] = i3;
                    if (i2 == 0) {
                        gba.A(i3);
                    } else if (nfaVar.W(((iea) obj).F) >= 5) {
                        gba.E(nfaVar.t1);
                    }
                }
                for (int i4 = 0; i4 < ieaVarArr.length; i4++) {
                    iea ieaVar = ieaVarArr[i4];
                    if (ieaVar != null && ieaVar.h != null && (((i = ieaVar.F) == 0 || nfa.j0(i)) && (adapter = ieaVarArr[i4].h.getAdapter()) != null)) {
                        int b2 = adapter.b();
                        if (i4 == 0) {
                            nfaVar.w1[0].g(false);
                        }
                        if (z) {
                            ieaVarArr[i4].x.x1(iArr[i2]);
                            ieaVarArr[i4].h.b0();
                            if (adapter.b() == b2) {
                                gl.W3(ieaVarArr[i4].h);
                            } else {
                                adapter.f();
                            }
                        }
                        ieaVarArr[i4].n.setVisibility(8);
                    }
                }
                if (nfaVar.s >= 0) {
                    for (int i5 = 0; i5 < ieaVarArr.length; i5++) {
                        iea ieaVar2 = ieaVarArr[i5];
                        if (ieaVar2.F == nfaVar.s1) {
                            if (z && (m = ieaVar2.r.m(nfaVar.s)) != null) {
                                nfaVar.w = m.getTop();
                            }
                            iea ieaVar3 = ieaVarArr[i5];
                            ieaVar3.x.g1(nfaVar.s, (-ieaVar3.h.getPaddingTop()) + nfaVar.w);
                        }
                    }
                } else {
                    nfaVar.e1();
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
                i = ((d) ((mu1) this.e)).currentAccount;
                this.c = kk7.f(i).q(null, this.c, true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public rp1(mu1 mu1Var, boolean z, Runnable runnable) {
        this.e = mu1Var;
        this.b = z;
        this.d = runnable;
    }
}
