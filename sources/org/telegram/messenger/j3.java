package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f16452a;
    public final FileRefController f16453b;
    public final TLRPC.TL_messages_sendMultiMedia f16454c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f16452a = i10;
        this.f16453b = fileRefController;
        this.f16454c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16452a) {
            case 0:
                this.f16453b.lambda$onUpdateObjectReference$30(this.f16454c, this.d);
                return;
            default:
                this.f16453b.lambda$sendErrorToObject$41(this.f16454c, this.d);
                return;
        }
    }
}
