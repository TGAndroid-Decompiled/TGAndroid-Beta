package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class l3 implements Runnable {
    public final int f18431a;
    public final FileRefController f18432b;
    public final TLRPC.TL_messages_sendMedia f18433c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f18431a = i10;
        this.f18432b = fileRefController;
        this.f18433c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18431a) {
            case 0:
                this.f18432b.lambda$onUpdateObjectReference$31(this.f18433c, this.d);
                return;
            default:
                this.f18432b.lambda$sendErrorToObject$42(this.f18433c, this.d);
                return;
        }
    }
}
