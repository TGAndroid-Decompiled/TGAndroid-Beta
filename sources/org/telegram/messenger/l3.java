package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f20815a;
    public final FileRefController f20816b;
    public final TL_ephemeral.TL_sendMessage f20817c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f20815a = i10;
        this.f20816b = fileRefController;
        this.f20817c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f20815a) {
            case 0:
                FileRefController.n(this.f20816b, this.f20817c, this.d);
                return;
            default:
                FileRefController.t(this.f20816b, this.f20817c, this.d);
                return;
        }
    }
}
