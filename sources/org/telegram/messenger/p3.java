package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class p3 implements Runnable {
    public final int f19244a;
    public final FileRefController f19245b;
    public final TLRPC.TL_messages_sendMultiMedia f19246c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f19244a = i10;
        this.f19245b = fileRefController;
        this.f19246c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19244a) {
            case 0:
                this.f19245b.lambda$onUpdateObjectReference$30(this.f19246c, this.d);
                return;
            default:
                this.f19245b.lambda$sendErrorToObject$41(this.f19246c, this.d);
                return;
        }
    }
}
