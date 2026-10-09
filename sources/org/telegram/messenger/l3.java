package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class l3 implements Runnable {
    public final int f18390a;
    public final FileRefController f18391b;
    public final TLRPC.TL_messages_sendMedia f18392c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f18390a = i10;
        this.f18391b = fileRefController;
        this.f18392c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18390a) {
            case 0:
                this.f18391b.lambda$onUpdateObjectReference$31(this.f18392c, this.d);
                return;
            default:
                this.f18391b.lambda$sendErrorToObject$42(this.f18392c, this.d);
                return;
        }
    }
}
