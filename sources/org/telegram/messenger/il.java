package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class il implements Runnable {
    public final int f24411a;
    public final np f24412b;
    public final TL_account.TL_webBrowserSettings f24413c;

    public il(np npVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i7) {
        this.f24411a = i7;
        this.f24412b = npVar;
        this.f24413c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f24411a) {
            case 0:
                np npVar = this.f24412b;
                tj tjVar = npVar.f25452y8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f24413c;
                if (tL_webBrowserSettings != null) {
                    npVar.f25461z8 = tL_webBrowserSettings;
                    npVar.getNotificationCenter().k(346, new Object[0]);
                }
                g0.r(tjVar);
                g0.i3(tjVar, 3600010L);
                return;
            default:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.f24413c;
                if (tL_webBrowserSettings2 != null) {
                    np npVar2 = this.f24412b;
                    npVar2.f25461z8 = tL_webBrowserSettings2;
                    npVar2.getNotificationCenter().k(346, new Object[0]);
                    return;
                }
                return;
        }
    }
}
