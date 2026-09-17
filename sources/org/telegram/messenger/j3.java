package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class j3 implements Runnable {
    public final int f18068a;
    public final FileRefController f18069b;
    public final TLRPC.TL_messages_sendMultiMedia f18070c;
    public final Object[] d;

    public j3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f18068a = i10;
        this.f18069b = fileRefController;
        this.f18070c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f18068a) {
            case 0:
                this.f18069b.lambda$onUpdateObjectReference$30(this.f18070c, this.d);
                return;
            default:
                this.f18069b.lambda$sendErrorToObject$41(this.f18070c, this.d);
                return;
        }
    }
}
