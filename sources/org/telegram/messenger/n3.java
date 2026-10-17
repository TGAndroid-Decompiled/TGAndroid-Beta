package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class n3 implements Runnable {
    public final int f19023a;
    public final FileRefController f19024b;
    public final TLRPC.TL_messages_sendMultiMedia f19025c;
    public final Object[] d;

    public n3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f19023a = i10;
        this.f19024b = fileRefController;
        this.f19025c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19023a) {
            case 0:
                this.f19024b.lambda$onUpdateObjectReference$30(this.f19025c, this.d);
                return;
            default:
                this.f19024b.lambda$sendErrorToObject$41(this.f19025c, this.d);
                return;
        }
    }
}
