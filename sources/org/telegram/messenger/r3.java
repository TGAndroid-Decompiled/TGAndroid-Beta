package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class r3 implements Runnable {
    public final int f21091a;
    public final FileRefController f21092b;
    public final TLRPC.TL_messages_sendMedia f21093c;
    public final Object[] d;

    public r3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f21091a = i10;
        this.f21092b = fileRefController;
        this.f21093c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f21091a) {
            case 0:
                this.f21092b.lambda$onUpdateObjectReference$31(this.f21093c, this.d);
                return;
            default:
                this.f21092b.lambda$sendErrorToObject$42(this.f21093c, this.d);
                return;
        }
    }
}
