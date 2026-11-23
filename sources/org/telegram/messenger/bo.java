package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class bo implements y10 {
    public final int f23143a;
    public final np f23144b;

    public bo(np npVar, int i7) {
        this.f23143a = i7;
        this.f23144b = npVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f23143a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                np npVar = this.f23144b;
                if (npVar.f25916n8 != messages_availableeffects) {
                    npVar.f25916n8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.p5.g(npVar.currentAccount).f(npVar.f25916n8.documents);
                    }
                    npVar.getNotificationCenter().k(219, new Object[0]);
                }
                npVar.f25907m8 = false;
                return;
            case 1:
                g0.g3(new gi(17, this.f23144b, (TLRPC.TL_help_appConfig) obj));
                return;
            default:
                g0.g3(new kl(this.f23144b, (TL_account.TL_webBrowserSettings) obj, 1));
                return;
        }
    }
}
