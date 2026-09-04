package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class l3 implements Runnable {
    public final int f18228a;
    public final FileRefController f18229b;
    public final TL_ephemeral.TL_sendMessage f18230c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18228a = i10;
        this.f18229b = fileRefController;
        this.f18230c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18228a) {
            case 0:
                FileRefController.n(this.f18229b, this.f18230c, this.d);
                return;
            default:
                FileRefController.t(this.f18229b, this.f18230c, this.d);
                return;
        }
    }
}
