package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class r3 implements Runnable {
    public final int f21082a;
    public final FileRefController f21083b;
    public final TLRPC.TL_messages_sendMultiMedia f21084c;
    public final Object[] d;

    public r3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f21082a = i10;
        this.f21083b = fileRefController;
        this.f21084c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f21082a) {
            case 0:
                this.f21083b.lambda$onUpdateObjectReference$30(this.f21084c, this.d);
                return;
            default:
                this.f21083b.lambda$sendErrorToObject$41(this.f21084c, this.d);
                return;
        }
    }
}
