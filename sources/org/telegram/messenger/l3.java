package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f16900a;
    public final FileRefController f16901b;
    public final TL_ephemeral.TL_sendMessage f16902c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16900a = i10;
        this.f16901b = fileRefController;
        this.f16902c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16900a) {
            case 0:
                FileRefController.n(this.f16901b, this.f16902c, this.d);
                return;
            default:
                FileRefController.t(this.f16901b, this.f16902c, this.d);
                return;
        }
    }
}
