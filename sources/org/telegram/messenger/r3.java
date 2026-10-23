package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class r3 implements Runnable {
    public final int f19441a;
    public final FileRefController f19442b;
    public final TL_ephemeral.TL_sendMessage f19443c;
    public final Object[] d;

    public r3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f19441a = i10;
        this.f19442b = fileRefController;
        this.f19443c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19441a) {
            case 0:
                FileRefController.n(this.f19442b, this.f19443c, this.d);
                return;
            default:
                FileRefController.t(this.f19442b, this.f19443c, this.d);
                return;
        }
    }
}
