package defpackage;

import android.animation.AnimatorSet;
import java.util.LinkedList;
public final class w21 implements ht3 {
    public final byte a;
    public final Object b;
    public final Object c;

    public w21(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void a(zna znaVar, boolean z, float f, float f2) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                yt0 yt0Var = (yt0) obj;
                ((y21) obj2).setInOutOffset(0.0f);
                if (!z) {
                    yt0Var.run();
                    return;
                }
                return;
            case 1:
                co1 co1Var = (co1) obj;
                AnimatorSet animatorSet = ((i22) obj2).A0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    co1Var.run();
                    return;
                }
                return;
            case 2:
                i22 i22Var = (i22) ((q12) obj2).d;
                i22Var.w2.setTranslationY(0.0f);
                i22Var.w2.m(i22Var.i4);
                i22Var.X0.g();
                i22Var.b.invalidate();
                ((vr0) obj).run();
                i22Var.K1(0);
                return;
            case 3:
                d32 d32Var = (d32) obj2;
                Runnable runnable = (Runnable) obj;
                if (znaVar == d32Var.H) {
                    d32Var.H = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = d32Var.F;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f3 = d32Var.h;
                    if (f3 != -1.0f) {
                        boolean z2 = d32Var.s;
                        d32Var.s = true;
                        d32Var.setOffsetY(f3);
                        d32Var.h = -1.0f;
                        d32Var.s = z2;
                    }
                    d32Var.n = -2.1474836E9f;
                    return;
                }
                return;
            case 4:
                ((xv4) obj2).b(0.0f);
                ((qn4) obj).run();
                return;
            case 5:
                by7 by7Var = (by7) obj2;
                ah7 ah7Var = (ah7) obj;
                LinkedList linkedList = by7Var.V;
                by7Var.U = null;
                ah7Var.C = null;
                ah7Var.x();
                if (!z) {
                    ah7Var.h = 1.0f;
                    ah7Var.x();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        by7Var.W.poll();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                l6a l6aVar = (l6a) obj2;
                zna znaVar2 = (zna) obj;
                if (!z) {
                    l6aVar.z.remove(znaVar2);
                    znaVar.d();
                    return;
                }
                return;
            default:
                hy1 hy1Var = (hy1) obj2;
                zna znaVar3 = (zna) obj;
                if (!z) {
                    hy1Var.z.remove(znaVar3);
                    znaVar.d();
                    return;
                }
                hy1Var.getClass();
                return;
        }
    }
}
