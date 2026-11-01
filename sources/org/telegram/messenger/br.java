package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class br implements Runnable {
    public final int f15016a;
    public final is f15017b;
    public final TLRPC.TL_chatFull f15018c;

    public br(is isVar, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f15016a = i10;
        this.f15017b = isVar;
        this.f15018c = tL_chatFull;
    }

    @Override
    public final void run() {
        int i10 = this.f15016a;
        TLRPC.TL_chatFull tL_chatFull = this.f15018c;
        is isVar = this.f15017b;
        switch (i10) {
            case 0:
                at notificationCenter = isVar.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                return;
            default:
                at notificationCenter2 = isVar.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                return;
        }
    }
}
