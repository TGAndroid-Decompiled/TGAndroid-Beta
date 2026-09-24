package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f16683a;
    public final FileRefController f16684b;
    public final TLRPC.TL_messages_sendMultiMedia f16685c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f16683a = i10;
        this.f16684b = fileRefController;
        this.f16685c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16683a) {
            case 0:
                this.f16684b.lambda$onUpdateObjectReference$30(this.f16685c, this.d);
                return;
            default:
                this.f16684b.lambda$sendErrorToObject$41(this.f16685c, this.d);
                return;
        }
    }
}
