package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class l3 implements Runnable {
    public final int f19230a;
    public final FileRefController f19231b;
    public final TLRPC.TL_messages_sendMedia f19232c;
    public final Object[] d;

    public l3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f19230a = i10;
        this.f19231b = fileRefController;
        this.f19232c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19230a) {
            case 0:
                this.f19231b.lambda$onUpdateObjectReference$31(this.f19232c, this.d);
                return;
            default:
                this.f19231b.lambda$sendErrorToObject$42(this.f19232c, this.d);
                return;
        }
    }
}
