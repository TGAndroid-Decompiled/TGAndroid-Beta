package defpackage;

import java.util.concurrent.atomic.AtomicReference;
public final class x72 implements Runnable {
    public final byte a;
    public final f82 b;

    public x72(f82 f82Var, byte b) {
        this.a = b;
        this.b = f82Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        f82 f82Var = this.b;
        switch (b) {
            case 0:
                AtomicReference atomicReference = f82Var.n;
                ema emaVar = (ema) atomicReference.get();
                if (emaVar != null) {
                    f82Var.removeView(emaVar);
                    atomicReference.set(null);
                    return;
                }
                return;
            case 1:
                AtomicReference atomicReference2 = f82Var.w;
                ema emaVar2 = (ema) atomicReference2.get();
                if (emaVar2 != null) {
                    f82Var.removeView(emaVar2);
                    atomicReference2.set(null);
                    if (!f82Var.b) {
                        f82Var.setClipChildren(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                f82Var.k0 = false;
                f82Var.i0.c(false);
                if (f82Var.a()) {
                    f82Var.f();
                    return;
                }
                return;
        }
    }
}
