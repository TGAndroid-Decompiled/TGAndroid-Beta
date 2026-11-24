package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q12 extends AnimatorListenerAdapter {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public q12(Object obj, int i, Object obj2, byte b) {
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
                i22 i22Var = (i22) obj2;
                i22Var.v2.setAlpha(0.0f);
                i22Var.v2.setTranslationY(gm.L(78.0f) + i);
                t12 t12Var = i22Var.Y1;
                a22 a22Var = i22Var.v2;
                Float valueOf = Float.valueOf(1.0f);
                t12Var.getClass();
                t12Var.a(a22Var, valueOf);
                i22Var.U2.setAlpha(0.0f);
                zna znaVar = new zna((Object) i22Var.w2, (vk4) zna.p, 0.0f);
                znaVar.m.a(0.75f);
                znaVar.m.b(500.0f);
                znaVar.b(new h20(this, (byte) 3));
                znaVar.a(new w21(this, (vr0) obj, (byte) 2));
                i22Var.q3 = znaVar;
                znaVar.h();
                return;
            default:
                kq kqVar = (kq) obj2;
                ((r59) kqVar.d).scrollBy(0, i - ((int[]) obj)[0]);
                kqVar.c = null;
                return;
        }
    }
}
