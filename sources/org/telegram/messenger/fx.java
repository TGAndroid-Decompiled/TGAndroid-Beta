package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fx implements Runnable {
    public final int f15817a;
    public final rz f15818b;
    public final TLRPC.Message f15819c;
    public final boolean d;

    public fx(rz rzVar, TLRPC.Message message, boolean z10, int i10) {
        this.f15817a = i10;
        this.f15818b = rzVar;
        this.f15819c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f15817a) {
            case 0:
                rz rzVar = this.f15818b;
                rzVar.getClass();
                TLRPC.Message message = this.f15819c;
                rzVar.d0(message.f19815id);
                rzVar.i0(message.f19815id, this.d);
                return;
            case 1:
                rz rzVar2 = this.f15818b;
                rzVar2.getClass();
                TLRPC.Message message2 = this.f15819c;
                rzVar2.d0(message2.f19815id);
                rzVar2.i0(message2.f19815id, this.d);
                return;
            default:
                this.f15818b.g0(this.f15819c, this.d);
                return;
        }
    }
}
