package defpackage;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Wallet.WalletEngine2;
public final class isc implements Runnable {
    public final byte a;
    public final AtomicBoolean b;
    public final FutureTask c;

    public isc(AtomicBoolean atomicBoolean, FutureTask futureTask, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = futureTask;
    }

    @Override
    public final void run() {
        byte b = this.a;
        FutureTask futureTask = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                WalletEngine2.R(atomicBoolean, futureTask);
                return;
            default:
                WalletEngine2.D(atomicBoolean, futureTask);
                return;
        }
    }
}
