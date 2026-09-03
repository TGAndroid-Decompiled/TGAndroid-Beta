package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.yh;
public final class k3 extends AnimatorListenerAdapter {
    public final int f14332a;
    public final int f14333b;
    public final Object f14334c;
    public final Object d;

    public k3(Object obj, int i10, Object obj2, int i11) {
        this.f14332a = i11;
        this.d = obj;
        this.f14333b = i10;
        this.f14334c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f14332a) {
            case 0:
                g5 g5Var = (g5) this.d;
                g5Var.T1();
                p3 p3Var = g5Var.f14089c0;
                int i13 = 8;
                int i14 = this.f14333b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p3Var.setVisibility(i10);
                p3 p3Var2 = g5Var.f14110o0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                p3Var2.setVisibility(i11);
                p3 p3Var3 = g5Var.f14117v0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                p3Var3.setVisibility(i12);
                p3 p3Var4 = g5Var.f14119x0;
                if (i14 == 3) {
                    i13 = 0;
                }
                p3Var4.setVisibility(i13);
                g5Var.s2();
                g5Var.W0 = null;
                Runnable runnable = (Runnable) this.f14334c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                mi miVar = (mi) this.d;
                miVar.f29118v0.setAlpha(0.0f);
                miVar.f29118v0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f14333b);
                yh yhVar = miVar.f29054b0;
                ei eiVar = miVar.f29118v0;
                Float valueOf = Float.valueOf(1.0f);
                yhVar.getClass();
                yhVar.getClass();
                yhVar.b(eiVar, valueOf.floatValue());
                miVar.U0.setAlpha(0.0f);
                o1.j jVar = new o1.j(miVar.f29122w0, o1.h.f16321n, 0.0f);
                jVar.f16338u.a(0.75f);
                jVar.f16338u.b(500.0f);
                jVar.b(new org.telegram.ui.Components.f7(this, 3));
                jVar.a(new lb(2, this, (wg) this.f14334c));
                miVar.f29102q1 = jVar;
                jVar.f();
                return;
            default:
                b4.e0 e0Var = (b4.e0) this.d;
                ((sl0) e0Var.d).scrollBy(0, this.f14333b - ((int[]) this.f14334c)[0]);
                e0Var.f1475c = null;
                return;
        }
    }
}
