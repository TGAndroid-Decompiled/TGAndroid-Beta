package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class lq implements Runnable {
    public final int f24097a;
    public final qr f24098b;
    public final TLRPC.TL_chatFull f24099c;

    public lq(qr qrVar, TLRPC.TL_chatFull tL_chatFull, int i3) {
        this.f24097a = i3;
        this.f24098b = qrVar;
        this.f24099c = tL_chatFull;
    }

    @Override
    public final void run() {
        int i3 = this.f24097a;
        TLRPC.TL_chatFull tL_chatFull = this.f24099c;
        qr qrVar = this.f24098b;
        switch (i3) {
            case 0:
                hs notificationCenter = qrVar.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                return;
            default:
                hs notificationCenter2 = qrVar.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                return;
        }
    }
}
