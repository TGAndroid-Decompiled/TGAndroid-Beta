package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f16883a;
    public final FileRefController f16884b;
    public final TL_ephemeral.TL_sendMessage f16885c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16883a = i10;
        this.f16884b = fileRefController;
        this.f16885c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16883a) {
            case 0:
                FileRefController.n(this.f16884b, this.f16885c, this.d);
                return;
            default:
                FileRefController.t(this.f16884b, this.f16885c, this.d);
                return;
        }
    }
}
