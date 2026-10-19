package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class p3 implements Runnable {
    public final int f19233a;
    public final FileRefController f19234b;
    public final TL_ephemeral.TL_sendMessage f19235c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f19233a = i10;
        this.f19234b = fileRefController;
        this.f19235c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19233a) {
            case 0:
                FileRefController.n(this.f19234b, this.f19235c, this.d);
                return;
            default:
                FileRefController.t(this.f19234b, this.f19235c, this.d);
                return;
        }
    }
}
