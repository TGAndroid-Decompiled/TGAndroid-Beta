package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f16869a;
    public final FileRefController f16870b;
    public final TL_ephemeral.TL_sendMessage f16871c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16869a = i10;
        this.f16870b = fileRefController;
        this.f16871c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16869a) {
            case 0:
                FileRefController.n(this.f16870b, this.f16871c, this.d);
                return;
            default:
                FileRefController.t(this.f16870b, this.f16871c, this.d);
                return;
        }
    }
}
