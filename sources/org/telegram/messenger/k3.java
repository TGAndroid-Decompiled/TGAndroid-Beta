package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f16770a;
    public final FileRefController f16771b;
    public final TLRPC.TL_messages_sendMedia f16772c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f16770a = i10;
        this.f16771b = fileRefController;
        this.f16772c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16770a) {
            case 0:
                this.f16771b.lambda$onUpdateObjectReference$31(this.f16772c, this.d);
                return;
            default:
                this.f16771b.lambda$sendErrorToObject$42(this.f16772c, this.d);
                return;
        }
    }
}
