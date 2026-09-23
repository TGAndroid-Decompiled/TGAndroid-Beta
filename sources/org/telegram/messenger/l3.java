package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f16624a;
    public final FileRefController f16625b;
    public final TL_ephemeral.TL_sendMessage f16626c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16624a = i10;
        this.f16625b = fileRefController;
        this.f16626c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16624a) {
            case 0:
                FileRefController.n(this.f16625b, this.f16626c, this.d);
                return;
            default:
                FileRefController.t(this.f16625b, this.f16626c, this.d);
                return;
        }
    }
}
