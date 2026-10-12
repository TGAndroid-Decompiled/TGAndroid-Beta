package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class o3 implements Runnable {
    public final int f17989a;
    public final FileRefController f17990b;
    public final TLRPC.TL_messages_sendMedia f17991c;
    public final Object[] d;

    public o3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f17989a = i10;
        this.f17990b = fileRefController;
        this.f17991c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17989a) {
            case 0:
                this.f17990b.lambda$onUpdateObjectReference$31(this.f17991c, this.d);
                return;
            default:
                this.f17990b.lambda$sendErrorToObject$42(this.f17991c, this.d);
                return;
        }
    }
}
