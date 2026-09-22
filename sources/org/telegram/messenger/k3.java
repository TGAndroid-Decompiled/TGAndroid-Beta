package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f16531a;
    public final FileRefController f16532b;
    public final TLRPC.TL_messages_sendMedia f16533c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f16531a = i10;
        this.f16532b = fileRefController;
        this.f16533c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16531a) {
            case 0:
                this.f16532b.lambda$onUpdateObjectReference$31(this.f16533c, this.d);
                return;
            default:
                this.f16532b.lambda$sendErrorToObject$42(this.f16533c, this.d);
                return;
        }
    }
}
