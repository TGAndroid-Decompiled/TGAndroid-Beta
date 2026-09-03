package gg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m implements Utilities.Callback {
    public final int f6699a;
    public final AtomicBoolean f6700b;
    public final ze.c f6701c;

    public m(AtomicBoolean atomicBoolean, ze.c cVar, int i10) {
        this.f6699a = i10;
        this.f6700b = atomicBoolean;
        this.f6701c = cVar;
    }

    @Override
    public final void run(Object obj) {
        ze.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f6699a) {
            case 0:
                if (!this.f6700b.get()) {
                    this.f6701c.b();
                    return;
                }
                return;
            default:
                if (!this.f6700b.get() && (cVar = this.f6701c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
