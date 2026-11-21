package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ao implements x10 {
    public final int f22956a;
    public final mp f22957b;

    public ao(mp mpVar, int i7) {
        this.f22956a = i7;
        this.f22957b = mpVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f22956a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                mp mpVar = this.f22957b;
                if (mpVar.f25745n8 != messages_availableeffects) {
                    mpVar.f25745n8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.p5.g(mpVar.currentAccount).f(mpVar.f25745n8.documents);
                    }
                    mpVar.getNotificationCenter().k(219, new Object[0]);
                }
                mpVar.f25736m8 = false;
                return;
            case 1:
                g0.g3(new fi(17, this.f22957b, (TLRPC.TL_help_appConfig) obj));
                return;
            default:
                g0.g3(new jl(this.f22957b, (TL_account.TL_webBrowserSettings) obj, 1));
                return;
        }
    }
}
