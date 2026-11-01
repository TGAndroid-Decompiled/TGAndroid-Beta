package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_account;
public final class ql implements Runnable {
    public final int f17789a;
    public final wp f17790b;
    public final TL_account.TL_webBrowserSettings f17791c;

    public ql(wp wpVar, TL_account.TL_webBrowserSettings tL_webBrowserSettings, int i10) {
        this.f17789a = i10;
        this.f17790b = wpVar;
        this.f17791c = tL_webBrowserSettings;
    }

    @Override
    public final void run() {
        switch (this.f17789a) {
            case 0:
                wp wpVar = this.f17790b;
                ak akVar = wpVar.f19301y8;
                TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.f17791c;
                if (tL_webBrowserSettings != null) {
                    wpVar.f19310z8 = tL_webBrowserSettings;
                    wpVar.getNotificationCenter().k(346, new Object[0]);
                }
                i0.r(akVar);
                i0.h3(akVar, 3600010L);
                return;
            default:
                TL_account.TL_webBrowserSettings tL_webBrowserSettings2 = this.f17791c;
                if (tL_webBrowserSettings2 != null) {
                    wp wpVar2 = this.f17790b;
                    wpVar2.f19310z8 = tL_webBrowserSettings2;
                    wpVar2.getNotificationCenter().k(346, new Object[0]);
                    return;
                }
                return;
        }
    }
}
