package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class p3 implements Runnable {
    public final int f19237a;
    public final FileRefController f19238b;
    public final TLRPC.TL_messages_sendMultiMedia f19239c;
    public final Object[] d;

    public p3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f19237a = i10;
        this.f19238b = fileRefController;
        this.f19239c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19237a) {
            case 0:
                this.f19238b.lambda$onUpdateObjectReference$30(this.f19239c, this.d);
                return;
            default:
                this.f19238b.lambda$sendErrorToObject$41(this.f19239c, this.d);
                return;
        }
    }
}
