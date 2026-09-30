package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f16805a;
    public final FileRefController f16806b;
    public final TLRPC.TL_messages_sendMedia f16807c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f16805a = i10;
        this.f16806b = fileRefController;
        this.f16807c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16805a) {
            case 0:
                this.f16806b.lambda$onUpdateObjectReference$31(this.f16807c, this.d);
                return;
            default:
                this.f16806b.lambda$sendErrorToObject$42(this.f16807c, this.d);
                return;
        }
    }
}
