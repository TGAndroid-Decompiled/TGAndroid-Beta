package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class l3 implements Runnable {
    public final int f19228a;
    public final FileRefController f19229b;
    public final TLRPC.TL_messages_sendMedia f19230c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f19228a = i10;
        this.f19229b = fileRefController;
        this.f19230c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19228a) {
            case 0:
                this.f19229b.lambda$onUpdateObjectReference$31(this.f19230c, this.d);
                return;
            default:
                this.f19229b.lambda$sendErrorToObject$42(this.f19230c, this.d);
                return;
        }
    }
}
