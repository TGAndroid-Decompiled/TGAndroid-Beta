package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.zk0;

public final class l3 extends AnimatorListenerAdapter {

    public final int f9665a;

    public final int f9666b;

    public final Object f9667c;
    public final Object d;

    public l3(Object obj, int i10, Object obj2, int i11) {
        this.f9665a = i11;
        this.d = obj;
        this.f9666b = i10;
        this.f9667c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9665a) {
            case 0:
                i5 i5Var = (i5) this.d;
                i5Var.T1();
                q3 q3Var = i5Var.f9453b0;
                int i10 = this.f9666b;
                q3Var.setVisibility(i10 == 0 ? 0 : 8);
                i5Var.f9474n0.setVisibility(i10 == 1 ? 0 : 8);
                i5Var.f9481u0.setVisibility(i10 == 2 ? 0 : 8);
                i5Var.f9483w0.setVisibility(i10 == 3 ? 0 : 8);
                i5Var.s2();
                i5Var.V0 = null;
                Runnable runnable = (Runnable) this.f9667c;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 1:
                gi giVar = (gi) this.d;
                giVar.f28696u0.setAlpha(0.0f);
                giVar.f28696u0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f9666b);
                uh uhVar = giVar.f28632a0;
                yh yhVar = giVar.f28696u0;
                Float fValueOf = Float.valueOf(1.0f);
                uhVar.getClass();
                uhVar.a(yhVar, fValueOf);
                giVar.T0.setAlpha(0.0f);
                o1.j jVar = new o1.j(giVar.f28699v0, o1.h.f19130n, 0.0f);
                jVar.f19147u.a(0.75f);
                jVar.f19147u.b(500.0f);
                jVar.b(new org.telegram.ui.Components.e7(this, 3));
                jVar.a(new nh.a4(3, this, (sg) this.f9667c));
                giVar.f28680p1 = jVar;
                jVar.f();
                break;
            default:
                b6.a aVar = (b6.a) this.d;
                ((zk0) aVar.d).scrollBy(0, this.f9666b - ((int[]) this.f9667c)[0]);
                aVar.f2033b = null;
                break;
        }
    }
}
