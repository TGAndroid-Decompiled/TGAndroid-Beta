package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f16812a;
    public final FileRefController f16813b;
    public final TL_ephemeral.TL_sendMessage f16814c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f16812a = i10;
        this.f16813b = fileRefController;
        this.f16814c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16812a) {
            case 0:
                FileRefController.n(this.f16813b, this.f16814c, this.d);
                return;
            default:
                FileRefController.t(this.f16813b, this.f16814c, this.d);
                return;
        }
    }
}
