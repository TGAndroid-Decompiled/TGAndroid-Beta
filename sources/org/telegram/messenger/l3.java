package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f16631a;
    public final FileRefController f16632b;
    public final TL_ephemeral.TL_sendMessage f16633c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16631a = i10;
        this.f16632b = fileRefController;
        this.f16633c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16631a) {
            case 0:
                FileRefController.n(this.f16632b, this.f16633c, this.d);
                return;
            default:
                FileRefController.t(this.f16632b, this.f16633c, this.d);
                return;
        }
    }
}
