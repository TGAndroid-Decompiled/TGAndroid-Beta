package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class i3 implements Runnable {
    public final int f20552a;
    public final FileRefController f20553b;
    public final TLRPC.TL_messages_sendMultiMedia f20554c;
    public final Object[] d;

    public i3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i9) {
        this.f20552a = i9;
        this.f20553b = fileRefController;
        this.f20554c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f20552a) {
            case 0:
                this.f20553b.lambda$onUpdateObjectReference$30(this.f20554c, this.d);
                return;
            default:
                this.f20553b.lambda$sendErrorToObject$41(this.f20554c, this.d);
                return;
        }
    }
}
