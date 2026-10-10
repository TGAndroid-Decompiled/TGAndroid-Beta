package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class l3 implements Runnable {
    public final int f18394a;
    public final FileRefController f18395b;
    public final TLRPC.TL_messages_sendMedia f18396c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f18394a = i10;
        this.f18395b = fileRefController;
        this.f18396c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18394a) {
            case 0:
                this.f18395b.lambda$onUpdateObjectReference$31(this.f18396c, this.d);
                return;
            default:
                this.f18395b.lambda$sendErrorToObject$42(this.f18396c, this.d);
                return;
        }
    }
}
