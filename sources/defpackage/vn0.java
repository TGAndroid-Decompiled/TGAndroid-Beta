package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
public final class vn0 implements qac {
    public final byte a;
    public final AtomicBoolean b;
    public final k11 c;

    public vn0(AtomicBoolean atomicBoolean, k11 k11Var, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = k11Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        k11 k11Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (b) {
            case 0:
                if (!atomicBoolean.get()) {
                    k11Var.b();
                    return;
                }
                return;
            default:
                if (!atomicBoolean.get() && k11Var != null) {
                    k11Var.b();
                    return;
                }
                return;
        }
    }
}
