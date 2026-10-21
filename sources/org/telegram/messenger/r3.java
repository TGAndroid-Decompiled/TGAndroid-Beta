package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class r3 implements Runnable {
    public final int f19406a;
    public final FileRefController f19407b;
    public final TL_ephemeral.TL_sendMessage f19408c;
    public final Object[] d;

    public r3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f19406a = i10;
        this.f19407b = fileRefController;
        this.f19408c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19406a) {
            case 0:
                FileRefController.n(this.f19407b, this.f19408c, this.d);
                return;
            default:
                FileRefController.t(this.f19407b, this.f19408c, this.d);
                return;
        }
    }
}
