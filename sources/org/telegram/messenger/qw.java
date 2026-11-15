package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qw implements Runnable {
    public final int f26143a;
    public final ez f26144b;
    public final TLRPC.Message f26145c;
    public final boolean d;

    public qw(ez ezVar, TLRPC.Message message, boolean z10, int i7) {
        this.f26143a = i7;
        this.f26144b = ezVar;
        this.f26145c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26143a) {
            case 0:
                ez ezVar = this.f26144b;
                ezVar.getClass();
                TLRPC.Message message = this.f26145c;
                ezVar.d0(message.f28072id);
                ezVar.i0(message.f28072id, this.d);
                return;
            case 1:
                ez ezVar2 = this.f26144b;
                ezVar2.getClass();
                TLRPC.Message message2 = this.f26145c;
                ezVar2.d0(message2.f28072id);
                ezVar2.i0(message2.f28072id, this.d);
                return;
            default:
                this.f26144b.g0(this.f26145c, this.d);
                return;
        }
    }
}
