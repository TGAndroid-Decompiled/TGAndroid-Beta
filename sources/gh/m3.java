package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yh;
public final class m3 extends AnimatorListenerAdapter {
    public final int f8540a;
    public final int f8541b;
    public final Object f8542c;
    public final Object d;

    public m3(Object obj, int i9, Object obj2, int i10) {
        this.f8540a = i10;
        this.d = obj;
        this.f8541b = i9;
        this.f8542c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        int i10;
        int i11;
        switch (this.f8540a) {
            case 0:
                k5 k5Var = (k5) this.d;
                k5Var.T1();
                r3 r3Var = k5Var.f8399b0;
                int i12 = 8;
                int i13 = this.f8541b;
                if (i13 == 0) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                r3Var.setVisibility(i9);
                r3 r3Var2 = k5Var.f8420n0;
                if (i13 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                r3Var2.setVisibility(i10);
                r3 r3Var3 = k5Var.f8427u0;
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                r3Var3.setVisibility(i11);
                r3 r3Var4 = k5Var.f8429w0;
                if (i13 == 3) {
                    i12 = 0;
                }
                r3Var4.setVisibility(i12);
                k5Var.s2();
                k5Var.V0 = null;
                Runnable runnable = (Runnable) this.f8542c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ki kiVar = (ki) this.d;
                kiVar.f30160u0.setAlpha(0.0f);
                kiVar.f30160u0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f8541b);
                yh yhVar = kiVar.f30096a0;
                ci ciVar = kiVar.f30160u0;
                Float valueOf = Float.valueOf(1.0f);
                yhVar.getClass();
                yhVar.getClass();
                yhVar.b(ciVar, valueOf.floatValue());
                kiVar.T0.setAlpha(0.0f);
                o1.j jVar = new o1.j(kiVar.f30163v0, o1.h.f18783n, 0.0f);
                jVar.f18800u.a(0.75f);
                jVar.f18800u.b(500.0f);
                jVar.b(new org.telegram.ui.Components.e7(this, 3));
                jVar.a(new mh.c4(3, this, (wg) this.f8542c));
                kiVar.f30144p1 = jVar;
                jVar.f();
                return;
            default:
                a6.a aVar = (a6.a) this.d;
                ((wk0) aVar.d).scrollBy(0, this.f8541b - ((int[]) this.f8542c)[0]);
                aVar.f101b = null;
                return;
        }
    }
}
