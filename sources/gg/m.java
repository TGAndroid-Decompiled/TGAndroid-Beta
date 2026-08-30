package gg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m implements Utilities.Callback {
    public final int f6712a;
    public final AtomicBoolean f6713b;
    public final af.f f6714c;

    public m(AtomicBoolean atomicBoolean, af.f fVar, int i10) {
        this.f6712a = i10;
        this.f6713b = atomicBoolean;
        this.f6714c = fVar;
    }

    @Override
    public final void run(Object obj) {
        af.f fVar;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
        switch (this.f6712a) {
            case 0:
                if (!this.f6713b.get()) {
                    this.f6714c.b();
                    return;
                }
                return;
            default:
                if (!this.f6713b.get() && (fVar = this.f6714c) != null) {
                    fVar.b();
                    return;
                }
                return;
        }
    }
}
