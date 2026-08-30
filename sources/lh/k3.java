package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.yh;
public final class k3 extends AnimatorListenerAdapter {
    public final int f12701a;
    public final int f12702b;
    public final Object f12703c;
    public final Object d;

    public k3(Object obj, int i10, Object obj2, int i11) {
        this.f12701a = i11;
        this.d = obj;
        this.f12702b = i10;
        this.f12703c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f12701a) {
            case 0:
                g5 g5Var = (g5) this.d;
                g5Var.T1();
                p3 p3Var = g5Var.f12470c0;
                int i13 = 8;
                int i14 = this.f12702b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p3Var.setVisibility(i10);
                p3 p3Var2 = g5Var.f12491o0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                p3Var2.setVisibility(i11);
                p3 p3Var3 = g5Var.f12498v0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                p3Var3.setVisibility(i12);
                p3 p3Var4 = g5Var.f12500x0;
                if (i14 == 3) {
                    i13 = 0;
                }
                p3Var4.setVisibility(i13);
                g5Var.s2();
                g5Var.W0 = null;
                Runnable runnable = (Runnable) this.f12703c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                li liVar = (li) this.d;
                liVar.f26748v0.setAlpha(0.0f);
                liVar.f26748v0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f12702b);
                yh yhVar = liVar.f26685b0;
                di diVar = liVar.f26748v0;
                Float valueOf = Float.valueOf(1.0f);
                yhVar.getClass();
                yhVar.getClass();
                yhVar.b(diVar, valueOf.floatValue());
                liVar.U0.setAlpha(0.0f);
                o1.j jVar = new o1.j(liVar.f26752w0, o1.h.f16182n, 0.0f);
                jVar.f16198u.a(0.75f);
                jVar.f16198u.b(500.0f);
                jVar.b(new org.telegram.ui.Components.f7(this, 3));
                jVar.a(new lb(2, this, (wg) this.f12703c));
                liVar.f26732q1 = jVar;
                jVar.f();
                return;
            default:
                b4.e0 e0Var = (b4.e0) this.d;
                ((sl0) e0Var.d).scrollBy(0, this.f12702b - ((int[]) this.f12703c)[0]);
                e0Var.f1368c = null;
                return;
        }
    }
}
