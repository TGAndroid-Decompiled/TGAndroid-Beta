package cg;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;

public final class m implements Utilities.Callback {

    public final int f2767a;

    public final AtomicBoolean f2768b;

    public final we.d f2769c;

    public m(AtomicBoolean atomicBoolean, we.d dVar, int i10) {
        this.f2767a = i10;
        this.f2768b = atomicBoolean;
        this.f2769c = dVar;
    }

    @Override
    public final void run(Object obj) {
        we.d dVar;
        switch (this.f2767a) {
            case 0:
                if (!this.f2768b.get()) {
                    this.f2769c.b();
                    break;
                }
                break;
            default:
                if (!this.f2768b.get() && (dVar = this.f2769c) != null) {
                    dVar.b();
                }
                break;
        }
    }
}
