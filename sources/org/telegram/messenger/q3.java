package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class q3 implements Runnable {
    public final int f19346a;
    public final FileRefController f19347b;
    public final TLRPC.TL_messages_sendMedia f19348c;
    public final Object[] d;

    public q3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f19346a = i10;
        this.f19347b = fileRefController;
        this.f19348c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19346a) {
            case 0:
                this.f19347b.lambda$onUpdateObjectReference$31(this.f19348c, this.d);
                return;
            default:
                this.f19347b.lambda$sendErrorToObject$42(this.f19348c, this.d);
                return;
        }
    }
}
