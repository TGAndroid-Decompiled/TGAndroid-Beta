package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class o3 implements Runnable {
    public final int f18438a;
    public final FileRefController f18439b;
    public final TLRPC.TL_messages_sendMedia f18440c;
    public final Object[] d;

    public o3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f18438a = i10;
        this.f18439b = fileRefController;
        this.f18440c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18438a) {
            case 0:
                this.f18439b.lambda$onUpdateObjectReference$31(this.f18440c, this.d);
                return;
            default:
                this.f18439b.lambda$sendErrorToObject$42(this.f18440c, this.d);
                return;
        }
    }
}
