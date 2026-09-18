package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f16644a;
    public final FileRefController f16645b;
    public final TL_ephemeral.TL_sendMessage f16646c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16644a = i10;
        this.f16645b = fileRefController;
        this.f16646c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16644a) {
            case 0:
                FileRefController.n(this.f16645b, this.f16646c, this.d);
                return;
            default:
                FileRefController.t(this.f16645b, this.f16646c, this.d);
                return;
        }
    }
}
