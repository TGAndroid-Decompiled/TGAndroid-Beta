package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.vh;
public final class y3 extends AnimatorListenerAdapter {
    public final int f9766a;
    public final int f9767b;
    public final Object f9768c;
    public final Object d;

    public y3(Object obj, int i7, Object obj2, int i10) {
        this.f9766a = i10;
        this.d = obj;
        this.f9767b = i7;
        this.f9768c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11;
        switch (this.f9766a) {
            case 0:
                c6 c6Var = (c6) this.d;
                c6Var.P1();
                g4 g4Var = c6Var.f8311c2;
                int i12 = 8;
                int i13 = this.f9767b;
                if (i13 == 0) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                g4Var.setVisibility(i7);
                g4 g4Var2 = c6Var.f8333o2;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                g4Var2.setVisibility(i10);
                g4 g4Var3 = c6Var.f8350x2;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                g4Var3.setVisibility(i11);
                g4 g4Var4 = c6Var.f8352z2;
                if (i13 == 3) {
                    i12 = 0;
                }
                g4Var4.setVisibility(i12);
                c6Var.v2();
                c6Var.Y2 = null;
                Runnable runnable = (Runnable) this.f9768c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ki kiVar = (ki) this.d;
                kiVar.f36509w2.setAlpha(0.0f);
                kiVar.f36509w2.setTranslationY(org.telegram.messenger.g0.L(78.0f) + this.f9767b);
                vh vhVar = kiVar.Z1;
                ci ciVar = kiVar.f36509w2;
                Float valueOf = Float.valueOf(1.0f);
                vhVar.getClass();
                vhVar.a(ciVar, valueOf);
                kiVar.V2.setAlpha(0.0f);
                r1.g gVar = new r1.g((Object) kiVar.f36513x2, (r1.e) r1.g.f55732p, 0.0f);
                gVar.f55748m.a(0.75f);
                gVar.f55748m.b(500.0f);
                gVar.b(new org.telegram.ui.Components.c7(this, 3));
                gVar.a(new bi.v0(4, this, (vg) this.f9768c));
                kiVar.f36490r3 = gVar;
                gVar.h();
                return;
            default:
                a8.xa xaVar = (a8.xa) this.d;
                ((uj0) xaVar.d).scrollBy(0, this.f9767b - ((int[]) this.f9768c)[0]);
                xaVar.f714c = null;
                return;
        }
    }
}
