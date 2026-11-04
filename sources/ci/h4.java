package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b8.kg;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.lh;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.tj0;
public final class h4 extends AnimatorListenerAdapter {
    public final int f5214a;
    public final int f5215b;
    public final Object f5216c;
    public final Object d;

    public h4(Object obj, int i3, Object obj2, int i10) {
        this.f5214a = i10;
        this.d = obj;
        this.f5215b = i3;
        this.f5216c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        int i10;
        int i11;
        switch (this.f5214a) {
            case 0:
                l6 l6Var = (l6) this.d;
                l6Var.P1();
                p4 p4Var = l6Var.Z1;
                int i12 = 8;
                int i13 = this.f5215b;
                if (i13 == 0) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                p4Var.setVisibility(i3);
                p4 p4Var2 = l6Var.f5466l2;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p4Var2.setVisibility(i10);
                p4 p4Var3 = l6Var.f5483u2;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                p4Var3.setVisibility(i11);
                p4 p4Var4 = l6Var.f5485w2;
                if (i13 == 3) {
                    i12 = 0;
                }
                p4Var4.setVisibility(i12);
                l6Var.u2();
                l6Var.V2 = null;
                Runnable runnable = (Runnable) this.f5216c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                bi biVar = (bi) this.d;
                biVar.f32275t2.setAlpha(0.0f);
                biVar.f32275t2.setTranslationY(org.telegram.messenger.g0.L(78.0f) + this.f5215b);
                lh lhVar = biVar.W1;
                th thVar = biVar.f32275t2;
                Float valueOf = Float.valueOf(1.0f);
                lhVar.getClass();
                lhVar.a(thVar, valueOf);
                biVar.S2.setAlpha(0.0f);
                q1.g gVar = new q1.g((Object) biVar.f32279u2, (q1.e) q1.g.f53637p, 0.0f);
                gVar.f53653m.a(0.75f);
                gVar.f53653m.b(500.0f);
                gVar.b(new org.telegram.ui.Components.c7(this, 3));
                gVar.a(new ii.z3(3, this, (ng) this.f5216c));
                biVar.f32256o3 = gVar;
                gVar.h();
                return;
            default:
                kg kgVar = (kg) this.d;
                ((tj0) kgVar.d).scrollBy(0, this.f5215b - ((int[]) this.f5216c)[0]);
                kgVar.f2723c = null;
                return;
        }
    }
}
