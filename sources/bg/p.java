package bg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p implements Utilities.Callback {
    public final int f1907a;
    public final AtomicBoolean f1908b;
    public final ve.d f1909c;

    public p(AtomicBoolean atomicBoolean, ve.d dVar, int i9) {
        this.f1907a = i9;
        this.f1908b = atomicBoolean;
        this.f1909c = dVar;
    }

    @Override
    public final void run(Object obj) {
        ve.d dVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f1907a) {
            case 0:
                if (!this.f1908b.get()) {
                    this.f1909c.b();
                    return;
                }
                return;
            default:
                if (!this.f1908b.get() && (dVar = this.f1909c) != null) {
                    dVar.b();
                    return;
                }
                return;
        }
    }
}
