package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cl implements s10 {
    public final int f22904a;
    public final np f22905b;

    public cl(np npVar, int i7) {
        this.f22904a = i7;
        this.f22905b = npVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f22904a) {
            case 0:
                Long l10 = (Long) obj;
                g0.h3(new il(this.f22905b, (TL_account.TL_webBrowserSettings) obj2, 1));
                return;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                boolean z10 = webBrowserSettings instanceof TL_account.TL_webBrowserSettings;
                np npVar = this.f22905b;
                if (z10) {
                    npVar.R4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    return;
                } else {
                    npVar.getClass();
                    return;
                }
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                np npVar2 = this.f22905b;
                if (updates != null) {
                    npVar2.O3(updates, false);
                    return;
                } else {
                    npVar2.getClass();
                    return;
                }
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                np npVar3 = this.f22905b;
                if (updates2 != null) {
                    npVar3.O3(updates2, false);
                }
                g0.h3(new tj(npVar3, 23));
                return;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                np npVar4 = this.f22905b;
                if (updates3 != null) {
                    npVar4.O3(updates3, false);
                }
                g0.h3(new tj(npVar4, 22));
                return;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                np npVar5 = this.f22905b;
                if (emojiGameInfo != null) {
                    npVar5.f25442x8 = emojiGameInfo;
                }
                ArrayList arrayList = npVar5.f25432w8;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj3 = arrayList.get(i7);
                    i7++;
                    ((z10) obj3).a(Boolean.valueOf(npVar5.f25442x8 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                npVar5.f25432w8 = null;
                return;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                boolean z11 = webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings;
                np npVar6 = this.f22905b;
                if (z11) {
                    npVar6.R4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    return;
                } else {
                    npVar6.getClass();
                    return;
                }
        }
    }
}
