package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f18255a;
    public final FileRefController f18256b;
    public final TL_ephemeral.TL_sendMessage f18257c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18255a = i10;
        this.f18256b = fileRefController;
        this.f18257c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18255a) {
            case 0:
                FileRefController.n(this.f18256b, this.f18257c, this.d);
                return;
            default:
                FileRefController.t(this.f18256b, this.f18257c, this.d);
                return;
        }
    }
}
