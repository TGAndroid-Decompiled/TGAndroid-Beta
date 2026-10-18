package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class n3 implements Runnable {
    public final int f19009a;
    public final FileRefController f19010b;
    public final TLRPC.TL_messages_sendMultiMedia f19011c;
    public final Object[] d;

    public n3(FileRefController fileRefController, TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, Object[] objArr, int i10) {
        this.f19009a = i10;
        this.f19010b = fileRefController;
        this.f19011c = tL_messages_sendMultiMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19009a) {
            case 0:
                this.f19010b.lambda$onUpdateObjectReference$30(this.f19011c, this.d);
                return;
            default:
                this.f19010b.lambda$sendErrorToObject$41(this.f19011c, this.d);
                return;
        }
    }
}
