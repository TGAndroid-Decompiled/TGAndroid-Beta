package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f18148a;
    public final FileRefController f18149b;
    public final TLRPC.TL_messages_sendMedia f18150c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f18148a = i10;
        this.f18149b = fileRefController;
        this.f18150c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18148a) {
            case 0:
                this.f18149b.lambda$onUpdateObjectReference$31(this.f18150c, this.d);
                return;
            default:
                this.f18149b.lambda$sendErrorToObject$42(this.f18150c, this.d);
                return;
        }
    }
}
