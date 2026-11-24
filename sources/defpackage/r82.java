package defpackage;

import java.util.concurrent.atomic.AtomicReference;
public final class r82 implements Runnable {
    public final byte a;
    public final z82 b;

    public r82(z82 z82Var, byte b) {
        this.a = b;
        this.b = z82Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        z82 z82Var = this.b;
        switch (b) {
            case 0:
                AtomicReference atomicReference = z82Var.n;
                lka lkaVar = (lka) atomicReference.get();
                if (lkaVar != null) {
                    z82Var.removeView(lkaVar);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                AtomicReference atomicReference2 = z82Var.w;
                lka lkaVar2 = (lka) atomicReference2.get();
                if (lkaVar2 != null) {
                    z82Var.removeView(lkaVar2);
                    atomicReference2.set(null);
                    if (!z82Var.b) {
                        z82Var.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                z82Var.k0 = false;
                z82Var.i0.c(false);
                if (z82Var.a()) {
                    z82Var.f();
                    return;
                }
                return;
        }
    }
}
