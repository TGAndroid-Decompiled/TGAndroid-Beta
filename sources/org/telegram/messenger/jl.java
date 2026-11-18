package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class jl implements Runnable {
    public final int f24886a;
    public final mp f24887b;
    public final TL_account.TL_webBrowserSettings f24888c;

    public jl(mp mpVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i7) {
        this.f24886a = i7;
        this.f24887b = mpVar;
        this.f24888c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f24886a) {
            case 0:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f24888c;
                if (tL_webBrowserSettings != null) {
                    mp mpVar = this.f24887b;
                    mpVar.E8 = tL_webBrowserSettings;
                    mpVar.getNotificationCenter().k(349, new Object[0]);
                    return;
                }
                return;
            default:
                mp mpVar2 = this.f24887b;
                rj rjVar = mpVar2.D8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.f24888c;
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
