package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f16788a;
    public final FileRefController f16789b;
    public final TLRPC.TL_messages_sendMedia f16790c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f16788a = i10;
        this.f16789b = fileRefController;
        this.f16790c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16788a) {
            case 0:
                this.f16789b.lambda$onUpdateObjectReference$31(this.f16790c, this.d);
                return;
            default:
                this.f16789b.lambda$sendErrorToObject$42(this.f16790c, this.d);
                return;
        }
    }
}
