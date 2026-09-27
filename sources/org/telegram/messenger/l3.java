package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f16876a;
    public final FileRefController f16877b;
    public final TL_ephemeral.TL_sendMessage f16878c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16876a = i10;
        this.f16877b = fileRefController;
        this.f16878c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16876a) {
            case 0:
                FileRefController.n(this.f16877b, this.f16878c, this.d);
                return;
            default:
                FileRefController.t(this.f16877b, this.f16878c, this.d);
                return;
        }
    }
}
