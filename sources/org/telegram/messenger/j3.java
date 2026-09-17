package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f16461a;
    public final FileRefController f16462b;
    public final TLRPC.TL_messages_sendMultiMedia f16463c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f16461a = i10;
        this.f16462b = fileRefController;
        this.f16463c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16461a) {
            case 0:
                this.f16462b.lambda$onUpdateObjectReference$30(this.f16463c, this.d);
                return;
            default:
                this.f16462b.lambda$sendErrorToObject$41(this.f16463c, this.d);
                return;
        }
    }
}
