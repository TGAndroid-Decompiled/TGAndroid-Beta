package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class xq implements Runnable {
    public final int f27566a;
    public final vr f27567b;
    public final TLRPC.TL_chatFull f27568c;

    public xq(vr vrVar, TLRPC.TL_chatFull tL_chatFull, int i7) {
        this.f27566a = i7;
        this.f27567b = vrVar;
        this.f27568c = tL_chatFull;
    }

    @Override
    public final void run() {
        int i7 = this.f27566a;
        TLRPC.TL_chatFull tL_chatFull = this.f27568c;
        vr vrVar = this.f27567b;
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
