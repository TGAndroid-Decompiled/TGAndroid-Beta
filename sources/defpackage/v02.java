package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v02 extends AnimatorListenerAdapter {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public v02(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        int i = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                n12 n12Var = (n12) obj2;
                n12Var.v2.setAlpha(0.0f);
                n12Var.v2.setTranslationY(hl.L(78.0f) + i);
                y02 y02Var = n12Var.Y1;
                f12 f12Var = n12Var.v2;
                Float valueOf = Float.valueOf(1.0f);
                y02Var.getClass();
                y02Var.a(f12Var, valueOf);
                n12Var.U2.setAlpha(0.0f);
                vpa vpaVar = new vpa((Object) n12Var.w2, (vk4) vpa.p, 0.0f);
                vpaVar.m.a(0.75f);
                vpaVar.m.b(500.0f);
                vpaVar.b(new i10(this, (byte) 3));
                vpaVar.a(new x11(this, (vq0) obj, (byte) 2));
                n12Var.q3 = vpaVar;
                vpaVar.h();
                return;
            default:
                lp lpVar = (lp) obj2;
                ((d79) lpVar.d).scrollBy(0, i - ((int[]) obj)[0]);
                lpVar.c = null;
                return;
        }
    }
}
