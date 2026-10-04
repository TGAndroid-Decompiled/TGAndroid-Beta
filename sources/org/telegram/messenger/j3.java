package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f18218a;
    public final FileRefController f18219b;
    public final TLRPC.TL_messages_sendMultiMedia f18220c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f18218a = i10;
        this.f18219b = fileRefController;
        this.f18220c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18218a) {
            case 0:
                this.f18219b.lambda$onUpdateObjectReference$30(this.f18220c, this.d);
                return;
            default:
                this.f18219b.lambda$sendErrorToObject$41(this.f18220c, this.d);
                return;
        }
    }
}
