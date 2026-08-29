package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.pb;
import org.telegram.ui.Components.zg;
public final class l3 extends AnimatorListenerAdapter {
    public final int f12410a;
    public final int f12411b;
    public final Object f12412c;
    public final Object d;

    public l3(Object obj, int i10, Object obj2, int i11) {
        this.f12410a = i11;
        this.d = obj;
        this.f12411b = i10;
        this.f12412c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f12410a) {
            case 0:
                h5 h5Var = (h5) this.d;
                h5Var.T1();
                q3 q3Var = h5Var.f12165b0;
                int i13 = 8;
                int i14 = this.f12411b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                q3Var.setVisibility(i10);
                q3 q3Var2 = h5Var.f12186n0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                q3Var2.setVisibility(i11);
                q3 q3Var3 = h5Var.f12193u0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                q3Var3.setVisibility(i12);
                q3 q3Var4 = h5Var.f12195w0;
                if (i14 == 3) {
                    i13 = 0;
                }
                q3Var4.setVisibility(i13);
                h5Var.s2();
                h5Var.V0 = null;
                Runnable runnable = (Runnable) this.f12412c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ni niVar = (ni) this.d;
                niVar.f31051u0.setAlpha(0.0f);
                niVar.f31051u0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f12411b);
                bi biVar = niVar.f30987a0;
                fi fiVar = niVar.f31051u0;
                Float valueOf = Float.valueOf(1.0f);
                biVar.getClass();
                biVar.getClass();
                biVar.b(fiVar, valueOf.floatValue());
                niVar.T0.setAlpha(0.0f);
                o1.k kVar = new o1.k(niVar.f31054v0, o1.i.f19028n, 0.0f);
                kVar.f19045u.a(0.75f);
                kVar.f19045u.b(500.0f);
                kVar.b(new org.telegram.ui.Components.j7(this, 3));
                kVar.a(new pb(2, this, (zg) this.f12412c));
                niVar.f31035p1 = kVar;
                kVar.f();
                return;
            default:
                ag.j2 j2Var = (ag.j2) this.d;
                ((jl0) j2Var.d).scrollBy(0, this.f12411b - ((int[]) this.f12412c)[0]);
                j2Var.f559c = null;
                return;
        }
    }
}
