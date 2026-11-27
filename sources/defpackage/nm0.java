package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
public final class nm0 implements pcc {
    public final byte a;
    public final AtomicBoolean b;
    public final l01 c;

    public nm0(AtomicBoolean atomicBoolean, l01 l01Var, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = l01Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        l01 l01Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (b) {
            case 0:
                if (!atomicBoolean.get()) {
                    l01Var.b();
                    return;
                }
                return;
            default:
                if (!atomicBoolean.get() && l01Var != null) {
                    l01Var.b();
                    return;
                }
                return;
        }
    }
}
