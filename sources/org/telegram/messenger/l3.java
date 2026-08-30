package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class l3 implements Runnable {
    public final int f17724a;
    public final FileRefController f17725b;
    public final TLRPC.TL_messages_sendMedia f17726c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f17724a = i10;
        this.f17725b = fileRefController;
        this.f17726c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17724a) {
            case 0:
                this.f17725b.lambda$onUpdateObjectReference$31(this.f17726c, this.d);
                return;
            default:
                this.f17725b.lambda$sendErrorToObject$42(this.f17726c, this.d);
                return;
        }
    }
}
