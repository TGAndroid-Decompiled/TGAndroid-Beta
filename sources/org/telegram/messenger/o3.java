package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class o3 implements Runnable {
    public final int f19103a;
    public final FileRefController f19104b;
    public final TLRPC.TL_messages_sendMedia f19105c;
    public final Object[] d;

    public o3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f19103a = i10;
        this.f19104b = fileRefController;
        this.f19105c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19103a) {
            case 0:
                this.f19104b.lambda$onUpdateObjectReference$31(this.f19105c, this.d);
                return;
            default:
                this.f19104b.lambda$sendErrorToObject$42(this.f19105c, this.d);
                return;
        }
    }
}
