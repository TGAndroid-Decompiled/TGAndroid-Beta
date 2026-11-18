package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ey implements Runnable {
    public final int f23800a;
    public final zy f23801b;
    public final TLRPC.Updates f23802c;
    public final TLRPC.Message d;
    public final boolean f23803e;

    public ey(zy zyVar, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i7) {
        this.f23800a = i7;
        this.f23801b = zyVar;
        this.f23802c = updates;
        this.d = message;
        this.f23803e = z10;
    }

    @Override
    public final void run() {
        switch (this.f23800a) {
            case 0:
                zy zyVar = this.f23801b;
                zyVar.getMessagesController().V3(this.f23802c, false);
                g0.g3(new lw(zyVar, this.d, this.f23803e, 0));
                return;
            default:
                zy zyVar2 = this.f23801b;
                zyVar2.getMessagesController().V3(this.f23802c, false);
                g0.g3(new lw(zyVar2, this.d, this.f23803e, 1));
                return;
        }
    }
}
