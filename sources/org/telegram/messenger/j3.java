package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f16719a;
    public final FileRefController f16720b;
    public final TLRPC.TL_messages_sendMultiMedia f16721c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f16719a = i10;
        this.f16720b = fileRefController;
        this.f16721c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16719a) {
            case 0:
                this.f16720b.lambda$onUpdateObjectReference$30(this.f16721c, this.d);
                return;
            default:
                this.f16720b.lambda$sendErrorToObject$41(this.f16721c, this.d);
                return;
        }
    }
}
