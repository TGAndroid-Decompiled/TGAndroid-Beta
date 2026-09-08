package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f18050a;
    public final FileRefController f18051b;
    public final TLRPC.TL_messages_sendMultiMedia f18052c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f18050a = i10;
        this.f18051b = fileRefController;
        this.f18052c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18050a) {
            case 0:
                this.f18051b.lambda$onUpdateObjectReference$30(this.f18052c, this.d);
                return;
            default:
                this.f18051b.lambda$sendErrorToObject$41(this.f18052c, this.d);
                return;
        }
    }
}
