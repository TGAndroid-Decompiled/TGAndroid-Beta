package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wq implements Runnable {
    public final int f27748a;
    public final ur f27749b;
    public final TLRPC.TL_chatFull f27750c;

    public wq(ur urVar, TLRPC.TL_chatFull tL_chatFull, int i7) {
        this.f27748a = i7;
        this.f27749b = urVar;
        this.f27750c = tL_chatFull;
    }

    @Override
    public final void run() {
        int i7 = this.f27748a;
        TLRPC.TL_chatFull tL_chatFull = this.f27750c;
        ur urVar = this.f27749b;
        switch (i7) {
            case 0:
                ls notificationCenter = urVar.getNotificationCenter();
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(30, tL_chatFull, 0, bool, bool);
                return;
            default:
                ls notificationCenter2 = urVar.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter2.k(30, tL_chatFull, 0, bool2, bool2);
                return;
        }
    }
}
