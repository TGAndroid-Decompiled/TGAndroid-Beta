package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class p3 implements Runnable {
    public final int f19170a;
    public final FileRefController f19171b;
    public final TLRPC.TL_messages_sendMultiMedia f19172c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f19170a = i10;
        this.f19171b = fileRefController;
        this.f19172c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19170a) {
            case 0:
                this.f19171b.lambda$onUpdateObjectReference$30(this.f19172c, this.d);
                return;
            default:
                this.f19171b.lambda$sendErrorToObject$41(this.f19172c, this.d);
                return;
        }
    }
}
