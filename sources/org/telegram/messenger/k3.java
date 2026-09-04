package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f18113a;
    public final FileRefController f18114b;
    public final TLRPC.TL_messages_sendMedia f18115c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f18113a = i10;
        this.f18114b = fileRefController;
        this.f18115c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18113a) {
            case 0:
                this.f18114b.lambda$onUpdateObjectReference$31(this.f18115c, this.d);
                return;
            default:
                this.f18114b.lambda$sendErrorToObject$42(this.f18115c, this.d);
                return;
        }
    }
}
