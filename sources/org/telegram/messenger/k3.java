package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f16779a;
    public final FileRefController f16780b;
    public final TLRPC.TL_messages_sendMedia f16781c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f16779a = i10;
        this.f16780b = fileRefController;
        this.f16781c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16779a) {
            case 0:
                this.f16780b.lambda$onUpdateObjectReference$31(this.f16781c, this.d);
                return;
            default:
                this.f16780b.lambda$sendErrorToObject$42(this.f16781c, this.d);
                return;
        }
    }
}
