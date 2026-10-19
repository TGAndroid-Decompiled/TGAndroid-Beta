package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class p3 implements Runnable {
    public final int f19217a;
    public final FileRefController f19218b;
    public final TL_ephemeral.TL_sendMessage f19219c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f19217a = i10;
        this.f19218b = fileRefController;
        this.f19219c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19217a) {
            case 0:
                FileRefController.n(this.f19218b, this.f19219c, this.d);
                return;
            default:
                FileRefController.t(this.f19218b, this.f19219c, this.d);
                return;
        }
    }
}
