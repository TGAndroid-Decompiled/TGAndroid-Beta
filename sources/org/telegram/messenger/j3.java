package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f16697a;
    public final FileRefController f16698b;
    public final TLRPC.TL_messages_sendMultiMedia f16699c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f16697a = i10;
        this.f16698b = fileRefController;
        this.f16699c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16697a) {
            case 0:
                this.f16698b.lambda$onUpdateObjectReference$30(this.f16699c, this.d);
                return;
            default:
                this.f16698b.lambda$sendErrorToObject$41(this.f16699c, this.d);
                return;
        }
    }
}
