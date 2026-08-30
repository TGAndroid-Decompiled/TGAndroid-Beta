package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f17626a;
    public final FileRefController f17627b;
    public final TLRPC.TL_messages_sendMultiMedia f17628c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f17626a = i10;
        this.f17627b = fileRefController;
        this.f17628c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17626a) {
            case 0:
                this.f17627b.lambda$onUpdateObjectReference$30(this.f17628c, this.d);
                return;
            default:
                this.f17627b.lambda$sendErrorToObject$41(this.f17628c, this.d);
                return;
        }
    }
}
