package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class p3 implements Runnable {
    public final int f19179a;
    public final FileRefController f19180b;
    public final TLRPC.TL_messages_sendMultiMedia f19181c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f19179a = i10;
        this.f19180b = fileRefController;
        this.f19181c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19179a) {
            case 0:
                this.f19180b.lambda$onUpdateObjectReference$30(this.f19181c, this.d);
                return;
            default:
                this.f19180b.lambda$sendErrorToObject$41(this.f19181c, this.d);
                return;
        }
    }
}
