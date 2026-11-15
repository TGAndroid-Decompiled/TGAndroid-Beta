package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rq implements Runnable {
    public final int f26325a;
    public final vr f26326b;
    public final TLRPC.TL_chatFull f26327c;

    public rq(vr vrVar, TLRPC.TL_chatFull tL_chatFull, int i7) {
        this.f26325a = i7;
        this.f26326b = vrVar;
        this.f26327c = tL_chatFull;
    }

    @Override
    public final void run() {
        int i7 = this.f26325a;
        TLRPC.TL_chatFull tL_chatFull = this.f26327c;
        vr vrVar = this.f26326b;
        switch (i7) {
            case 0:
                ns notificationCenter = vrVar.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                return;
            default:
                ns notificationCenter2 = vrVar.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                return;
        }
    }
}
