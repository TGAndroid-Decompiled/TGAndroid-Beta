package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.uh;
public final class y4 extends AnimatorListenerAdapter {
    public final int f5074a;
    public final int f5075b;
    public final Object f5076c;
    public final Object d;

    public y4(Object obj, int i7, Object obj2, int i10) {
        this.f5074a = i10;
        this.d = obj;
        this.f5075b = i7;
        this.f5076c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11;
        switch (this.f5074a) {
            case 0:
                k7 k7Var = (k7) this.d;
                k7Var.O1();
                h5 h5Var = k7Var.f4163b2;
                int i12 = 8;
                int i13 = this.f5075b;
                if (i13 == 0) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                h5Var.setVisibility(i7);
                h5 h5Var2 = k7Var.f4185n2;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                h5Var2.setVisibility(i10);
                h5 h5Var3 = k7Var.f4202w2;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                h5Var3.setVisibility(i11);
                h5 h5Var4 = k7Var.f4204y2;
                if (i13 == 3) {
                    i12 = 0;
                }
                h5Var4.setVisibility(i12);
                k7Var.u2();
                k7Var.X2 = null;
                Runnable runnable = (Runnable) this.f5076c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ci ciVar = (ci) this.d;
                ciVar.f32660v2.setAlpha(0.0f);
                ciVar.f32660v2.setTranslationY(org.telegram.messenger.g0.L(78.0f) + this.f5075b);
                nh nhVar = ciVar.Y1;
                uh uhVar = ciVar.f32660v2;
                Float valueOf = Float.valueOf(1.0f);
                nhVar.getClass();
                nhVar.a(uhVar, valueOf);
                ciVar.U2.setAlpha(0.0f);
                r1.g gVar = new r1.g((Object) ciVar.f32664w2, (r1.e) r1.g.f54263p, 0.0f);
                gVar.f54279m.a(0.75f);
                gVar.f54279m.b(500.0f);
                gVar.b(new org.telegram.ui.Components.d7(this, 3));
                gVar.a(new hi.y3(3, this, (pg) this.f5076c));
                ciVar.f32641q3 = gVar;
                gVar.h();
                return;
            default:
                a8.wa waVar = (a8.wa) this.d;
                ((pj0) waVar.d).scrollBy(0, this.f5075b - ((int[]) this.f5076c)[0]);
                waVar.f701c = null;
                return;
        }
    }
}
