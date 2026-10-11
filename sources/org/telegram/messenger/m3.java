package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class m3 implements Runnable {
    public final int f18518a;
    public final FileRefController f18519b;
    public final TL_ephemeral.TL_sendMessage f18520c;
    public final Object[] d;

    public m3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f18518a = i10;
        this.f18519b = fileRefController;
        this.f18520c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18518a) {
            case 0:
                FileRefController.n(this.f18519b, this.f18520c, this.d);
                return;
            default:
                FileRefController.t(this.f18519b, this.f18520c, this.d);
                return;
        }
    }
}
