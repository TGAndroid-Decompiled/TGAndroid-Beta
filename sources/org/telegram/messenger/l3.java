package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f16635a;
    public final FileRefController f16636b;
    public final TL_ephemeral.TL_sendMessage f16637c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16635a = i10;
        this.f16636b = fileRefController;
        this.f16637c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16635a) {
            case 0:
                FileRefController.n(this.f16636b, this.f16637c, this.d);
                return;
            default:
                FileRefController.t(this.f16636b, this.f16637c, this.d);
                return;
        }
    }
}
