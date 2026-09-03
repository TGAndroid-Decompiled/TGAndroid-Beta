package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f19120a;
    public final FileRefController f19121b;
    public final TLRPC.TL_messages_sendMultiMedia f19122c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f19120a = i10;
        this.f19121b = fileRefController;
        this.f19122c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19120a) {
            case 0:
                this.f19121b.lambda$onUpdateObjectReference$30(this.f19122c, this.d);
                return;
            default:
                this.f19121b.lambda$sendErrorToObject$41(this.f19122c, this.d);
                return;
        }
    }
}
