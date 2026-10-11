package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class l3 implements Runnable {
    public final int f18395a;
    public final FileRefController f18396b;
    public final TLRPC.TL_messages_sendMedia f18397c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f18395a = i10;
        this.f18396b = fileRefController;
        this.f18397c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18395a) {
            case 0:
                this.f18396b.lambda$onUpdateObjectReference$31(this.f18397c, this.d);
                return;
            default:
                this.f18396b.lambda$sendErrorToObject$42(this.f18397c, this.d);
                return;
        }
    }
}
