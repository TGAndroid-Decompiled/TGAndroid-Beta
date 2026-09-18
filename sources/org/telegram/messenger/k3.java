package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f16720a;
    public final FileRefController f16721b;
    public final TLRPC.TL_messages_sendMedia f16722c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f16720a = i10;
        this.f16721b = fileRefController;
        this.f16722c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16720a) {
            case 0:
                this.f16721b.lambda$onUpdateObjectReference$31(this.f16722c, this.d);
                return;
            default:
                this.f16721b.lambda$sendErrorToObject$42(this.f16722c, this.d);
                return;
        }
    }
}
