package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class pl implements Runnable {
    public final int f17454a;
    public final vp f17455b;
    public final TL_account.TL_webBrowserSettings f17456c;

    public pl(vp vpVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17454a = i10;
        this.f17455b = vpVar;
        this.f17456c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17454a) {
            case 0:
                vp vpVar = this.f17455b;
                zj zjVar = vpVar.f18958y8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f17456c;
                if (tL_webBrowserSettings != null) {
                    vpVar.f18967z8 = tL_webBrowserSettings;
                    vpVar.getNotificationCenter().k(346, new Object[0]);
                }
                i0.r(zjVar);
                i0.h3(zjVar, 3600010L);
                return;
            default:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.f17456c;
                if (tL_webBrowserSettings2 != null) {
                    vp vpVar2 = this.f17455b;
                    vpVar2.f18967z8 = tL_webBrowserSettings2;
                    vpVar2.getNotificationCenter().k(346, new Object[0]);
                    return;
                }
                return;
        }
    }
}
