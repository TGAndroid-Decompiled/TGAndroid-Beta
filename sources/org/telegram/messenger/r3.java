package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class r3 implements Runnable {
    public final int f19348a;
    public final FileRefController f19349b;
    public final TL_ephemeral.TL_sendMessage f19350c;
    public final Object[] d;

    public r3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f19348a = i10;
        this.f19349b = fileRefController;
        this.f19350c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19348a) {
            case 0:
                FileRefController.n(this.f19349b, this.f19350c, this.d);
                return;
            default:
                FileRefController.t(this.f19349b, this.f19350c, this.d);
                return;
        }
    }
}
