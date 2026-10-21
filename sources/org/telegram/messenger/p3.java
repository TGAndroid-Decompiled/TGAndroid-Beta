package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class p3 implements Runnable {
    public final int f19190a;
    public final FileRefController f19191b;
    public final TLRPC.TL_messages_sendMultiMedia f19192c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f19190a = i10;
        this.f19191b = fileRefController;
        this.f19192c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19190a) {
            case 0:
                this.f19191b.lambda$onUpdateObjectReference$30(this.f19192c, this.d);
                return;
            default:
                this.f19191b.lambda$sendErrorToObject$41(this.f19192c, this.d);
                return;
        }
    }
}
