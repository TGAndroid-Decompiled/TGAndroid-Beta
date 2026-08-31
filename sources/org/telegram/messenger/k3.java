package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f19118a;
    public final FileRefController f19119b;
    public final TLRPC.TL_messages_sendMultiMedia f19120c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f19118a = i10;
        this.f19119b = fileRefController;
        this.f19120c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19118a) {
            case 0:
                this.f19119b.lambda$onUpdateObjectReference$30(this.f19120c, this.d);
                return;
            default:
                this.f19119b.lambda$sendErrorToObject$41(this.f19120c, this.d);
                return;
        }
    }
}
