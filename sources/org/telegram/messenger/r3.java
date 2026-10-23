package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class r3 implements Runnable {
    public final int f19372a;
    public final FileRefController f19373b;
    public final TL_ephemeral.TL_sendMessage f19374c;
    public final Object[] d;

    public r3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f19372a = i10;
        this.f19373b = fileRefController;
        this.f19374c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19372a) {
            case 0:
                FileRefController.n(this.f19373b, this.f19374c, this.d);
                return;
            default:
                FileRefController.t(this.f19373b, this.f19374c, this.d);
                return;
        }
    }
}
