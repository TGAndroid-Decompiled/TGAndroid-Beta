package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f16867a;
    public final FileRefController f16868b;
    public final TL_ephemeral.TL_sendMessage f16869c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16867a = i10;
        this.f16868b = fileRefController;
        this.f16869c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16867a) {
            case 0:
                FileRefController.n(this.f16868b, this.f16869c, this.d);
                return;
            default:
                FileRefController.t(this.f16868b, this.f16869c, this.d);
                return;
        }
    }
}
