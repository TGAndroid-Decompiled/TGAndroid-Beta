package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class no implements r20 {
    public final int f17324a;
    public final wp f17325b;

    public no(wp wpVar, int i10) {
        this.f17324a = i10;
        this.f17325b = wpVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f17324a) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                wp wpVar = this.f17325b;
                if (wpVar.f19157i8 != messages_availableeffects) {
                    wpVar.f19157i8 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        org.telegram.ui.Components.f5.g(wpVar.currentAccount).f(wpVar.f19157i8.documents);
                    }
                    wpVar.getNotificationCenter().k(217, new Object[0]);
                }
                wpVar.f19148h8 = false;
                return;
            case 1:
                i0.g3(new pi(17, this.f17325b, (TLRPC.TL_help_appConfig) obj));
                return;
            default:
                i0.g3(new ql(this.f17325b, (TL_account.TL_webBrowserSettings) obj, 0));
                return;
        }
    }
}
