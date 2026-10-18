package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class p3 implements Runnable {
    public final int f19214a;
    public final FileRefController f19215b;
    public final TL_ephemeral.TL_sendMessage f19216c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f19214a = i10;
        this.f19215b = fileRefController;
        this.f19216c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19214a) {
            case 0:
                FileRefController.n(this.f19215b, this.f19216c, this.d);
                return;
            default:
                FileRefController.t(this.f19215b, this.f19216c, this.d);
                return;
        }
    }
}
