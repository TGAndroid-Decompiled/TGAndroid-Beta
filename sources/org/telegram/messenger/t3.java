package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class t3 implements Runnable {
    public final int f21265a;
    public final FileRefController f21266b;
    public final TL_ephemeral.TL_sendMessage f21267c;
    public final Object[] d;

    public t3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f21265a = i10;
        this.f21266b = fileRefController;
        this.f21267c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f21265a) {
            case 0:
                FileRefController.n(this.f21266b, this.f21267c, this.d);
                return;
            default:
                FileRefController.t(this.f21266b, this.f21267c, this.d);
                return;
        }
    }
}
