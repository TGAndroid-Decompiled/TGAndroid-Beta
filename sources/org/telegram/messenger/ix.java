package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ix implements Runnable {
    public final int f16184a;
    public final qz f16185b;
    public final TLRPC.Message f16186c;
    public final int d;

    public ix(qz qzVar, TLRPC.Message message, int i10, int i11) {
        this.f16184a = i11;
        this.f16185b = qzVar;
        this.f16186c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f16184a;
        int i11 = this.d;
        TLRPC.Message message = this.f16186c;
        qz qzVar = this.f16185b;
        boolean z10 = true;
        switch (i10) {
            case 0:
                message.send_state = 2;
                qzVar.getNotificationCenter().k(23, Integer.valueOf(message.f19814id));
                qzVar.d0(message.f19814id);
                int i12 = message.f19814id;
                if (i11 == 0) {
                    z10 = false;
                }
                qzVar.i0(i12, z10);
                return;
            default:
                message.send_state = 0;
                qzVar.getNotificationCenter().k(20, Integer.valueOf(i11));
                return;
        }
    }
}
