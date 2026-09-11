package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f18041a;
    public final FileRefController f18042b;
    public final TLRPC.TL_messages_sendMultiMedia f18043c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f18041a = i10;
        this.f18042b = fileRefController;
        this.f18043c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18041a) {
            case 0:
                this.f18042b.lambda$onUpdateObjectReference$30(this.f18043c, this.d);
                return;
            default:
                this.f18042b.lambda$sendErrorToObject$41(this.f18043c, this.d);
                return;
        }
    }
}
