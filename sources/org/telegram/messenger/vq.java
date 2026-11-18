package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vq implements Runnable {
    public final int f27580a;
    public final tr f27581b;
    public final TLRPC.TL_chatFull f27582c;

    public vq(tr trVar, TLRPC.TL_chatFull tL_chatFull, int i7) {
        this.f27580a = i7;
        this.f27581b = trVar;
        this.f27582c = tL_chatFull;
    }

    @Override
    public final void run() {
        int i7 = this.f27580a;
        TLRPC.TL_chatFull tL_chatFull = this.f27582c;
        tr trVar = this.f27581b;
        switch (i7) {
            case 0:
                ks notificationCenter = trVar.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                return;
            default:
                ks notificationCenter2 = trVar.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                return;
        }
    }
}
