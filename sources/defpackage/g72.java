package defpackage;

import java.util.concurrent.atomic.AtomicReference;
public final class g72 implements Runnable {
    public final byte a;
    public final o72 b;

    public g72(o72 o72Var, byte b) {
        this.a = b;
        this.b = o72Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        o72 o72Var = this.b;
        switch (b) {
            case 0:
                AtomicReference atomicReference = o72Var.n;
                jia jiaVar = (jia) atomicReference.get();
                if (jiaVar != null) {
                    o72Var.removeView(jiaVar);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                AtomicReference atomicReference2 = o72Var.w;
                jia jiaVar2 = (jia) atomicReference2.get();
                if (jiaVar2 != null) {
                    o72Var.removeView(jiaVar2);
                    atomicReference2.set(null);
                    if (!o72Var.b) {
                        o72Var.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                o72Var.k0 = false;
                o72Var.i0.c(false);
                if (o72Var.a()) {
                    o72Var.f();
                    return;
                }
                return;
        }
    }
}
