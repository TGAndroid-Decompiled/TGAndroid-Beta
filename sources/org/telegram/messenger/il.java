package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class il implements j20 {
    public final int f16145a;
    public final vp f16146b;

    public il(vp vpVar, int i10) {
        this.f16145a = i10;
        this.f16146b = vpVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f16145a) {
            case 0:
                Long l4 = (Long) obj;
                i0.g3(new pl(this.f16146b, (TL_account.TL_webBrowserSettings) obj2, 1));
                return;
            case 1:
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                boolean z10 = webBrowserSettings instanceof TL_account.TL_webBrowserSettings;
                vp vpVar = this.f16146b;
                if (z10) {
                    vpVar.N4((TL_account.TL_webBrowserSettings) webBrowserSettings);
                    return;
                } else {
                    vpVar.getClass();
                    return;
                }
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                vp vpVar2 = this.f16146b;
                if (updates != null) {
                    vpVar2.L3(updates, false);
                    return;
                } else {
                    vpVar2.getClass();
                    return;
                }
            case 3:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                vp vpVar3 = this.f16146b;
                if (updates2 != null) {
                    vpVar3.L3(updates2, false);
                }
                i0.g3(new zj(vpVar3, 22));
                return;
            case 4:
                TLRPC.Updates updates3 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                vp vpVar4 = this.f16146b;
                if (updates3 != null) {
                    vpVar4.L3(updates3, false);
                }
                i0.g3(new zj(vpVar4, 20));
                return;
            case 5:
                TLRPC.EmojiGameInfo emojiGameInfo = (TLRPC.EmojiGameInfo) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                vp vpVar5 = this.f16146b;
                if (emojiGameInfo != null) {
                    vpVar5.f18949x8 = emojiGameInfo;
                }
                ArrayList arrayList = vpVar5.f18939w8;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    ((q20) obj3).a(Boolean.valueOf(vpVar5.f18949x8 instanceof TLRPC.TL_emojiGameDiceInfo));
                }
                vpVar5.f18939w8 = null;
                return;
            default:
                TL_account.WebBrowserSettings webBrowserSettings2 = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                boolean z11 = webBrowserSettings2 instanceof TL_account.TL_webBrowserSettings;
                vp vpVar6 = this.f16146b;
                if (z11) {
                    vpVar6.N4((TL_account.TL_webBrowserSettings) webBrowserSettings2);
                    return;
                } else {
                    vpVar6.getClass();
                    return;
                }
        }
    }
}
