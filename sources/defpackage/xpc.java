package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Wallet.WalletEngine2;
public final class xpc implements Runnable {
    public final byte a;
    public final AtomicBoolean b;
    public final jac c;

    public xpc(AtomicBoolean atomicBoolean, jac jacVar, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = jacVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jac jacVar = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                WalletEngine2.lambda$emulateSend$20(atomicBoolean, jacVar);
                return;
            case 1:
                WalletEngine2.lambda$emulateSendNFT$24(atomicBoolean, jacVar);
                return;
            default:
                WalletEngine2.lambda$emulateSendNFT$25(atomicBoolean, jacVar);
                return;
        }
    }
}
