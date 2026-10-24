package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.ri;
public final class c5 extends AnimatorListenerAdapter {
    public final int f1079a;
    public final int f1080b;
    public final Object f1081c;
    public final Object d;

    public c5(Object obj, int i10, Object obj2, int i11) {
        this.f1079a = i11;
        this.d = obj;
        this.f1080b = i10;
        this.f1081c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f1079a) {
            case 0:
                l7 l7Var = (l7) this.d;
                l7Var.n2();
                k5 k5Var = l7Var.f1722g0;
                int i13 = 8;
                int i14 = this.f1080b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                k5Var.setVisibility(i10);
                k5 k5Var2 = l7Var.f1744s0;
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
                l7Var.W2();
                l7Var.f1715c1 = null;
                Runnable runnable = (Runnable) this.f1081c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ri riVar = (ri) this.d;
                riVar.B0.setAlpha(0.0f);
                riVar.B0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f1080b);
                fi fiVar = riVar.f30142e0;
                ji jiVar = riVar.B0;
                Float valueOf = Float.valueOf(1.0f);
                fiVar.getClass();
                fiVar.a(jiVar, valueOf);
                riVar.f30130a1.setAlpha(0.0f);
                o1.k kVar = new o1.k(riVar.C0, o1.h.f17605n, 0.0f);
                kVar.f17622u.a(0.75f);
                kVar.f17622u.b(500.0f);
                kVar.b(new org.telegram.ui.Components.j7(this, 3));
                kVar.a(new gi.b4(3, this, (eh) this.f1081c));
                riVar.f30200w1 = kVar;
                kVar.h();
                return;
            default:
                a5.a aVar = (a5.a) this.d;
                ((lm0) aVar.d).scrollBy(0, this.f1080b - ((int[]) this.f1081c)[0]);
                aVar.f282c = null;
                return;
        }
    }
}
