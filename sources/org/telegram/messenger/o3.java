package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class o3 implements Runnable {
    public final int f15925a;
    public final FileRefController f15926b;
    public final TLRPC.TL_messages_sendMultiMedia f15927c;
    public final Object[] d;

    public o3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f15925a = i10;
        this.f15926b = fileRefController;
        this.f15927c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f15925a) {
            case 0:
                this.f15926b.lambda$onUpdateObjectReference$30(this.f15927c, this.d);
                return;
            default:
                this.f15926b.lambda$sendErrorToObject$41(this.f15927c, this.d);
                return;
        }
    }
}
