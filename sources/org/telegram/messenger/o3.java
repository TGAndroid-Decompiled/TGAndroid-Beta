package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class o3 implements Runnable {
    public final int f17686a;
    public final FileRefController f17687b;
    public final TLRPC.TL_messages_sendMedia f17688c;
    public final Object[] d;

    public o3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f17686a = i10;
        this.f17687b = fileRefController;
        this.f17688c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17686a) {
            case 0:
                this.f17687b.lambda$onUpdateObjectReference$31(this.f17688c, this.d);
                return;
            default:
                this.f17687b.lambda$sendErrorToObject$42(this.f17688c, this.d);
                return;
        }
    }
}
