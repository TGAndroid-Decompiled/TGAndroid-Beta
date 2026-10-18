package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class o3 implements Runnable {
    public final int f19140a;
    public final FileRefController f19141b;
    public final TLRPC.TL_messages_sendMedia f19142c;
    public final Object[] d;

    public o3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f19140a = i10;
        this.f19141b = fileRefController;
        this.f19142c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19140a) {
            case 0:
                this.f19141b.lambda$onUpdateObjectReference$31(this.f19142c, this.d);
                return;
            default:
                this.f19141b.lambda$sendErrorToObject$42(this.f19142c, this.d);
                return;
        }
    }
}
