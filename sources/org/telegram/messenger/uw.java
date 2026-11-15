package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uw implements Runnable {
    public final int f26884a;
    public final ez f26885b;
    public final TLRPC.Message f26886c;
    public final int d;

    public uw(ez ezVar, TLRPC.Message message, int i7, int i10) {
        this.f26884a = i10;
        this.f26885b = ezVar;
        this.f26886c = message;
        this.d = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f26884a;
        int i10 = this.d;
        TLRPC.Message message = this.f26886c;
        ez ezVar = this.f26885b;
        boolean z10 = true;
        switch (i7) {
            case 0:
                message.send_state = 2;
                ezVar.getNotificationCenter().k(23, Integer.valueOf(message.f28072id));
                ezVar.d0(message.f28072id);
                int i11 = message.f28072id;
                if (i10 == 0) {
                    z10 = false;
                }
                ezVar.i0(i11, z10);
                return;
            default:
                message.send_state = 0;
                ezVar.getNotificationCenter().k(20, Integer.valueOf(i10));
                return;
        }
    }
}
