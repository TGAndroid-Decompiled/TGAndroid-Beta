package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class m3 implements Runnable {
    public final int f17810a;
    public final FileRefController f17811b;
    public final TL_ephemeral.TL_sendMessage f17812c;
    public final Object[] d;

    public m3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f17810a = i10;
        this.f17811b = fileRefController;
        this.f17812c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17810a) {
            case 0:
                FileRefController.n(this.f17811b, this.f17812c, this.d);
                return;
            default:
                FileRefController.t(this.f17811b, this.f17812c, this.d);
                return;
        }
    }
}
