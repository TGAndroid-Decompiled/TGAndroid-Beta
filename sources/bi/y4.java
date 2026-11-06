package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.vh;
public final class y4 extends AnimatorListenerAdapter {
    public final int f5071a;
    public final int f5072b;
    public final Object f5073c;
    public final Object d;

    public y4(Object obj, int i7, Object obj2, int i10) {
        this.f5071a = i10;
        this.d = obj;
        this.f5072b = i7;
        this.f5073c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11;
        switch (this.f5071a) {
            case 0:
                k7 k7Var = (k7) this.d;
                k7Var.P1();
                h5 h5Var = k7Var.Y1;
                int i12 = 8;
                int i13 = this.f5072b;
                if (i13 == 0) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                h5Var.setVisibility(i7);
                h5 h5Var2 = k7Var.f4182k2;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                h5Var2.setVisibility(i10);
                h5 h5Var3 = k7Var.f4199t2;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                h5Var3.setVisibility(i11);
                h5 h5Var4 = k7Var.f4201v2;
                if (i13 == 3) {
                    i12 = 0;
                }
                h5Var4.setVisibility(i12);
                k7Var.u2();
                k7Var.U2 = null;
                Runnable runnable = (Runnable) this.f5073c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                di diVar = (di) this.d;
                diVar.f32984s2.setAlpha(0.0f);
                diVar.f32984s2.setTranslationY(org.telegram.messenger.g0.L(78.0f) + this.f5072b);
                oh ohVar = diVar.V1;
                vh vhVar = diVar.f32984s2;
                Float valueOf = Float.valueOf(1.0f);
                ohVar.getClass();
                ohVar.a(vhVar, valueOf);
                diVar.R2.setAlpha(0.0f);
                r1.g gVar = new r1.g((Object) diVar.f32988t2, (r1.e) r1.g.f54158p, 0.0f);
                gVar.f54174m.a(0.75f);
                gVar.f54174m.b(500.0f);
                gVar.b(new org.telegram.ui.Components.e7(this, 3));
                gVar.a(new hi.y3(3, this, (qg) this.f5073c));
                diVar.f32966n3 = gVar;
                gVar.h();
                return;
            default:
                a8.wa waVar = (a8.wa) this.d;
                ((pj0) waVar.d).scrollBy(0, this.f5072b - ((int[]) this.f5073c)[0]);
                waVar.f701c = null;
                return;
        }
    }
}
