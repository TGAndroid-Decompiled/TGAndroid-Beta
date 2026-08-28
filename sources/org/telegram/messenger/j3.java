package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f20645a;
    public final FileRefController f20646b;
    public final TLRPC.TL_messages_sendMedia f20647c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i9) {
        this.f20645a = i9;
        this.f20646b = fileRefController;
        this.f20647c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f20645a) {
            case 0:
                this.f20646b.lambda$onUpdateObjectReference$31(this.f20647c, this.d);
                return;
            default:
                this.f20646b.lambda$sendErrorToObject$42(this.f20647c, this.d);
                return;
        }
    }
}
