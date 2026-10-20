package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class q3 implements Runnable {
    public final int f19312a;
    public final FileRefController f19313b;
    public final TL_ephemeral.TL_sendMessage f19314c;
    public final Object[] d;

    public q3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f19312a = i10;
        this.f19313b = fileRefController;
        this.f19314c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19312a) {
            case 0:
                FileRefController.n(this.f19313b, this.f19314c, this.d);
                return;
            default:
                FileRefController.t(this.f19313b, this.f19314c, this.d);
                return;
        }
    }
}
