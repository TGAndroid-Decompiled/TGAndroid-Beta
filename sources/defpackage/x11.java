package defpackage;

import android.animation.AnimatorSet;
import java.util.LinkedList;
public final class x11 implements ps3 {
    public final byte a;
    public final Object b;
    public final Object c;

    public x11(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void a(vpa vpaVar, boolean z, float f, float f2) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                fv0 fv0Var = (fv0) obj;
                ((z11) obj2).setInOutOffset(0.0f);
                if (!z) {
                    fv0Var.run();
                    return;
                }
                return;
            case 1:
                on1 on1Var = (on1) obj;
                AnimatorSet animatorSet = ((n12) obj2).A0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    on1Var.run();
                    return;
                }
                return;
            case 2:
                n12 n12Var = (n12) ((v02) obj2).d;
                n12Var.w2.setTranslationY(0.0f);
                n12Var.w2.m(n12Var.i4);
                n12Var.X0.g();
                n12Var.b.invalidate();
                ((vq0) obj).run();
                n12Var.L1(0);
                return;
            case 3:
                i22 i22Var = (i22) obj2;
                Runnable runnable = (Runnable) obj;
                if (vpaVar == i22Var.H) {
                    i22Var.H = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = i22Var.F;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f3 = i22Var.h;
                    if (f3 != -1.0f) {
                        boolean z2 = i22Var.s;
                        i22Var.s = true;
                        i22Var.setOffsetY(f3);
                        i22Var.h = -1.0f;
                        i22Var.s = z2;
                    }
                    i22Var.n = -2.1474836E9f;
                    return;
                }
                return;
            case 4:
                ((zv4) obj2).b(0.0f);
                ((rj4) obj).run();
                return;
            case 5:
                fz7 fz7Var = (fz7) obj2;
                ih7 ih7Var = (ih7) obj;
                LinkedList linkedList = fz7Var.V;
                fz7Var.U = null;
                ih7Var.C = null;
                ih7Var.x();
                if (!z) {
                    ih7Var.h = 1.0f;
                    ih7Var.x();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        fz7Var.W.poll();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                b8a b8aVar = (b8a) obj2;
                vpa vpaVar2 = (vpa) obj;
                if (!z) {
                    b8aVar.z.remove(vpaVar2);
                    vpaVar.d();
                    return;
                }
                return;
            default:
                ix1 ix1Var = (ix1) obj2;
                vpa vpaVar3 = (vpa) obj;
                if (!z) {
                    ix1Var.z.remove(vpaVar3);
                    vpaVar.d();
                    return;
                }
                ix1Var.getClass();
                return;
        }
    }
}
