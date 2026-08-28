package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class k3 implements Runnable {
    public final int f20745a;
    public final FileRefController f20746b;
    public final TL_ephemeral.TL_sendMessage f20747c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i9) {
        this.f20745a = i9;
        this.f20746b = fileRefController;
        this.f20747c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f20745a) {
            case 0:
                FileRefController.n(this.f20746b, this.f20747c, this.d);
                return;
            default:
                FileRefController.t(this.f20746b, this.f20747c, this.d);
                return;
        }
    }
}
