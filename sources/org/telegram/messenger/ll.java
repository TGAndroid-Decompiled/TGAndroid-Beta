package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class ll implements Runnable {
    public final int f23902a;
    public final qp f23903b;
    public final TL_account.TL_webBrowserSettings f23904c;

    public ll(qp qpVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i7) {
        this.f23902a = i7;
        this.f23903b = qpVar;
        this.f23904c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f23902a) {
            case 0:
                qp qpVar = this.f23903b;
                wj wjVar = qpVar.f24936x8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f23904c;
                if (tL_webBrowserSettings != null) {
                    qpVar.f24946y8 = tL_webBrowserSettings;
                    qpVar.getNotificationCenter().k(346, new Object[0]);
                }
                g0.r(wjVar);
                g0.i3(wjVar, 3600010L);
                return;
            default:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.f23904c;
                if (tL_webBrowserSettings2 != null) {
                    qp qpVar2 = this.f23903b;
                    qpVar2.f24946y8 = tL_webBrowserSettings2;
                    qpVar2.getNotificationCenter().k(346, new Object[0]);
                    return;
                }
                return;
        }
    }
}
