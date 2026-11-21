package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vq implements Runnable {
    public final int f27608a;
    public final tr f27609b;
    public final TLRPC.TL_chatFull f27610c;

    public vq(tr trVar, TLRPC.TL_chatFull tL_chatFull, int i7) {
        this.f27608a = i7;
        this.f27609b = trVar;
        this.f27610c = tL_chatFull;
    }

    @Override
    public final void run() {
        int i7 = this.f27608a;
        TLRPC.TL_chatFull tL_chatFull = this.f27610c;
        tr trVar = this.f27609b;
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
