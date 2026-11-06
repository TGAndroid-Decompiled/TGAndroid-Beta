package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xw implements Runnable {
    public final int f26515a;
    public final gz f26516b;
    public final TLRPC.Message f26517c;
    public final int d;

    public xw(gz gzVar, TLRPC.Message message, int i7, int i10) {
        this.f26515a = i10;
        this.f26516b = gzVar;
        this.f26517c = message;
        this.d = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f26515a;
        int i10 = this.d;
        TLRPC.Message message = this.f26517c;
        gz gzVar = this.f26516b;
        boolean z9 = true;
        switch (i7) {
            case 0:
                message.send_state = 2;
                gzVar.getNotificationCenter().k(23, Integer.valueOf(message.f26973id));
                gzVar.d0(message.f26973id);
                int i11 = message.f26973id;
                if (i10 == 0) {
                    z9 = false;
                }
                gzVar.i0(i11, z9);
                return;
            default:
                message.send_state = 0;
                gzVar.getNotificationCenter().k(20, Integer.valueOf(i10));
                return;
        }
    }
}
