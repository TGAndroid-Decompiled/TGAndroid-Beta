package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class o3 implements Runnable {
    public final int f19138a;
    public final FileRefController f19139b;
    public final TLRPC.TL_messages_sendMedia f19140c;
    public final Object[] d;

    public o3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f19138a = i10;
        this.f19139b = fileRefController;
        this.f19140c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19138a) {
            case 0:
                this.f19139b.lambda$onUpdateObjectReference$31(this.f19140c, this.d);
                return;
            default:
                this.f19139b.lambda$sendErrorToObject$42(this.f19140c, this.d);
                return;
        }
    }
}
