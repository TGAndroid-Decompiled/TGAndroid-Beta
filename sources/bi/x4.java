package bi;

import a8.ng;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ti;
public final class x4 extends AnimatorListenerAdapter {
    public final int f5674a;
    public final int f5675b;
    public final Object f5676c;
    public final Object d;

    public x4(Object obj, int i10, Object obj2, int i11) {
        this.f5674a = i11;
        this.d = obj;
        this.f5675b = i10;
        this.f5676c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f5674a) {
            case 0:
                h7 h7Var = (h7) this.d;
                h7Var.n2();
                f5 f5Var = h7Var.f4739g0;
                int i13 = 8;
                int i14 = this.f5675b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                f5Var.setVisibility(i10);
                f5 f5Var2 = h7Var.f4761s0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                f5Var2.setVisibility(i11);
                f5 f5Var3 = h7Var.B0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                f5Var3.setVisibility(i12);
                f5 f5Var4 = h7Var.D0;
                if (i14 == 3) {
                    i13 = 0;
                }
                f5Var4.setVisibility(i13);
                h7Var.W2();
                h7Var.f4732c1 = null;
                Runnable runnable = (Runnable) this.f5676c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ti tiVar = (ti) this.d;
                tiVar.B0.setAlpha(0.0f);
                tiVar.B0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f5675b);
                ei eiVar = tiVar.f32986e0;
                li liVar = tiVar.B0;
                Float valueOf = Float.valueOf(1.0f);
                eiVar.getClass();
                eiVar.a(liVar, valueOf);
                tiVar.f32974a1.setAlpha(0.0f);
                o1.j jVar = new o1.j(tiVar.C0, o1.h.f18952n, 0.0f);
                jVar.f18968u.a(0.75f);
                jVar.f18968u.b(500.0f);
                jVar.b(new org.telegram.ui.Components.n7(this, 3));
                jVar.a(new hi.k4(3, this, (gh) this.f5676c));
                tiVar.f33044w1 = jVar;
                jVar.h();
                return;
            default:
                ng ngVar = (ng) this.d;
                ((nm0) ngVar.d).scrollBy(0, this.f5675b - ((int[]) this.f5676c)[0]);
                ngVar.f640c = null;
                return;
        }
    }
}
