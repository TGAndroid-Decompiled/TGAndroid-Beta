package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class g3 implements r20 {
    public final int f15850a;
    public final Object f15851b;
    public final Object f15852c;
    public final Object d;

    public g3(Object obj, Object obj2, Object obj3, int i10) {
        this.f15850a = i10;
        this.f15851b = obj;
        this.f15852c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        TLRPC.Document document;
        switch (this.f15850a) {
            case 0:
                h3 h3Var = (h3) this.f15851b;
                r20 r20Var = (r20) this.d;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj;
                if (((TL_stories.TL_premium_boostsStatus) this.f15852c).next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h3Var.f16014m = z10;
                h3Var.a(tL_premium_myBoosts);
                r20Var.a(h3Var);
                return;
            case 1:
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) obj;
                ((a7) this.f15851b).f14576b.put(((z6) this.f15852c).f19670b, tL_factCheck);
                ((kj) this.d).f16690k.factcheck = tL_factCheck;
                return;
            case 2:
                Utilities.d.c(new vl((w8) this.f15851b, (String) this.f15852c, (String) this.d, (th.p4) obj, 8));
                return;
            case 3:
                String str = (String) this.f15851b;
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) this.f15852c;
                String str2 = (String) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null) {
                    ArrayList j10 = k6.j(str, null);
                    for (int i10 = 0; i10 < j10.size(); i10++) {
                        ((i6) j10.get(i10)).f16235c = k6.c(((i6) j10.get(i10)).f16235c.toString());
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < tL_messages_stickerSet.documents.size()) {
                            document = tL_messages_stickerSet.documents.get(i11);
                            int size = j10.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj2 = j10.get(i12);
                                i12++;
                                i6 i6Var = (i6) obj2;
                                for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size(); i13++) {
                                    if (!tL_messages_stickerSet.packs.get(i13).documents.contains(Long.valueOf(document.f19800id)) || !TextUtils.equals(k6.c(tL_messages_stickerSet.packs.get(i13).emoticon), i6Var.f16235c)) {
                                    }
                                }
                            }
                        } else {
                            document = null;
                        }
                        i11++;
                    }
                    if (document != null) {
                        g9Var.p(jc.b(document), str2, v5.f(document, org.telegram.ui.ActionBar.t6.f21096m6, 0.2f, null), document);
                        g9Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f15851b;
                ArrayList[] arrayListArr = (ArrayList[]) this.f15852c;
                lh lhVar = (lh) this.d;
                ArrayList arrayList = (ArrayList) obj;
                if (!zArr[0]) {
                    arrayListArr[0] = arrayList;
                    lhVar.run();
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f15852c;
                bm bmVar = (bm) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!((boolean[]) this.f15851b)[0]) {
                    if (userFull != null) {
                        botInfoArr[0] = userFull.bot_info;
                    }
                    i0.g3(bmVar);
                    return;
                }
                return;
        }
    }
}
