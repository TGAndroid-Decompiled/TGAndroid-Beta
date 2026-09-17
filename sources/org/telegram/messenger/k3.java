package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f18175a;
    public final FileRefController f18176b;
    public final TLRPC.TL_messages_sendMedia f18177c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f18175a = i10;
        this.f18176b = fileRefController;
        this.f18177c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18175a) {
            case 0:
                this.f18176b.lambda$onUpdateObjectReference$31(this.f18177c, this.d);
                return;
            default:
                this.f18176b.lambda$sendErrorToObject$42(this.f18177c, this.d);
                return;
        }
    }
}
