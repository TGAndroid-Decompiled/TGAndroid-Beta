package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f18316a;
    public final FileRefController f18317b;
    public final TLRPC.TL_messages_sendMedia f18318c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f18316a = i10;
        this.f18317b = fileRefController;
        this.f18318c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18316a) {
            case 0:
                this.f18317b.lambda$onUpdateObjectReference$31(this.f18318c, this.d);
                return;
            default:
                this.f18317b.lambda$sendErrorToObject$42(this.f18318c, this.d);
                return;
        }
    }
}
