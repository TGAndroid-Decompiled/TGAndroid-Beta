package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class l3 implements Runnable {
    public final int f17703a;
    public final FileRefController f17704b;
    public final TLRPC.TL_messages_sendMedia f17705c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f17703a = i10;
        this.f17704b = fileRefController;
        this.f17705c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17703a) {
            case 0:
                this.f17704b.lambda$onUpdateObjectReference$31(this.f17705c, this.d);
                return;
            default:
                this.f17704b.lambda$sendErrorToObject$42(this.f17705c, this.d);
                return;
        }
    }
}
