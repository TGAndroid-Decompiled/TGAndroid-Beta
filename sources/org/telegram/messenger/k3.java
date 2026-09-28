package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class k3 implements Runnable {
    public final int f16789a;
    public final FileRefController f16790b;
    public final TLRPC.TL_messages_sendMedia f16791c;
    public final Object[] d;

    public k3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f16789a = i10;
        this.f16790b = fileRefController;
        this.f16791c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f16789a) {
            case 0:
                this.f16790b.lambda$onUpdateObjectReference$31(this.f16791c, this.d);
                return;
            default:
                this.f16790b.lambda$sendErrorToObject$42(this.f16791c, this.d);
                return;
        }
    }
}
