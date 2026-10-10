package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f18320a;
    public final FileRefController f18321b;
    public final TLRPC.TL_messages_sendMultiMedia f18322c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f18320a = i10;
        this.f18321b = fileRefController;
        this.f18322c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18320a) {
            case 0:
                this.f18321b.lambda$onUpdateObjectReference$30(this.f18322c, this.d);
                return;
            default:
                this.f18321b.lambda$sendErrorToObject$41(this.f18322c, this.d);
                return;
        }
    }
}
