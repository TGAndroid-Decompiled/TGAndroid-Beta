package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class kl implements Runnable {
    public final int f25065a;
    public final np f25066b;
    public final TL_account.TL_webBrowserSettings f25067c;

    public kl(np npVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i7) {
        this.f25065a = i7;
        this.f25066b = npVar;
        this.f25067c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f25065a) {
            case 0:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f25067c;
                if (tL_webBrowserSettings != null) {
                    np npVar = this.f25066b;
                    npVar.E8 = tL_webBrowserSettings;
                    npVar.getNotificationCenter().k(349, new Object[0]);
                    return;
                }
                return;
            default:
                np npVar2 = this.f25066b;
                sj sjVar = npVar2.D8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.f25067c;
                if (tL_webBrowserSettings2 != null) {
                    npVar2.E8 = tL_webBrowserSettings2;
                    npVar2.getNotificationCenter().k(349, new Object[0]);
                }
                g0.r(sjVar);
                g0.h3(sjVar, 3600010L);
                return;
        }
    }
}
