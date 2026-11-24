package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f02 extends AnimatorListenerAdapter {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public f02(Object obj, int i, Object obj2, byte b) {
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
                x02 x02Var = (x02) obj2;
                x02Var.v2.setAlpha(0.0f);
                x02Var.v2.setTranslationY(gl.L(78.0f) + i);
                i02 i02Var = x02Var.Y1;
                p02 p02Var = x02Var.v2;
                Float valueOf = Float.valueOf(1.0f);
                i02Var.getClass();
                i02Var.a(p02Var, valueOf);
                x02Var.U2.setAlpha(0.0f);
                yla ylaVar = new yla((Object) x02Var.w2, (ri4) yla.p, 0.0f);
                ylaVar.m.a(0.75f);
                ylaVar.m.b(500.0f);
                ylaVar.b(new h10(this, (byte) 3));
                ylaVar.a(new o11(this, (vq0) obj, (byte) 2));
                x02Var.q3 = ylaVar;
                ylaVar.h();
                return;
            default:
                kp kpVar = (kp) obj2;
                ((o39) kpVar.d).scrollBy(0, i - ((int[]) obj)[0]);
                kpVar.c = null;
                return;
        }
    }
}
