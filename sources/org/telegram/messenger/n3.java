package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class n3 implements Runnable {
    public final int f18342a;
    public final FileRefController f18343b;
    public final TLRPC.TL_messages_sendMultiMedia f18344c;
    public final Object[] d;

    public n3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f18342a = i10;
        this.f18343b = fileRefController;
        this.f18344c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18342a) {
            case 0:
                this.f18343b.lambda$onUpdateObjectReference$30(this.f18344c, this.d);
                return;
            default:
                this.f18343b.lambda$sendErrorToObject$41(this.f18344c, this.d);
                return;
        }
    }
}
