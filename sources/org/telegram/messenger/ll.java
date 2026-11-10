package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class ll implements Runnable {
    public final int f23912a;
    public final qp f23913b;
    public final TL_account.TL_webBrowserSettings f23914c;

    public ll(qp qpVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i7) {
        this.f23912a = i7;
        this.f23913b = qpVar;
        this.f23914c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f23912a) {
            case 0:
                qp qpVar = this.f23913b;
                vj vjVar = qpVar.f24947x8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f23914c;
                if (tL_webBrowserSettings != null) {
                    qpVar.f24957y8 = tL_webBrowserSettings;
                    qpVar.getNotificationCenter().k(346, new Object[0]);
                }
                g0.r(vjVar);
                g0.i3(vjVar, 3600010L);
                return;
            default:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.f23914c;
                if (tL_webBrowserSettings2 != null) {
                    qp qpVar2 = this.f23913b;
                    qpVar2.f24957y8 = tL_webBrowserSettings2;
                    qpVar2.getNotificationCenter().k(346, new Object[0]);
                    return;
                }
                return;
        }
    }
}
