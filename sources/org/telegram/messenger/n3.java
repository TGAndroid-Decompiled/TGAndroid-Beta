package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class n3 implements Runnable {
    public final int f17916a;
    public final FileRefController f17917b;
    public final TLRPC.TL_messages_sendMultiMedia f17918c;
    public final Object[] d;

    public n3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f17916a = i10;
        this.f17917b = fileRefController;
        this.f17918c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f17916a) {
            case 0:
                this.f17917b.lambda$onUpdateObjectReference$30(this.f17918c, this.d);
                return;
            default:
                this.f17917b.lambda$sendErrorToObject$41(this.f17918c, this.d);
                return;
        }
    }
}
