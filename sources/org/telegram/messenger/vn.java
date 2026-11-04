package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class vn implements u10 {
    public final int f25967a;
    public final hp f25968b;

    public vn(hp hpVar, int i3) {
        this.f25967a = i3;
        this.f25968b = hpVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f25967a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                hp hpVar = this.f25968b;
                if (hpVar.f23026h8 != messages_availableeffects) {
                    hpVar.f23026h8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.g5.g(hpVar.currentAccount).f(hpVar.f23026h8.documents);
                    }
                    hpVar.getNotificationCenter().k(217, new Object[0]);
                }
                hpVar.f23018g8 = false;
                return;
            case 1:
                g0.h3(new yh(18, this.f25968b, (TLRPC.TL_help_appConfig) obj));
                return;
            default:
                g0.h3(new bl(this.f25968b, (TL_account.TL_webBrowserSettings) obj, 0));
                return;
        }
    }
}
