package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f18223a;
    public final FileRefController f18224b;
    public final TLRPC.TL_messages_sendMultiMedia f18225c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f18223a = i10;
        this.f18224b = fileRefController;
        this.f18225c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18223a) {
            case 0:
                this.f18224b.lambda$onUpdateObjectReference$30(this.f18225c, this.d);
                return;
            default:
                this.f18224b.lambda$sendErrorToObject$41(this.f18225c, this.d);
                return;
        }
    }
}
