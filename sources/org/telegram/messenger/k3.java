package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f18140a;
    public final FileRefController f18141b;
    public final TLRPC.TL_messages_sendMedia f18142c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f18140a = i10;
        this.f18141b = fileRefController;
        this.f18142c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18140a) {
            case 0:
                this.f18141b.lambda$onUpdateObjectReference$31(this.f18142c, this.d);
                return;
            default:
                this.f18141b.lambda$sendErrorToObject$42(this.f18142c, this.d);
                return;
        }
    }
}
