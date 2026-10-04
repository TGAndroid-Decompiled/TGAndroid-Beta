package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f18418a;
    public final FileRefController f18419b;
    public final TL_ephemeral.TL_sendMessage f18420c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18418a = i10;
        this.f18419b = fileRefController;
        this.f18420c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18418a) {
            case 0:
                FileRefController.n(this.f18419b, this.f18420c, this.d);
                return;
            default:
                FileRefController.t(this.f18419b, this.f18420c, this.d);
                return;
        }
    }
}
