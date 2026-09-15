package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f16534a;
    public final FileRefController f16535b;
    public final TLRPC.TL_messages_sendMedia f16536c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f16534a = i10;
        this.f16535b = fileRefController;
        this.f16536c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16534a) {
            case 0:
                this.f16535b.lambda$onUpdateObjectReference$31(this.f16536c, this.d);
                return;
            default:
                this.f16535b.lambda$sendErrorToObject$42(this.f16536c, this.d);
                return;
        }
    }
}
