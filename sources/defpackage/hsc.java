package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Wallet.WalletEngine2;
public final class hsc implements Runnable {
    public final byte a;
    public final AtomicBoolean b;
    public final icc c;

    public hsc(AtomicBoolean atomicBoolean, icc iccVar, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = iccVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        icc iccVar = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                WalletEngine2.lambda$emulateSend$20(atomicBoolean, iccVar);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$24(atomicBoolean, iccVar);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$25(atomicBoolean, iccVar);
                return;
        }
    }
}
