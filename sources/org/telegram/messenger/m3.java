package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class m3 implements Runnable {
    public final int f19329a;
    public final FileRefController f19330b;
    public final TL_ephemeral.TL_sendMessage f19331c;
    public final Object[] d;

    public m3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f19329a = i10;
        this.f19330b = fileRefController;
        this.f19331c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19329a) {
            case 0:
                FileRefController.n(this.f19330b, this.f19331c, this.d);
                return;
            default:
                FileRefController.t(this.f19330b, this.f19331c, this.d);
                return;
        }
    }
}
