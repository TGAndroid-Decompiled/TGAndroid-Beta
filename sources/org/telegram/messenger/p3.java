package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class p3 implements Runnable {
    public final int f19193a;
    public final FileRefController f19194b;
    public final TLRPC.TL_messages_sendMedia f19195c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f19193a = i10;
        this.f19194b = fileRefController;
        this.f19195c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19193a) {
            case 0:
                this.f19194b.lambda$onUpdateObjectReference$31(this.f19195c, this.d);
                return;
            default:
                this.f19194b.lambda$sendErrorToObject$42(this.f19195c, this.d);
                return;
        }
    }
}
