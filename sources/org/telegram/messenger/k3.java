package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class k3 implements Runnable {

    public final int f20732a;

    public final FileRefController f20733b;

    public final TLRPC.TL_messages_sendMultiMedia f20734c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f20732a = i10;
        this.f20733b = fileRefController;
        this.f20734c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f20732a) {
            case 0:
                this.f20733b.lambda$onUpdateObjectReference$30(this.f20734c, this.d);
                break;
            default:
                this.f20733b.lambda$sendErrorToObject$41(this.f20734c, this.d);
                break;
        }
    }
}
