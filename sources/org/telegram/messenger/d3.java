package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class d3 implements c20 {
    public final int f21944a;
    public final Object f21945b;
    public final Object f21946c;
    public final Object d;

    public d3(Object obj, Object obj2, Object obj3, int i7) {
        this.f21944a = i7;
        this.f21945b = obj;
        this.f21946c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        boolean z9;
        TLRPC.Document document;
        switch (this.f21944a) {
            case 0:
                e3 e3Var = (e3) this.f21945b;
                c20 c20Var = (c20) this.d;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj;
                if (((TL_stories.TL_premium_boostsStatus) this.f21946c).next_level_boosts <= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                e3Var.f22150m = z9;
                e3Var.a(tL_premium_myBoosts);
                c20Var.a(e3Var);
                return;
            case 1:
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) obj;
                ((x6) this.f21945b).f26429b.put(((w6) this.f21946c).f26251b, tL_factCheck);
                ((ij) this.d).f23237k.factcheck = tL_factCheck;
                return;
            case 2:
                Utilities.d.c(new em((r8) this.f21945b, (String) this.f21946c, (String) this.d, (di.i6) obj, 8));
                return;
            case 3:
                String str = (String) this.f21945b;
                org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) this.f21946c;
                String str2 = (String) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null) {
                    ArrayList j3 = i6.j(str, null);
                    for (int i7 = 0; i7 < j3.size(); i7++) {
                        ((g6) j3.get(i7)).f22599c = i6.c(((g6) j3.get(i7)).f22599c.toString());
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 < tL_messages_stickerSet.documents.size()) {
                            document = tL_messages_stickerSet.documents.get(i10);
                            int size = j3.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj2 = j3.get(i11);
                                i11++;
                                g6 g6Var = (g6) obj2;
                                for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size(); i12++) {
                                    if (!tL_messages_stickerSet.packs.get(i12).documents.contains(Long.valueOf(document.f26958id)) || !TextUtils.equals(i6.c(tL_messages_stickerSet.packs.get(i12).emoticon), g6Var.f22599c)) {
                                    }
                                }
                            }
                        } else {
                            document = null;
                        }
                        i10++;
                    }
                    if (document != null) {
                        l9Var.p(hc.b(document), str2, t5.f(document, org.telegram.ui.ActionBar.k6.f28013m6, 0.2f, null), document);
                        l9Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f21945b;
                ArrayList[] arrayListArr = (ArrayList[]) this.f21946c;
                mh mhVar = (mh) this.d;
                ArrayList arrayList = (ArrayList) obj;
                if (!zArr[0]) {
                    arrayListArr[0] = arrayList;
                    mhVar.run();
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f21946c;
                wl wlVar = (wl) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!((boolean[]) this.f21945b)[0]) {
                    if (userFull != null) {
                        botInfoArr[0] = userFull.bot_info;
                    }
                    g0.h3(wlVar);
                    return;
                }
                return;
        }
    }
}
