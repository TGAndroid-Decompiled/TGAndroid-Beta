package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class m3 implements Runnable {
    public final int f18480a;
    public final FileRefController f18481b;
    public final TL_ephemeral.TL_sendMessage f18482c;
    public final Object[] d;

    public m3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18480a = i10;
        this.f18481b = fileRefController;
        this.f18482c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18480a) {
            case 0:
                FileRefController.n(this.f18481b, this.f18482c, this.d);
                return;
            default:
                FileRefController.t(this.f18481b, this.f18482c, this.d);
                return;
        }
    }
}
