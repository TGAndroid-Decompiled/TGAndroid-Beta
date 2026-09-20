package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f16764a;
    public final FileRefController f16765b;
    public final TLRPC.TL_messages_sendMedia f16766c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f16764a = i10;
        this.f16765b = fileRefController;
        this.f16766c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16764a) {
            case 0:
                this.f16765b.lambda$onUpdateObjectReference$31(this.f16766c, this.d);
                return;
            default:
                this.f16765b.lambda$sendErrorToObject$42(this.f16766c, this.d);
                return;
        }
    }
}
