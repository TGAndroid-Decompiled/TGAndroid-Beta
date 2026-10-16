package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class p3 implements Runnable {
    public final int f17761a;
    public final FileRefController f17762b;
    public final TL_ephemeral.TL_sendMessage f17763c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f17761a = i10;
        this.f17762b = fileRefController;
        this.f17763c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17761a) {
            case 0:
                FileRefController.n(this.f17762b, this.f17763c, this.d);
                return;
            default:
                FileRefController.t(this.f17762b, this.f17763c, this.d);
                return;
        }
    }
}
