package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f16530a;
    public final FileRefController f16531b;
    public final TLRPC.TL_messages_sendMedia f16532c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f16530a = i10;
        this.f16531b = fileRefController;
        this.f16532c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16530a) {
            case 0:
                this.f16531b.lambda$onUpdateObjectReference$31(this.f16532c, this.d);
                return;
            default:
                this.f16531b.lambda$sendErrorToObject$42(this.f16532c, this.d);
                return;
        }
    }
}
