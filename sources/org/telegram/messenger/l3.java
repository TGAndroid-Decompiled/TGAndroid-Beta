package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f18423a;
    public final FileRefController f18424b;
    public final TL_ephemeral.TL_sendMessage f18425c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18423a = i10;
        this.f18424b = fileRefController;
        this.f18425c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18423a) {
            case 0:
                FileRefController.n(this.f18424b, this.f18425c, this.d);
                return;
            default:
                FileRefController.t(this.f18424b, this.f18425c, this.d);
                return;
        }
    }
}
