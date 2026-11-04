package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wk implements n10 {
    public final int f26221a;
    public final hp f26222b;

    public wk(hp hpVar, int i3) {
        this.f26221a = i3;
        this.f26222b = hpVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f26221a) {
            case 0:
                Long l10 = (Long) obj;
                g0.h3(new bl(this.f26222b, (TL_account.TL_webBrowserSettings) obj2, 1));
                return;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                boolean z10 = webBrowserSettings instanceof TL_account.TL_webBrowserSettings;
                hp hpVar = this.f26222b;
                if (z10) {
                    hpVar.Q4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    return;
                } else {
                    hpVar.getClass();
                    return;
                }
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                hp hpVar2 = this.f26222b;
                if (updates != null) {
                    hpVar2.O3(updates, false);
                    return;
                } else {
                    hpVar2.getClass();
                    return;
                }
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                hp hpVar3 = this.f26222b;
                if (updates2 != null) {
                    hpVar3.O3(updates2, false);
                }
                g0.h3(new mj(hpVar3, 22));
                return;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                hp hpVar4 = this.f26222b;
                if (updates3 != null) {
                    hpVar4.O3(updates3, false);
                }
                g0.h3(new mj(hpVar4, 21));
                return;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                hp hpVar5 = this.f26222b;
                if (emojiGameInfo != null) {
                    hpVar5.f23158w8 = emojiGameInfo;
                }
                ArrayList arrayList = hpVar5.f23148v8;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayList.get(i3);
                    i3++;
                    ((u10) obj3).a(Boolean.valueOf(hpVar5.f23158w8 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                hpVar5.f23148v8 = null;
                return;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                boolean z11 = webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings;
                hp hpVar6 = this.f26222b;
                if (z11) {
                    hpVar6.Q4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    return;
                } else {
                    hpVar6.getClass();
                    return;
                }
        }
    }
}
