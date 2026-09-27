package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f16695a;
    public final FileRefController f16696b;
    public final TLRPC.TL_messages_sendMultiMedia f16697c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f16695a = i10;
        this.f16696b = fileRefController;
        this.f16697c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16695a) {
            case 0:
                this.f16696b.lambda$onUpdateObjectReference$30(this.f16697c, this.d);
                return;
            default:
                this.f16696b.lambda$sendErrorToObject$41(this.f16697c, this.d);
                return;
        }
    }
}
