package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pw implements Runnable {
    public final int f26309a;
    public final zy f26310b;
    public final TLRPC.Message f26311c;
    public final int d;

    public pw(zy zyVar, TLRPC.Message message, int i7, int i10) {
        this.f26309a = i10;
        this.f26310b = zyVar;
        this.f26311c = message;
        this.d = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f26309a;
        int i10 = this.d;
        TLRPC.Message message = this.f26311c;
        zy zyVar = this.f26310b;
        boolean z10 = true;
        switch (i7) {
            case 0:
                message.send_state = 2;
                zyVar.getNotificationCenter().k(23, Integer.valueOf(message.f28426id));
                zyVar.d0(message.f28426id);
                int i11 = message.f28426id;
                if (i10 == 0) {
                    z10 = false;
                }
                zyVar.i0(i11, z10);
                return;
            default:
                message.send_state = 0;
                zyVar.getNotificationCenter().k(20, Integer.valueOf(i10));
                return;
        }
    }
}
