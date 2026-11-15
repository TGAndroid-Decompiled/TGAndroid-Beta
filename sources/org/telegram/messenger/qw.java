package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qw implements Runnable {
    public final int f26135a;
    public final ez f26136b;
    public final TLRPC.Message f26137c;
    public final boolean d;

    public qw(ez ezVar, TLRPC.Message message, boolean z10, int i7) {
        this.f26135a = i7;
        this.f26136b = ezVar;
        this.f26137c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f26135a) {
            case 0:
                ez ezVar = this.f26136b;
                ezVar.getClass();
                TLRPC.Message message = this.f26137c;
                ezVar.d0(message.f28072id);
                ezVar.i0(message.f28072id, this.d);
                return;
            case 1:
                ez ezVar2 = this.f26136b;
                ezVar2.getClass();
                TLRPC.Message message2 = this.f26137c;
                ezVar2.d0(message2.f28072id);
                ezVar2.i0(message2.f28072id, this.d);
                return;
            default:
                this.f26136b.g0(this.f26137c, this.d);
                return;
        }
    }
}
