package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class q3 implements Runnable {
    public final int f19276a;
    public final FileRefController f19277b;
    public final TLRPC.TL_messages_sendMedia f19278c;
    public final Object[] d;

    public q3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f19276a = i10;
        this.f19277b = fileRefController;
        this.f19278c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19276a) {
            case 0:
                this.f19277b.lambda$onUpdateObjectReference$31(this.f19278c, this.d);
                return;
            default:
                this.f19277b.lambda$sendErrorToObject$42(this.f19278c, this.d);
                return;
        }
    }
}
