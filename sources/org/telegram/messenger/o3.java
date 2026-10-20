package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class o3 implements Runnable {
    public final int f19106a;
    public final FileRefController f19107b;
    public final TLRPC.TL_messages_sendMultiMedia f19108c;
    public final Object[] d;

    public o3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f19106a = i10;
        this.f19107b = fileRefController;
        this.f19108c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19106a) {
            case 0:
                this.f19107b.lambda$onUpdateObjectReference$30(this.f19108c, this.d);
                return;
            default:
                this.f19107b.lambda$sendErrorToObject$41(this.f19108c, this.d);
                return;
        }
    }
}
