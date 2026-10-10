package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class m3 implements Runnable {
    public final int f18484a;
    public final FileRefController f18485b;
    public final TL_ephemeral.TL_sendMessage f18486c;
    public final Object[] d;

    public m3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18484a = i10;
        this.f18485b = fileRefController;
        this.f18486c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18484a) {
            case 0:
                FileRefController.n(this.f18485b, this.f18486c, this.d);
                return;
            default:
                FileRefController.t(this.f18485b, this.f18486c, this.d);
                return;
        }
    }
}
