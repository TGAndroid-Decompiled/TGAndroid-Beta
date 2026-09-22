package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f16448a;
    public final FileRefController f16449b;
    public final TLRPC.TL_messages_sendMultiMedia f16450c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f16448a = i10;
        this.f16449b = fileRefController;
        this.f16450c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16448a) {
            case 0:
                this.f16449b.lambda$onUpdateObjectReference$30(this.f16450c, this.d);
                return;
            default:
                this.f16449b.lambda$sendErrorToObject$41(this.f16450c, this.d);
                return;
        }
    }
}
