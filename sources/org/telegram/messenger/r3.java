package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class r3 implements Runnable {
    public final int f19418a;
    public final FileRefController f19419b;
    public final TL_ephemeral.TL_sendMessage f19420c;
    public final Object[] d;

    public r3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f19418a = i10;
        this.f19419b = fileRefController;
        this.f19420c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19418a) {
            case 0:
                FileRefController.n(this.f19419b, this.f19420c, this.d);
                return;
            default:
                FileRefController.t(this.f19419b, this.f19420c, this.d);
                return;
        }
    }
}
