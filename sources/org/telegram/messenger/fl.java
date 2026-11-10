package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class fl implements v10 {
    public final int f22439a;
    public final qp f22440b;

    public fl(qp qpVar, int i7) {
        this.f22439a = i7;
        this.f22440b = qpVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f22439a) {
            case 0:
                Long l10 = (Long) obj;
                g0.h3(new ll(this.f22440b, (TL_account.TL_webBrowserSettings) obj2, 1));
                return;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                boolean z9 = webBrowserSettings instanceof TL_account.TL_webBrowserSettings;
                qp qpVar = this.f22440b;
                if (z9) {
                    qpVar.Q4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    return;
                } else {
                    qpVar.getClass();
                    return;
                }
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                qp qpVar2 = this.f22440b;
                if (updates != null) {
                    qpVar2.O3(updates, false);
                    return;
                } else {
                    qpVar2.getClass();
                    return;
                }
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                qp qpVar3 = this.f22440b;
                if (updates2 != null) {
                    qpVar3.O3(updates2, false);
                }
                g0.h3(new vj(qpVar3, 23));
                return;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                qp qpVar4 = this.f22440b;
                if (updates3 != null) {
                    qpVar4.O3(updates3, false);
                }
                g0.h3(new vj(qpVar4, 22));
                return;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                qp qpVar5 = this.f22440b;
                if (emojiGameInfo != null) {
                    qpVar5.f24937w8 = emojiGameInfo;
                }
                ArrayList arrayList = qpVar5.f24927v8;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj3 = arrayList.get(i7);
                    i7++;
                    ((c20) obj3).a(Boolean.valueOf(qpVar5.f24937w8 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                qpVar5.f24927v8 = null;
                return;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                boolean z10 = webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings;
                qp qpVar6 = this.f22440b;
                if (z10) {
                    qpVar6.Q4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    return;
                } else {
                    qpVar6.getClass();
                    return;
                }
        }
    }
}
