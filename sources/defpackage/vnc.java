package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Wallet.WalletEngine2;
public final class vnc implements Runnable {
    public final byte a;
    public final AtomicBoolean b;
    public final i8c c;

    public vnc(AtomicBoolean atomicBoolean, i8c i8cVar, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = i8cVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        i8c i8cVar = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                WalletEngine2.lambda$emulateSend$20(atomicBoolean, i8cVar);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$24(atomicBoolean, i8cVar);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$25(atomicBoolean, i8cVar);
                return;
        }
    }
}
