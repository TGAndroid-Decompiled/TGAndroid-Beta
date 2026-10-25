package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;
public final class s3 implements Runnable {
    public final int f21195a;
    public final FileRefController f21196b;
    public final TL_ephemeral.TL_sendMessage f21197c;
    public final Object[] d;

    public s3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f21195a = i10;
        this.f21196b = fileRefController;
        this.f21197c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f21195a) {
            case 0:
                FileRefController.n(this.f21196b, this.f21197c, this.d);
                return;
            default:
                FileRefController.t(this.f21196b, this.f21197c, this.d);
                return;
        }
    }
}
