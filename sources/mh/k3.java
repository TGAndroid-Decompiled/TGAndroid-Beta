package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.yh;
public final class k3 extends AnimatorListenerAdapter {
    public final int f14330a;
    public final int f14331b;
    public final Object f14332c;
    public final Object d;

    public k3(Object obj, int i10, Object obj2, int i11) {
        this.f14330a = i11;
        this.d = obj;
        this.f14331b = i10;
        this.f14332c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f14330a) {
            case 0:
                g5 g5Var = (g5) this.d;
                g5Var.T1();
                p3 p3Var = g5Var.f14087c0;
                int i13 = 8;
                int i14 = this.f14331b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p3Var.setVisibility(i10);
                p3 p3Var2 = g5Var.f14108o0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                p3Var2.setVisibility(i11);
                p3 p3Var3 = g5Var.f14115v0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                p3Var3.setVisibility(i12);
                p3 p3Var4 = g5Var.f14117x0;
                if (i14 == 3) {
                    i13 = 0;
                }
                p3Var4.setVisibility(i13);
                g5Var.s2();
                g5Var.W0 = null;
                Runnable runnable = (Runnable) this.f14332c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                mi miVar = (mi) this.d;
                miVar.f29100v0.setAlpha(0.0f);
                miVar.f29100v0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f14331b);
                yh yhVar = miVar.f29036b0;
                ei eiVar = miVar.f29100v0;
                Float valueOf = Float.valueOf(1.0f);
                yhVar.getClass();
                yhVar.getClass();
                yhVar.b(eiVar, valueOf.floatValue());
                miVar.U0.setAlpha(0.0f);
                o1.j jVar = new o1.j(miVar.f29104w0, o1.h.f16319n, 0.0f);
                jVar.f16336u.a(0.75f);
                jVar.f16336u.b(500.0f);
                jVar.b(new org.telegram.ui.Components.f7(this, 3));
                jVar.a(new lb(2, this, (wg) this.f14332c));
                miVar.f29084q1 = jVar;
                jVar.f();
                return;
            default:
                b4.e0 e0Var = (b4.e0) this.d;
                ((tl0) e0Var.d).scrollBy(0, this.f14331b - ((int[]) this.f14332c)[0]);
                e0Var.f1475c = null;
                return;
        }
    }
}
