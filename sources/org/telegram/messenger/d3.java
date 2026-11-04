package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class d3 implements u10 {
    public final int f22135a;
    public final Object f22136b;
    public final Object f22137c;
    public final Object d;

    public d3(Object obj, Object obj2, Object obj3, int i3) {
        this.f22135a = i3;
        this.f22136b = obj;
        this.f22137c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        TLRPC.Document document;
        switch (this.f22135a) {
            case 0:
                e3 e3Var = (e3) this.f22136b;
                u10 u10Var = (u10) this.d;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj;
                if (((TL_stories.TL_premium_boostsStatus) this.f22137c).next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e3Var.f22309m = z10;
                e3Var.a(tL_premium_myBoosts);
                u10Var.a(e3Var);
                return;
            case 1:
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) obj;
                ((x6) this.f22136b).f26348b.put(((w6) this.f22137c).f26165b, tL_factCheck);
                ((zi) this.d).f26868k.factcheck = tL_factCheck;
                return;
            case 2:
                Utilities.d.c(new ul((r8) this.f22136b, (String) this.f22137c, (String) this.d, (ei.j6) obj, 8));
                return;
            case 3:
                String str = (String) this.f22136b;
                org.telegram.ui.Components.k9 k9Var = (org.telegram.ui.Components.k9) this.f22137c;
                String str2 = (String) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null) {
                    ArrayList j10 = i6.j(str, null);
                    for (int i3 = 0; i3 < j10.size(); i3++) {
                        ((g6) j10.get(i3)).f22669c = i6.c(((g6) j10.get(i3)).f22669c.toString());
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 < tL_messages_stickerSet.documents.size()) {
                            document = tL_messages_stickerSet.documents.get(i10);
                            int size = j10.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj2 = j10.get(i11);
                                i11++;
                                g6 g6Var = (g6) obj2;
                                for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size(); i12++) {
                                    if (!tL_messages_stickerSet.packs.get(i12).documents.contains(Long.valueOf(document.f27007id)) || !TextUtils.equals(i6.c(tL_messages_stickerSet.packs.get(i12).emoticon), g6Var.f22669c)) {
                                    }
                                }
                            }
                        } else {
                            document = null;
                        }
                        i10++;
                    }
                    if (document != null) {
                        k9Var.p(ac.b(document), str2, t5.f(document, org.telegram.ui.ActionBar.k6.f28043m6, 0.2f, null), document);
                        k9Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f22136b;
                ArrayList[] arrayListArr = (ArrayList[]) this.f22137c;
                dh dhVar = (dh) this.d;
                ArrayList arrayList = (ArrayList) obj;
                if (!zArr[0]) {
                    arrayListArr[0] = arrayList;
                    dhVar.run();
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f22137c;
                ml mlVar = (ml) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!((boolean[]) this.f22136b)[0]) {
                    if (userFull != null) {
                        botInfoArr[0] = userFull.bot_info;
                    }
                    g0.h3(mlVar);
                    return;
                }
                return;
        }
    }
}
