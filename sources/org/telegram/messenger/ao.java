package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ao implements x10 {
    public final int f22928a;
    public final mp f22929b;

    public ao(mp mpVar, int i7) {
        this.f22928a = i7;
        this.f22929b = mpVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f22928a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                mp mpVar = this.f22929b;
                if (mpVar.f25717n8 != messages_availableeffects) {
                    mpVar.f25717n8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.o5.g(mpVar.currentAccount).f(mpVar.f25717n8.documents);
                    }
                    mpVar.getNotificationCenter().k(219, new Object[0]);
                }
                mpVar.f25708m8 = false;
                return;
            case 1:
                g0.g3(new fi(17, this.f22929b, (TLRPC.TL_help_appConfig) obj));
                return;
            default:
                g0.g3(new jl(this.f22929b, (TL_account.TL_webBrowserSettings) obj, 1));
                return;
        }
    }
}
