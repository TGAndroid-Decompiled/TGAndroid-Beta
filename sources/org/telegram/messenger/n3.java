package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class n3 implements Runnable {
    public final int f19012a;
    public final FileRefController f19013b;
    public final TLRPC.TL_messages_sendMultiMedia f19014c;
    public final Object[] d;

    public n3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f19012a = i10;
        this.f19013b = fileRefController;
        this.f19014c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19012a) {
            case 0:
                this.f19013b.lambda$onUpdateObjectReference$30(this.f19014c, this.d);
                return;
            default:
                this.f19013b.lambda$sendErrorToObject$41(this.f19014c, this.d);
                return;
        }
    }
}
