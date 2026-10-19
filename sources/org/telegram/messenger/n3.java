package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class n3 implements Runnable {
    public final int f19024a;
    public final FileRefController f19025b;
    public final TLRPC.TL_messages_sendMultiMedia f19026c;
    public final Object[] d;

    public n3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f19024a = i10;
        this.f19025b = fileRefController;
        this.f19026c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19024a) {
            case 0:
                this.f19025b.lambda$onUpdateObjectReference$30(this.f19026c, this.d);
                return;
            default:
                this.f19025b.lambda$sendErrorToObject$41(this.f19026c, this.d);
                return;
        }
    }
}
