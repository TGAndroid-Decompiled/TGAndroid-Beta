package mg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
public final class k implements r20 {
    public final int f13175a;
    public final AtomicBoolean f13176b;
    public final gf.e f13177c;

    public k(AtomicBoolean atomicBoolean, gf.e eVar, int i10) {
        this.f13175a = i10;
        this.f13176b = atomicBoolean;
        this.f13177c = eVar;
    }

    @Override
    public final void a(Object obj) {
        gf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f13175a) {
            case 0:
                if (!this.f13176b.get()) {
                    this.f13177c.b();
                    return;
                }
                return;
            default:
                if (!this.f13176b.get() && (eVar = this.f13177c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
