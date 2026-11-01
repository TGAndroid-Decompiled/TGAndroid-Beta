package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class jl implements k20 {
    public final int f16480a;
    public final wp f16481b;

    public jl(wp wpVar, int i10) {
        this.f16480a = i10;
        this.f16481b = wpVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f16480a) {
            case 0:
                Long l4 = (Long) obj;
                i0.g3(new ql(this.f16481b, (TL_account.TL_webBrowserSettings) obj2, 1));
                return;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                boolean z10 = webBrowserSettings instanceof TL_account.TL_webBrowserSettings;
                wp wpVar = this.f16481b;
                if (z10) {
                    wpVar.N4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    return;
                } else {
                    wpVar.getClass();
                    return;
                }
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                wp wpVar2 = this.f16481b;
                if (updates != null) {
                    wpVar2.L3(updates, false);
                    return;
                } else {
                    wpVar2.getClass();
                    return;
                }
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                wp wpVar3 = this.f16481b;
                if (updates2 != null) {
                    wpVar3.L3(updates2, false);
                }
                i0.g3(new ak(wpVar3, 22));
                return;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                wp wpVar4 = this.f16481b;
                if (updates3 != null) {
                    wpVar4.L3(updates3, false);
                }
                i0.g3(new ak(wpVar4, 20));
                return;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                wp wpVar5 = this.f16481b;
                if (emojiGameInfo != null) {
                    wpVar5.f19292x8 = emojiGameInfo;
                }
                ArrayList arrayList = wpVar5.f19282w8;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    ((r20) obj3).a(Boolean.valueOf(wpVar5.f19292x8 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                wpVar5.f19282w8 = null;
                return;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                boolean z11 = webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings;
                wp wpVar6 = this.f16481b;
                if (z11) {
                    wpVar6.N4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    return;
                } else {
                    wpVar6.getClass();
                    return;
                }
        }
    }
}
