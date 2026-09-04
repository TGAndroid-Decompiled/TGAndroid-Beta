package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f18023a;
    public final FileRefController f18024b;
    public final TLRPC.TL_messages_sendMultiMedia f18025c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f18023a = i10;
        this.f18024b = fileRefController;
        this.f18025c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18023a) {
            case 0:
                this.f18024b.lambda$onUpdateObjectReference$30(this.f18025c, this.d);
                return;
            default:
                this.f18024b.lambda$sendErrorToObject$41(this.f18025c, this.d);
                return;
        }
    }
}
