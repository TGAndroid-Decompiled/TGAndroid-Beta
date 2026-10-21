package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
public final class c5 extends AnimatorListenerAdapter {
    public final int f1077a;
    public final int f1078b;
    public final Object f1079c;
    public final Object d;

    public c5(Object obj, int i10, Object obj2, int i11) {
        this.f1077a = i11;
        this.d = obj;
        this.f1078b = i10;
        this.f1079c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f1077a) {
            case 0:
                l7 l7Var = (l7) this.d;
                l7Var.o2();
                k5 k5Var = l7Var.f1730g0;
                int i13 = 8;
                int i14 = this.f1078b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                k5Var.setVisibility(i10);
                k5 k5Var2 = l7Var.f1752s0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                k5Var2.setVisibility(i11);
                k5 k5Var3 = l7Var.B0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                k5Var3.setVisibility(i12);
                k5 k5Var4 = l7Var.D0;
                if (i14 == 3) {
                    i13 = 0;
                }
                k5Var4.setVisibility(i13);
                l7Var.X2();
                l7Var.f1723c1 = null;
                Runnable runnable = (Runnable) this.f1079c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ti tiVar = (ti) this.d;
                tiVar.B0.setAlpha(0.0f);
                tiVar.B0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f1078b);
                hi hiVar = tiVar.f30542e0;
                li liVar = tiVar.B0;
                Float valueOf = Float.valueOf(1.0f);
                hiVar.getClass();
                hiVar.a(liVar, valueOf);
                tiVar.f30530a1.setAlpha(0.0f);
                o1.k kVar = new o1.k(tiVar.C0, o1.h.f17542n, 0.0f);
                kVar.f17559u.a(0.75f);
                kVar.f17559u.b(500.0f);
                kVar.b(new org.telegram.ui.Components.l7(this, 3));
                kVar.a(new gi.b4(3, this, (gh) this.f1079c));
                tiVar.f30600w1 = kVar;
                kVar.h();
                return;
            default:
                a5.a aVar = (a5.a) this.d;
                ((jm0) aVar.d).scrollBy(0, this.f1078b - ((int[]) this.f1079c)[0]);
                aVar.f282c = null;
                return;
        }
    }
}
