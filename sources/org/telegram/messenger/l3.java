package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f16882a;
    public final FileRefController f16883b;
    public final TL_ephemeral.TL_sendMessage f16884c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16882a = i10;
        this.f16883b = fileRefController;
        this.f16884c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16882a) {
            case 0:
                FileRefController.n(this.f16883b, this.f16884c, this.d);
                return;
            default:
                FileRefController.t(this.f16883b, this.f16884c, this.d);
                return;
        }
    }
}
