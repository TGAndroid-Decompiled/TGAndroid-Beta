package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class co implements z10 {
    public final int f22915a;
    public final np f22916b;

    public co(np npVar, int i7) {
        this.f22915a = i7;
        this.f22916b = npVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f22915a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                np npVar = this.f22916b;
                if (npVar.f25309i8 != messages_availableeffects) {
                    npVar.f25309i8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.g5.g(npVar.currentAccount).f(npVar.f25309i8.documents);
                    }
                    npVar.getNotificationCenter().k(217, new Object[0]);
                }
                npVar.f25301h8 = false;
                return;
            case 1:
                g0.h3(new fi(18, this.f22916b, (TLRPC.TL_help_appConfig) obj));
                return;
            default:
                g0.h3(new il(this.f22916b, (TL_account.TL_webBrowserSettings) obj, 0));
                return;
        }
    }
}
