package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ao implements w10 {
    public final int f23039a;
    public final mp f23040b;

    public ao(mp mpVar, int i7) {
        this.f23039a = i7;
        this.f23040b = mpVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f23039a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                mp mpVar = this.f23040b;
                if (mpVar.f25812n8 != messages_availableeffects) {
                    mpVar.f25812n8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.o5.g(mpVar.currentAccount).f(mpVar.f25812n8.documents);
                    }
                    mpVar.getNotificationCenter().k(219, new Object[0]);
                }
                mpVar.f25803m8 = false;
                return;
            case 1:
                g0.g3(new fi(17, this.f23040b, (TLRPC.TL_help_appConfig) obj));
                return;
            default:
                g0.g3(new jl(this.f23040b, (TL_account.TL_webBrowserSettings) obj, 1));
                return;
        }
    }
}
