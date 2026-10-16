package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class n3 implements Runnable {
    public final int f17613a;
    public final FileRefController f17614b;
    public final TLRPC.TL_messages_sendMultiMedia f17615c;
    public final Object[] d;

    public n3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f17613a = i10;
        this.f17614b = fileRefController;
        this.f17615c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17613a) {
            case 0:
                this.f17614b.lambda$onUpdateObjectReference$30(this.f17615c, this.d);
                return;
            default:
                this.f17614b.lambda$sendErrorToObject$41(this.f17615c, this.d);
                return;
        }
    }
}
