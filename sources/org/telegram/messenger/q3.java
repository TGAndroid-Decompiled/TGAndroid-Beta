package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class q3 implements Runnable {
    public final int f21001a;
    public final FileRefController f21002b;
    public final TLRPC.TL_messages_sendMultiMedia f21003c;
    public final Object[] d;

    public q3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f21001a = i10;
        this.f21002b = fileRefController;
        this.f21003c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f21001a) {
            case 0:
                this.f21002b.lambda$onUpdateObjectReference$30(this.f21003c, this.d);
                return;
            default:
                this.f21002b.lambda$sendErrorToObject$41(this.f21003c, this.d);
                return;
        }
    }
}
