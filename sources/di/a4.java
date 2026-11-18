package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.si;
public final class a4 extends AnimatorListenerAdapter {
    public final int f8471a;
    public final int f8472b;
    public final Object f8473c;
    public final Object d;

    public a4(Object obj, int i7, Object obj2, int i10) {
        this.f8471a = i10;
        this.d = obj;
        this.f8472b = i7;
        this.f8473c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11;
        switch (this.f8471a) {
            case 0:
                f6 f6Var = (f6) this.d;
                f6Var.X1();
                j4 j4Var = f6Var.f8772c2;
                int i12 = 8;
                int i13 = this.f8472b;
                if (i13 == 0) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                j4Var.setVisibility(i7);
                j4 j4Var2 = f6Var.f8794o2;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                j4Var2.setVisibility(i10);
                j4 j4Var3 = f6Var.f8812x2;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                j4Var3.setVisibility(i11);
                j4 j4Var4 = f6Var.f8816z2;
                if (i13 == 3) {
                    i12 = 0;
                }
                j4Var4.setVisibility(i12);
                f6Var.J2();
                f6Var.Y2 = null;
                Runnable runnable = (Runnable) this.f8473c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                si siVar = (si) this.d;
                siVar.f39732w2.setAlpha(0.0f);
                siVar.f39732w2.setTranslationY(org.telegram.messenger.g0.L(78.0f) + this.f8472b);
                di diVar = siVar.Z1;
                ki kiVar = siVar.f39732w2;
                Float valueOf = Float.valueOf(1.0f);
                diVar.getClass();
                diVar.a(kiVar, valueOf);
                siVar.V2.setAlpha(0.0f);
                r1.g gVar = new r1.g((Object) siVar.f39736x2, (r1.e) r1.g.f56307p, 0.0f);
                gVar.f56323m.a(0.75f);
                gVar.f56323m.b(500.0f);
                gVar.b(new org.telegram.ui.Components.i7(this, 3));
                gVar.a(new bi.v0(4, this, (eh) this.f8473c));
                siVar.f39713r3 = gVar;
                gVar.h();
                return;
            default:
                a8.xa xaVar = (a8.xa) this.d;
                ((ck0) xaVar.d).scrollBy(0, this.f8472b - ((int[]) this.f8473c)[0]);
                xaVar.f714c = null;
                return;
        }
    }
}
