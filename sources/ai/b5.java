package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
public final class b5 extends AnimatorListenerAdapter {
    public final int f1025a;
    public final int f1026b;
    public final Object f1027c;
    public final Object d;

    public b5(Object obj, int i10, Object obj2, int i11) {
        this.f1025a = i11;
        this.d = obj;
        this.f1026b = i10;
        this.f1027c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f1025a) {
            case 0:
                k7 k7Var = (k7) this.d;
                k7Var.o2();
                j5 j5Var = k7Var.f1659g0;
                int i13 = 8;
                int i14 = this.f1026b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                j5Var.setVisibility(i10);
                j5 j5Var2 = k7Var.f1681s0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                j5Var2.setVisibility(i11);
                j5 j5Var3 = k7Var.B0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                j5Var3.setVisibility(i12);
                j5 j5Var4 = k7Var.D0;
                if (i14 == 3) {
                    i13 = 0;
                }
                j5Var4.setVisibility(i13);
                k7Var.X2();
                k7Var.f1652c1 = null;
                Runnable runnable = (Runnable) this.f1027c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ti tiVar = (ti) this.d;
                tiVar.B0.setAlpha(0.0f);
                tiVar.B0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f1026b);
                hi hiVar = tiVar.f30532e0;
                li liVar = tiVar.B0;
                Float valueOf = Float.valueOf(1.0f);
                hiVar.getClass();
                hiVar.a(liVar, valueOf);
                tiVar.f30520a1.setAlpha(0.0f);
                o1.k kVar = new o1.k(tiVar.C0, o1.h.f17544n, 0.0f);
                kVar.f17561u.a(0.75f);
                kVar.f17561u.b(500.0f);
                kVar.b(new org.telegram.ui.Components.l7(this, 3));
                kVar.a(new gi.b4(3, this, (gh) this.f1027c));
                tiVar.f30590w1 = kVar;
                kVar.h();
                return;
            default:
                a5.a aVar = (a5.a) this.d;
                ((im0) aVar.d).scrollBy(0, this.f1026b - ((int[]) this.f1027c)[0]);
                aVar.f282c = null;
                return;
        }
    }
}
