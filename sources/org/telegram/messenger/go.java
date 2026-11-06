package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class go implements c20 {
    public final int f22673a;
    public final qp f22674b;

    public go(qp qpVar, int i7) {
        this.f22673a = i7;
        this.f22674b = qpVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f22673a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                qp qpVar = this.f22674b;
                if (qpVar.f24787h8 != messages_availableeffects) {
                    qpVar.f24787h8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.i5.g(qpVar.currentAccount).f(qpVar.f24787h8.documents);
                    }
                    qpVar.getNotificationCenter().k(217, new Object[0]);
                }
                qpVar.f24779g8 = false;
                return;
            case 1:
                g0.h3(new hi(18, this.f22674b, (TLRPC.TL_help_appConfig) obj));
                return;
            default:
                g0.h3(new ll(this.f22674b, (TL_account.TL_webBrowserSettings) obj, 0));
                return;
        }
    }
}
