package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class mo implements q20 {
    public final int f16982a;
    public final vp f16983b;

    public mo(vp vpVar, int i10) {
        this.f16982a = i10;
        this.f16983b = vpVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f16982a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                vp vpVar = this.f16983b;
                if (vpVar.f18814i8 != messages_availableeffects) {
                    vpVar.f18814i8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.f5.g(vpVar.currentAccount).f(vpVar.f18814i8.documents);
                    }
                    vpVar.getNotificationCenter().k(217, new Object[0]);
                }
                vpVar.f18805h8 = false;
                return;
            case 1:
                i0.g3(new oi(17, this.f16983b, (TLRPC.TL_help_appConfig) obj));
                return;
            default:
                i0.g3(new pl(this.f16983b, (TL_account.TL_webBrowserSettings) obj, 0));
                return;
        }
    }
}
