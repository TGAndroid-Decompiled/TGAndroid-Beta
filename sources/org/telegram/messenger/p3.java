package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class p3 implements Runnable {
    public final int f19236a;
    public final FileRefController f19237b;
    public final TL_ephemeral.TL_sendMessage f19238c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f19236a = i10;
        this.f19237b = fileRefController;
        this.f19238c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19236a) {
            case 0:
                FileRefController.n(this.f19237b, this.f19238c, this.d);
                return;
            default:
                FileRefController.t(this.f19237b, this.f19238c, this.d);
                return;
        }
    }
}
