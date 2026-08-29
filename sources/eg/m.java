package eg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m implements Utilities.Callback {
    public final int f6081a;
    public final AtomicBoolean f6082b;
    public final ye.c f6083c;

    public m(AtomicBoolean atomicBoolean, ye.c cVar, int i10) {
        this.f6081a = i10;
        this.f6082b = atomicBoolean;
        this.f6083c = cVar;
    }

    @Override
    public final void run(Object obj) {
        ye.c cVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f6081a) {
            case 0:
                if (!this.f6082b.get()) {
                    this.f6083c.b();
                    return;
                }
                return;
            default:
                if (!this.f6082b.get() && (cVar = this.f6083c) != null) {
                    cVar.b();
                    return;
                }
                return;
        }
    }
}
