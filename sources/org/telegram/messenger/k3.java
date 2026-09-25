package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f16785a;
    public final FileRefController f16786b;
    public final TLRPC.TL_messages_sendMedia f16787c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f16785a = i10;
        this.f16786b = fileRefController;
        this.f16787c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16785a) {
            case 0:
                this.f16786b.lambda$onUpdateObjectReference$31(this.f16787c, this.d);
                return;
            default:
                this.f16786b.lambda$sendErrorToObject$42(this.f16787c, this.d);
                return;
        }
    }
}
