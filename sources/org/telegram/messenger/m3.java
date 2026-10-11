package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class m3 implements Runnable {
    public final int f18482a;
    public final FileRefController f18483b;
    public final TL_ephemeral.TL_sendMessage f18484c;
    public final Object[] d;

    public m3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18482a = i10;
        this.f18483b = fileRefController;
        this.f18484c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18482a) {
            case 0:
                FileRefController.n(this.f18483b, this.f18484c, this.d);
                return;
            default:
                FileRefController.t(this.f18483b, this.f18484c, this.d);
                return;
        }
    }
}
