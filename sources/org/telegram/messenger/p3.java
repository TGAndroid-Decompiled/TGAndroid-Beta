package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class p3 implements Runnable {
    public final int f18524a;
    public final FileRefController f18525b;
    public final TL_ephemeral.TL_sendMessage f18526c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18524a = i10;
        this.f18525b = fileRefController;
        this.f18526c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18524a) {
            case 0:
                FileRefController.n(this.f18525b, this.f18526c, this.d);
                return;
            default:
                FileRefController.t(this.f18525b, this.f18526c, this.d);
                return;
        }
    }
}
