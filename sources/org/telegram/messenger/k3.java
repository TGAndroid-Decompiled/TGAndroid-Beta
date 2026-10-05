package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f18321a;
    public final FileRefController f18322b;
    public final TLRPC.TL_messages_sendMedia f18323c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f18321a = i10;
        this.f18322b = fileRefController;
        this.f18323c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18321a) {
            case 0:
                this.f18322b.lambda$onUpdateObjectReference$31(this.f18323c, this.d);
                return;
            default:
                this.f18322b.lambda$sendErrorToObject$42(this.f18323c, this.d);
                return;
        }
    }
}
