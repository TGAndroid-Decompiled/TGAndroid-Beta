package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f18224a;
    public final FileRefController f18225b;
    public final TLRPC.TL_messages_sendMultiMedia f18226c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f18224a = i10;
        this.f18225b = fileRefController;
        this.f18226c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18224a) {
            case 0:
                this.f18225b.lambda$onUpdateObjectReference$30(this.f18226c, this.d);
                return;
            default:
                this.f18225b.lambda$sendErrorToObject$41(this.f18226c, this.d);
                return;
        }
    }
}
