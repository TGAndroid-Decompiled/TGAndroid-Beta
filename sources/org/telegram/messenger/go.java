package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class go implements c20 {
    public final int f22702a;
    public final qp f22703b;

    public go(qp qpVar, int i7) {
        this.f22702a = i7;
        this.f22703b = qpVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f22702a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                qp qpVar = this.f22703b;
                if (qpVar.f24802h8 != messages_availableeffects) {
                    qpVar.f24802h8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.i5.g(qpVar.currentAccount).f(qpVar.f24802h8.documents);
                    }
                    qpVar.getNotificationCenter().k(217, new Object[0]);
                }
                qpVar.f24794g8 = false;
                return;
            case 1:
                g0.h3(new hi(18, this.f22703b, (TLRPC.TL_help_appConfig) obj));
                return;
            default:
                g0.h3(new ll(this.f22703b, (TL_account.TL_webBrowserSettings) obj, 0));
                return;
        }
    }
}
