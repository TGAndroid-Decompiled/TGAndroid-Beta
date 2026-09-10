package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class p3 implements Runnable {
    public final int f16021a;
    public final FileRefController f16022b;
    public final TLRPC.TL_messages_sendMedia f16023c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f16021a = i10;
        this.f16022b = fileRefController;
        this.f16023c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16021a) {
            case 0:
                this.f16022b.lambda$onUpdateObjectReference$31(this.f16023c, this.d);
                return;
            default:
                this.f16022b.lambda$sendErrorToObject$42(this.f16023c, this.d);
                return;
        }
    }
}
