package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ar implements Runnable {
    public final int f14661a;
    public final hs f14662b;
    public final TLRPC.TL_chatFull f14663c;

    public ar(hs hsVar, TLRPC.TL_chatFull tL_chatFull, int i10) {
        this.f14661a = i10;
        this.f14662b = hsVar;
        this.f14663c = tL_chatFull;
    }

    @Override
    public final void run() {
        int i10 = this.f14661a;
        TLRPC.TL_chatFull tL_chatFull = this.f14663c;
        hs hsVar = this.f14662b;
        switch (i10) {
            case 0:
                zs notificationCenter = hsVar.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                return;
            default:
                zs notificationCenter2 = hsVar.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                return;
        }
    }
}
