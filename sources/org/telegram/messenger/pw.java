package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pw implements Runnable {
    public final int f24805a;
    public final yy f24806b;
    public final TLRPC.Message f24807c;
    public final int d;

    public pw(yy yyVar, TLRPC.Message message, int i3, int i10) {
        this.f24805a = i10;
        this.f24806b = yyVar;
        this.f24807c = message;
        this.d = i3;
    }

    @Override
    public final void run() {
        int i3 = this.f24805a;
        int i10 = this.d;
        TLRPC.Message message = this.f24807c;
        yy yyVar = this.f24806b;
        boolean z10 = true;
        switch (i3) {
            case 0:
                message.send_state = 2;
                yyVar.getNotificationCenter().k(23, Integer.valueOf(message.f27022id));
                yyVar.d0(message.f27022id);
                int i11 = message.f27022id;
                if (i10 == 0) {
                    z10 = false;
                }
                yyVar.i0(i11, z10);
                return;
            default:
                message.send_state = 0;
                yyVar.getNotificationCenter().k(20, Integer.valueOf(i10));
                return;
        }
    }
}
