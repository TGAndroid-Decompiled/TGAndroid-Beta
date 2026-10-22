package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class q3 implements Runnable {
    public final int f19252a;
    public final FileRefController f19253b;
    public final TLRPC.TL_messages_sendMedia f19254c;
    public final Object[] d;

    public q3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f19252a = i10;
        this.f19253b = fileRefController;
        this.f19254c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19252a) {
            case 0:
                this.f19253b.lambda$onUpdateObjectReference$31(this.f19254c, this.d);
                return;
            default:
                this.f19253b.lambda$sendErrorToObject$42(this.f19254c, this.d);
                return;
        }
    }
}
