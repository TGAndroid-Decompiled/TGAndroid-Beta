package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class p3 implements Runnable {
    public final int f18523a;
    public final FileRefController f18524b;
    public final TL_ephemeral.TL_sendMessage f18525c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18523a = i10;
        this.f18524b = fileRefController;
        this.f18525c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18523a) {
            case 0:
                FileRefController.n(this.f18524b, this.f18525c, this.d);
                return;
            default:
                FileRefController.t(this.f18524b, this.f18525c, this.d);
                return;
        }
    }
}
