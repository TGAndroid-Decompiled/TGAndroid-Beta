package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f20627a;
    public final FileRefController f20628b;
    public final TLRPC.TL_messages_sendMultiMedia f20629c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f20627a = i10;
        this.f20628b = fileRefController;
        this.f20629c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f20627a) {
            case 0:
                this.f20628b.lambda$onUpdateObjectReference$30(this.f20629c, this.d);
                return;
            default:
                this.f20628b.lambda$sendErrorToObject$41(this.f20629c, this.d);
                return;
        }
    }
}
