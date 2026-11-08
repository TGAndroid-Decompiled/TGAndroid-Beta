package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class ll implements Runnable {
    public final int f23908a;
    public final qp f23909b;
    public final TL_account.TL_webBrowserSettings f23910c;

    public ll(qp qpVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i7) {
        this.f23908a = i7;
        this.f23909b = qpVar;
        this.f23910c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f23908a) {
            case 0:
                qp qpVar = this.f23909b;
                vj vjVar = qpVar.f24943x8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f23910c;
                if (tL_webBrowserSettings != null) {
                    qpVar.f24953y8 = tL_webBrowserSettings;
                    qpVar.getNotificationCenter().k(346, new Object[0]);
                }
                g0.r(vjVar);
                g0.i3(vjVar, 3600010L);
                return;
            default:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.f23910c;
                if (tL_webBrowserSettings2 != null) {
                    qp qpVar2 = this.f23909b;
                    qpVar2.f24953y8 = tL_webBrowserSettings2;
                    qpVar2.getNotificationCenter().k(346, new Object[0]);
                    return;
                }
                return;
        }
    }
}
