package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f20726a;
    public final FileRefController f20727b;
    public final TLRPC.TL_messages_sendMedia f20728c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f20726a = i10;
        this.f20727b = fileRefController;
        this.f20728c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f20726a) {
            case 0:
                this.f20727b.lambda$onUpdateObjectReference$31(this.f20728c, this.d);
                return;
            default:
                this.f20727b.lambda$sendErrorToObject$42(this.f20728c, this.d);
                return;
        }
    }
}
