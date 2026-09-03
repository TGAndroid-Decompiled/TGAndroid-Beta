package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class m3 implements Runnable {
    public final int f17790a;
    public final FileRefController f17791b;
    public final TL_ephemeral.TL_sendMessage f17792c;
    public final Object[] d;

    public m3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f17790a = i10;
        this.f17791b = fileRefController;
        this.f17792c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17790a) {
            case 0:
                FileRefController.n(this.f17791b, this.f17792c, this.d);
                return;
            default:
                FileRefController.t(this.f17791b, this.f17792c, this.d);
                return;
        }
    }
}
