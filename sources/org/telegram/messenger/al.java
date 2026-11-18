package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class al implements q10 {
    public final int f22921a;
    public final mp f22922b;

    public al(mp mpVar, int i7) {
        this.f22921a = i7;
        this.f22922b = mpVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f22921a) {
            case 0:
                Long l10 = (Long) obj;
                g0.g3(new jl(this.f22922b, (TL_account.TL_webBrowserSettings) obj2, 0));
                return;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                boolean z10 = webBrowserSettings instanceof TL_account.TL_webBrowserSettings;
                mp mpVar = this.f22922b;
                if (z10) {
                    mpVar.c5((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    return;
                } else {
                    mpVar.getClass();
                    return;
                }
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                mp mpVar2 = this.f22922b;
                if (updates != null) {
                    mpVar2.V3(updates, false);
                    return;
                } else {
                    mpVar2.getClass();
                    return;
                }
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                mp mpVar3 = this.f22922b;
                if (updates2 != null) {
                    mpVar3.V3(updates2, false);
                }
                g0.g3(new rj(mpVar3, 23));
                return;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                mp mpVar4 = this.f22922b;
                if (updates3 != null) {
                    mpVar4.V3(updates3, false);
                }
                g0.g3(new rj(mpVar4, 21));
                return;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                mp mpVar5 = this.f22922b;
                if (emojiGameInfo != null) {
                    mpVar5.C8 = emojiGameInfo;
                }
                ArrayList arrayList = mpVar5.B8;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj3 = arrayList.get(i7);
                    i7++;
                    ((x10) obj3).a(Boolean.valueOf(mpVar5.C8 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                mpVar5.B8 = null;
                return;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                boolean z11 = webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings;
                mp mpVar6 = this.f22922b;
                if (z11) {
                    mpVar6.c5((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    return;
                } else {
                    mpVar6.getClass();
                    return;
                }
        }
    }
}
