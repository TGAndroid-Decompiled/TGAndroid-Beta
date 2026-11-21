package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class jl implements Runnable {
    public final int f24914a;
    public final mp f24915b;
    public final TL_account.TL_webBrowserSettings f24916c;

    public jl(mp mpVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i7) {
        this.f24914a = i7;
        this.f24915b = mpVar;
        this.f24916c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f24914a) {
            case 0:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f24916c;
                if (tL_webBrowserSettings != null) {
                    mp mpVar = this.f24915b;
                    mpVar.E8 = tL_webBrowserSettings;
                    mpVar.getNotificationCenter().k(349, new Object[0]);
                    return;
                }
                return;
            default:
                mp mpVar2 = this.f24915b;
                rj rjVar = mpVar2.D8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.f24916c;
                if (tL_webBrowserSettings2 != null) {
                    mpVar2.E8 = tL_webBrowserSettings2;
                    mpVar2.getNotificationCenter().k(349, new Object[0]);
                }
                g0.r(rjVar);
                g0.h3(rjVar, 3600010L);
                return;
        }
    }
}
