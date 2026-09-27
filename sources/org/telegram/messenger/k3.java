package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f16780a;
    public final FileRefController f16781b;
    public final TLRPC.TL_messages_sendMedia f16782c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f16780a = i10;
        this.f16781b = fileRefController;
        this.f16782c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16780a) {
            case 0:
                this.f16781b.lambda$onUpdateObjectReference$31(this.f16782c, this.d);
                return;
            default:
                this.f16781b.lambda$sendErrorToObject$42(this.f16782c, this.d);
                return;
        }
    }
}
