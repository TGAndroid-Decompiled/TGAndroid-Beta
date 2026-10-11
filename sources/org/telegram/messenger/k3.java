package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f18318a;
    public final FileRefController f18319b;
    public final TLRPC.TL_messages_sendMultiMedia f18320c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f18318a = i10;
        this.f18319b = fileRefController;
        this.f18320c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18318a) {
            case 0:
                this.f18319b.lambda$onUpdateObjectReference$30(this.f18320c, this.d);
                return;
            default:
                this.f18319b.lambda$sendErrorToObject$41(this.f18320c, this.d);
                return;
        }
    }
}
