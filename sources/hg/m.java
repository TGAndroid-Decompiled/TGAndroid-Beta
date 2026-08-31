package hg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m implements Utilities.Callback {
    public final int f7563a;
    public final AtomicBoolean f7564b;
    public final af.f f7565c;

    public m(AtomicBoolean atomicBoolean, af.f fVar, int i10) {
        this.f7563a = i10;
        this.f7564b = atomicBoolean;
        this.f7565c = fVar;
    }

    @Override
    public final void run(Object obj) {
        af.f fVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f7563a) {
            case 0:
                if (!this.f7564b.get()) {
                    this.f7565c.b();
                    return;
                }
                return;
            default:
                if (!this.f7564b.get() && (fVar = this.f7565c) != null) {
                    fVar.b();
                    return;
                }
                return;
        }
    }
}
