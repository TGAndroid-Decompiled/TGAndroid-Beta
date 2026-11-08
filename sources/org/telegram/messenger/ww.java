package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ww implements Runnable {
    public final int f26392a;
    public final gz f26393b;
    public final TLRPC.Message f26394c;
    public final int d;

    public ww(gz gzVar, TLRPC.Message message, int i7, int i10) {
        this.f26392a = i10;
        this.f26393b = gzVar;
        this.f26394c = message;
        this.d = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f26392a;
        int i10 = this.d;
        TLRPC.Message message = this.f26394c;
        gz gzVar = this.f26393b;
        boolean z9 = true;
        switch (i7) {
            case 0:
                message.send_state = 2;
                gzVar.getNotificationCenter().k(23, Integer.valueOf(message.f26977id));
                gzVar.d0(message.f26977id);
                int i11 = message.f26977id;
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
