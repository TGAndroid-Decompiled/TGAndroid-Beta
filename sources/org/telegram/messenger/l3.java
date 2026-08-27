package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class l3 implements Runnable {

    public final int f20826a;

    public final FileRefController f20827b;

    public final TLRPC.TL_messages_sendMedia f20828c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f20826a = i10;
        this.f20827b = fileRefController;
        this.f20828c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f20826a) {
            case 0:
                this.f20827b.lambda$onUpdateObjectReference$31(this.f20828c, this.d);
                break;
            default:
                this.f20827b.lambda$sendErrorToObject$42(this.f20828c, this.d);
                break;
        }
    }
}
