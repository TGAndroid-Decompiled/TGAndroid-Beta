package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uq implements Runnable {
    public final int f25884a;
    public final yr f25885b;
    public final TLRPC.TL_chatFull f25886c;

    public uq(yr yrVar, TLRPC.TL_chatFull tL_chatFull, int i7) {
        this.f25884a = i7;
        this.f25885b = yrVar;
        this.f25886c = tL_chatFull;
    }

    @Override
    public final void run() {
        int i7 = this.f25884a;
        TLRPC.TL_chatFull tL_chatFull = this.f25886c;
        yr yrVar = this.f25885b;
        switch (i7) {
            case 0:
                qs notificationCenter = yrVar.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                return;
            default:
                qs notificationCenter2 = yrVar.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                return;
        }
    }
}
