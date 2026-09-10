package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class q3 implements Runnable {
    public final int f16101a;
    public final FileRefController f16102b;
    public final TL_ephemeral.TL_sendMessage f16103c;
    public final Object[] d;

    public q3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16101a = i10;
        this.f16102b = fileRefController;
        this.f16103c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16101a) {
            case 0:
                FileRefController.n(this.f16102b, this.f16103c, this.d);
                return;
            default:
                FileRefController.t(this.f16102b, this.f16103c, this.d);
                return;
        }
    }
}
