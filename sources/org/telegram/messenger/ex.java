package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ex implements Runnable {
    public final int f15476a;
    public final qz f15477b;
    public final TLRPC.Message f15478c;
    public final boolean d;

    public ex(qz qzVar, TLRPC.Message message, boolean z10, int i10) {
        this.f15476a = i10;
        this.f15477b = qzVar;
        this.f15478c = message;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f15476a) {
            case 0:
                qz qzVar = this.f15477b;
                qzVar.getClass();
                TLRPC.Message message = this.f15478c;
                qzVar.d0(message.f19814id);
                qzVar.i0(message.f19814id, this.d);
                return;
            case 1:
                qz qzVar2 = this.f15477b;
                qzVar2.getClass();
                TLRPC.Message message2 = this.f15478c;
                qzVar2.d0(message2.f19814id);
                qzVar2.i0(message2.f19814id, this.d);
                return;
            default:
                this.f15477b.g0(this.f15478c, this.d);
                return;
        }
    }
}
