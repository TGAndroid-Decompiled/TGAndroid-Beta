package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class go implements c20 {
    public final int f22680a;
    public final qp f22681b;

    public go(qp qpVar, int i7) {
        this.f22680a = i7;
        this.f22681b = qpVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f22680a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                qp qpVar = this.f22681b;
                if (qpVar.f24795h8 != messages_availableeffects) {
                    qpVar.f24795h8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.i5.g(qpVar.currentAccount).f(qpVar.f24795h8.documents);
                    }
                    qpVar.getNotificationCenter().k(217, new Object[0]);
                }
                qpVar.f24787g8 = false;
                return;
            case 1:
                g0.h3(new hi(18, this.f22681b, (TLRPC.TL_help_appConfig) obj));
                return;
            default:
                g0.h3(new ll(this.f22681b, (TL_account.TL_webBrowserSettings) obj, 0));
                return;
        }
    }
}
