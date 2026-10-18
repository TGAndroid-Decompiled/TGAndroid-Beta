package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class n3 implements Runnable {
    public final int f19027a;
    public final FileRefController f19028b;
    public final TLRPC.TL_messages_sendMultiMedia f19029c;
    public final Object[] d;

    public n3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f19027a = i10;
        this.f19028b = fileRefController;
        this.f19029c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19027a) {
            case 0:
                this.f19028b.lambda$onUpdateObjectReference$30(this.f19029c, this.d);
                return;
            default:
                this.f19028b.lambda$sendErrorToObject$41(this.f19029c, this.d);
                return;
        }
    }
}
