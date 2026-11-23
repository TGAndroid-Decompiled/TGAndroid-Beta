package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ti;
public final class a4 extends AnimatorListenerAdapter {
    public final int f8465a;
    public final int f8466b;
    public final Object f8467c;
    public final Object d;

    public a4(Object obj, int i7, Object obj2, int i10) {
        this.f8465a = i10;
        this.d = obj;
        this.f8466b = i7;
        this.f8467c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11;
        switch (this.f8465a) {
            case 0:
                f6 f6Var = (f6) this.d;
                f6Var.X1();
                j4 j4Var = f6Var.f8760c2;
                int i12 = 8;
                int i13 = this.f8466b;
                if (i13 == 0) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                j4Var.setVisibility(i7);
                j4 j4Var2 = f6Var.f8782o2;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                j4Var2.setVisibility(i10);
                j4 j4Var3 = f6Var.f8800x2;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                j4Var3.setVisibility(i11);
                j4 j4Var4 = f6Var.f8804z2;
                if (i13 == 3) {
                    i12 = 0;
                }
                j4Var4.setVisibility(i12);
                f6Var.J2();
                f6Var.Y2 = null;
                Runnable runnable = (Runnable) this.f8467c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ti tiVar = (ti) this.d;
                tiVar.f40029w2.setAlpha(0.0f);
                tiVar.f40029w2.setTranslationY(org.telegram.messenger.g0.L(78.0f) + this.f8466b);
                ei eiVar = tiVar.Z1;
                li liVar = tiVar.f40029w2;
                Float valueOf = Float.valueOf(1.0f);
                eiVar.getClass();
                eiVar.a(liVar, valueOf);
                tiVar.V2.setAlpha(0.0f);
                r1.g gVar = new r1.g((Object) tiVar.f40033x2, (r1.e) r1.g.f56430p, 0.0f);
                gVar.f56446m.a(0.75f);
                gVar.f56446m.b(500.0f);
                gVar.b(new org.telegram.ui.Components.i7(this, 3));
                gVar.a(new bi.y0(4, this, (fh) this.f8467c));
                tiVar.f40010r3 = gVar;
                gVar.h();
                return;
            default:
                a8.xa xaVar = (a8.xa) this.d;
                ((ek0) xaVar.d).scrollBy(0, this.f8466b - ((int[]) this.f8467c)[0]);
                xaVar.f714c = null;
                return;
        }
    }
}
