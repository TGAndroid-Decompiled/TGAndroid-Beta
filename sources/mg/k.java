package mg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
public final class k implements q20 {
    public final int f13174a;
    public final AtomicBoolean f13175b;
    public final gf.e f13176c;

    public k(AtomicBoolean atomicBoolean, gf.e eVar, int i10) {
        this.f13174a = i10;
        this.f13175b = atomicBoolean;
        this.f13176c = eVar;
    }

    @Override
    public final void a(Object obj) {
        gf.e eVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f13174a) {
            case 0:
                if (!this.f13175b.get()) {
                    this.f13176c.b();
                    return;
                }
                return;
            default:
                if (!this.f13175b.get() && (eVar = this.f13176c) != null) {
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
