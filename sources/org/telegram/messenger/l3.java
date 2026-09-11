package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f18248a;
    public final FileRefController f18249b;
    public final TL_ephemeral.TL_sendMessage f18250c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18248a = i10;
        this.f18249b = fileRefController;
        this.f18250c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18248a) {
            case 0:
                FileRefController.n(this.f18249b, this.f18250c, this.d);
                return;
            default:
                FileRefController.t(this.f18249b, this.f18250c, this.d);
                return;
        }
    }
}
