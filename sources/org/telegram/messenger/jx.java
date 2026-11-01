package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jx implements Runnable {
    public final int f16520a;
    public final rz f16521b;
    public final TLRPC.Message f16522c;
    public final int d;

    public jx(rz rzVar, TLRPC.Message message, int i10, int i11) {
        this.f16520a = i11;
        this.f16521b = rzVar;
        this.f16522c = message;
        this.d = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f16520a;
        int i11 = this.d;
        TLRPC.Message message = this.f16522c;
        rz rzVar = this.f16521b;
        boolean z10 = true;
        switch (i10) {
            case 0:
                message.send_state = 2;
                rzVar.getNotificationCenter().k(23, Integer.valueOf(message.f19815id));
                rzVar.d0(message.f19815id);
                int i12 = message.f19815id;
                if (i11 == 0) {
                    z10 = false;
                }
                rzVar.i0(i12, z10);
                return;
            default:
                message.send_state = 0;
                rzVar.getNotificationCenter().k(20, Integer.valueOf(i11));
                return;
        }
    }
}
