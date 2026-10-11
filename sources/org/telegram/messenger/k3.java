package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f18354a;
    public final FileRefController f18355b;
    public final TLRPC.TL_messages_sendMultiMedia f18356c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f18354a = i10;
        this.f18355b = fileRefController;
        this.f18356c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18354a) {
            case 0:
                this.f18355b.lambda$onUpdateObjectReference$30(this.f18356c, this.d);
                return;
            default:
                this.f18355b.lambda$sendErrorToObject$41(this.f18356c, this.d);
                return;
        }
    }
}
