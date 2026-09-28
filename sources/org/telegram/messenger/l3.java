package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f16884a;
    public final FileRefController f16885b;
    public final TL_ephemeral.TL_sendMessage f16886c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16884a = i10;
        this.f16885b = fileRefController;
        this.f16886c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16884a) {
            case 0:
                FileRefController.n(this.f16885b, this.f16886c, this.d);
                return;
            default:
                FileRefController.t(this.f16885b, this.f16886c, this.d);
                return;
        }
    }
}
