package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f16633a;
    public final FileRefController f16634b;
    public final TLRPC.TL_messages_sendMultiMedia f16635c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f16633a = i10;
        this.f16634b = fileRefController;
        this.f16635c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16633a) {
            case 0:
                this.f16634b.lambda$onUpdateObjectReference$30(this.f16635c, this.d);
                return;
            default:
                this.f16634b.lambda$sendErrorToObject$41(this.f16635c, this.d);
                return;
        }
    }
}
