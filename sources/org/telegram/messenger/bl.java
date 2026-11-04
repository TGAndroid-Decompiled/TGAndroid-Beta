package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class bl implements Runnable {
    public final int f21849a;
    public final hp f21850b;
    public final TL_account.TL_webBrowserSettings f21851c;

    public bl(hp hpVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i3) {
        this.f21849a = i3;
        this.f21850b = hpVar;
        this.f21851c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f21849a) {
            case 0:
                hp hpVar = this.f21850b;
                mj mjVar = hpVar.f23168x8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f21851c;
                if (tL_webBrowserSettings != null) {
                    hpVar.f23178y8 = tL_webBrowserSettings;
                    hpVar.getNotificationCenter().k(346, new Object[0]);
                }
                g0.r(mjVar);
                g0.i3(mjVar, 3600010L);
                return;
            default:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.f21851c;
                if (tL_webBrowserSettings2 != null) {
                    hp hpVar2 = this.f21850b;
                    hpVar2.f23178y8 = tL_webBrowserSettings2;
                    hpVar2.getNotificationCenter().k(346, new Object[0]);
                    return;
                }
                return;
        }
    }
}
