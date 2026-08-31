package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class m3 implements Runnable {
    public final int f19327a;
    public final FileRefController f19328b;
    public final TL_ephemeral.TL_sendMessage f19329c;
    public final Object[] d;

    public m3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f19327a = i10;
        this.f19328b = fileRefController;
        this.f19329c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19327a) {
            case 0:
                FileRefController.n(this.f19328b, this.f19329c, this.d);
                return;
            default:
                FileRefController.t(this.f19328b, this.f19329c, this.d);
                return;
        }
    }
}
