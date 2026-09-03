package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f17604a;
    public final FileRefController f17605b;
    public final TLRPC.TL_messages_sendMultiMedia f17606c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f17604a = i10;
        this.f17605b = fileRefController;
        this.f17606c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17604a) {
            case 0:
                this.f17605b.lambda$onUpdateObjectReference$30(this.f17606c, this.d);
                return;
            default:
                this.f17605b.lambda$sendErrorToObject$41(this.f17606c, this.d);
                return;
        }
    }
}
