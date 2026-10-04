package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f18426a;
    public final FileRefController f18427b;
    public final TL_ephemeral.TL_sendMessage f18428c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18426a = i10;
        this.f18427b = fileRefController;
        this.f18428c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18426a) {
            case 0:
                FileRefController.n(this.f18427b, this.f18428c, this.d);
                return;
            default:
                FileRefController.t(this.f18427b, this.f18428c, this.d);
                return;
        }
    }
}
