package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f18425a;
    public final FileRefController f18426b;
    public final TL_ephemeral.TL_sendMessage f18427c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18425a = i10;
        this.f18426b = fileRefController;
        this.f18427c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18425a) {
            case 0:
                FileRefController.n(this.f18426b, this.f18427c, this.d);
                return;
            default:
                FileRefController.t(this.f18426b, this.f18427c, this.d);
                return;
        }
    }
}
