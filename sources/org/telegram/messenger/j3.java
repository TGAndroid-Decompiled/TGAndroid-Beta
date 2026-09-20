package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f16682a;
    public final FileRefController f16683b;
    public final TLRPC.TL_messages_sendMultiMedia f16684c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f16682a = i10;
        this.f16683b = fileRefController;
        this.f16684c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16682a) {
            case 0:
                this.f16683b.lambda$onUpdateObjectReference$30(this.f16684c, this.d);
                return;
            default:
                this.f16683b.lambda$sendErrorToObject$41(this.f16684c, this.d);
                return;
        }
    }
}
