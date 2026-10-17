package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class p3 implements Runnable {
    public final int f19234a;
    public final FileRefController f19235b;
    public final TL_ephemeral.TL_sendMessage f19236c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f19234a = i10;
        this.f19235b = fileRefController;
        this.f19236c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19234a) {
            case 0:
                FileRefController.n(this.f19235b, this.f19236c, this.d);
                return;
            default:
                FileRefController.t(this.f19235b, this.f19236c, this.d);
                return;
        }
    }
}
