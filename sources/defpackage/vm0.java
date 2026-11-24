package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
public final class vm0 implements p8c {
    public final byte a;
    public final AtomicBoolean b;
    public final c01 c;

    public vm0(AtomicBoolean atomicBoolean, c01 c01Var, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = c01Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        c01 c01Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (b) {
            case 0:
                if (!atomicBoolean.get()) {
                    c01Var.b();
                    return;
                }
                return;
            default:
                if (!atomicBoolean.get() && c01Var != null) {
                    c01Var.b();
                    return;
                }
                return;
        }
    }
}
