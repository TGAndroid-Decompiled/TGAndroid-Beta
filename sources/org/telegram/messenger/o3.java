package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class o3 implements Runnable {
    public final int f18437a;
    public final FileRefController f18438b;
    public final TLRPC.TL_messages_sendMedia f18439c;
    public final Object[] d;

    public o3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f18437a = i10;
        this.f18438b = fileRefController;
        this.f18439c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18437a) {
            case 0:
                this.f18438b.lambda$onUpdateObjectReference$31(this.f18439c, this.d);
                return;
            default:
                this.f18438b.lambda$sendErrorToObject$42(this.f18439c, this.d);
                return;
        }
    }
}
