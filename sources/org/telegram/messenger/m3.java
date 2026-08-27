package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_ephemeral;

public final class m3 implements Runnable {

    public final int f20930a;

    public final FileRefController f20931b;

    public final TL_ephemeral.TL_sendMessage f20932c;
    public final Object[] d;

    public m3(FileRefController fileRefController, TL_ephemeral.TL_sendMessage tL_sendMessage, Object[] objArr, int i10) {
        this.f20930a = i10;
        this.f20931b = fileRefController;
        this.f20932c = tL_sendMessage;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f20930a) {
            case 0:
                this.f20931b.lambda$onUpdateObjectReference$32(this.f20932c, this.d);
                break;
            default:
                this.f20931b.lambda$sendErrorToObject$43(this.f20932c, this.d);
                break;
        }
    }
}
