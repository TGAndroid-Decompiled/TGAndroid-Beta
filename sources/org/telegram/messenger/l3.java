package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f16854a;
    public final FileRefController f16855b;
    public final TL_ephemeral.TL_sendMessage f16856c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16854a = i10;
        this.f16855b = fileRefController;
        this.f16856c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16854a) {
            case 0:
                FileRefController.n(this.f16855b, this.f16856c, this.d);
                return;
            default:
                FileRefController.t(this.f16855b, this.f16856c, this.d);
                return;
        }
    }
}
