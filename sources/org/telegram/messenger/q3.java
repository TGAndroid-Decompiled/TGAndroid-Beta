package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class q3 implements Runnable {
    public final int f19309a;
    public final FileRefController f19310b;
    public final TLRPC.TL_messages_sendMedia f19311c;
    public final Object[] d;

    public q3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f19309a = i10;
        this.f19310b = fileRefController;
        this.f19311c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19309a) {
            case 0:
                this.f19310b.lambda$onUpdateObjectReference$31(this.f19311c, this.d);
                return;
            default:
                this.f19310b.lambda$sendErrorToObject$42(this.f19311c, this.d);
                return;
        }
    }
}
