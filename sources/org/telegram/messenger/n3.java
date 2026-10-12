package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class n3 implements Runnable {
    public final int f18341a;
    public final FileRefController f18342b;
    public final TLRPC.TL_messages_sendMultiMedia f18343c;
    public final Object[] d;

    public n3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f18341a = i10;
        this.f18342b = fileRefController;
        this.f18343c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18341a) {
            case 0:
                this.f18342b.lambda$onUpdateObjectReference$30(this.f18343c, this.d);
                return;
            default:
                this.f18342b.lambda$sendErrorToObject$41(this.f18343c, this.d);
                return;
        }
    }
}
