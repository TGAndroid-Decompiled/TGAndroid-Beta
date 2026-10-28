package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class s3 implements Runnable {
    public final int f21168a;
    public final FileRefController f21169b;
    public final TLRPC.TL_messages_sendMedia f21170c;
    public final Object[] d;

    public s3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f21168a = i10;
        this.f21169b = fileRefController;
        this.f21170c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f21168a) {
            case 0:
                this.f21169b.lambda$onUpdateObjectReference$31(this.f21170c, this.d);
                return;
            default:
                this.f21169b.lambda$sendErrorToObject$42(this.f21170c, this.d);
                return;
        }
    }
}
