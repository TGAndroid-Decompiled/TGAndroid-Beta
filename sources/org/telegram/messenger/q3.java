package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class q3 implements Runnable {
    public final int f19319a;
    public final FileRefController f19320b;
    public final TLRPC.TL_messages_sendMedia f19321c;
    public final Object[] d;

    public q3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f19319a = i10;
        this.f19320b = fileRefController;
        this.f19321c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19319a) {
            case 0:
                this.f19320b.lambda$onUpdateObjectReference$31(this.f19321c, this.d);
                return;
            default:
                this.f19320b.lambda$sendErrorToObject$42(this.f19321c, this.d);
                return;
        }
    }
}
