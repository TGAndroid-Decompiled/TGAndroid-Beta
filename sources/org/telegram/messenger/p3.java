package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class p3 implements Runnable {
    public final int f18061a;
    public final FileRefController f18062b;
    public final TL_ephemeral.TL_sendMessage f18063c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18061a = i10;
        this.f18062b = fileRefController;
        this.f18063c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18061a) {
            case 0:
                FileRefController.n(this.f18062b, this.f18063c, this.d);
                return;
            default:
                FileRefController.t(this.f18062b, this.f18063c, this.d);
                return;
        }
    }
}
