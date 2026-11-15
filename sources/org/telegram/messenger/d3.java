package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class d3 implements z10 {
    public final int f23027a;
    public final Object f23028b;
    public final Object f23029c;
    public final Object d;

    public d3(Object obj, Object obj2, Object obj3, int i7) {
        this.f23027a = i7;
        this.f23028b = obj;
        this.f23029c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        TLRPC.Document document;
        switch (this.f23027a) {
            case 0:
                e3 e3Var = (e3) this.f23028b;
                z10 z10Var = (z10) this.d;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj;
                if (((TL_stories.TL_premium_boostsStatus) this.f23029c).next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e3Var.f23264m = z10;
                e3Var.a(tL_premium_myBoosts);
                z10Var.a(e3Var);
                return;
            case 1:
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) obj;
                ((x6) this.f23028b).f27468b.put(((w6) this.f23029c).f27305b, tL_factCheck);
                ((gj) this.d).f23819k.factcheck = tL_factCheck;
                return;
            case 2:
                Utilities.d.c(new bm((r8) this.f23028b, (String) this.f23029c, (String) this.d, (fi.b6) obj, 8));
                return;
            case 3:
                String str = (String) this.f23028b;
                org.telegram.ui.Components.i9 i9Var = (org.telegram.ui.Components.i9) this.f23029c;
                String str2 = (String) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null) {
                    ArrayList j3 = j6.j(str, null);
                    for (int i7 = 0; i7 < j3.size(); i7++) {
                        ((h6) j3.get(i7)).f24062c = j6.c(((h6) j3.get(i7)).f24062c.toString());
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
                                h6 h6Var = (h6) obj2;
                                for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size(); i12++) {
                                    if (!tL_messages_stickerSet.packs.get(i12).documents.contains(Long.valueOf(document.f28057id)) || !TextUtils.equals(j6.c(tL_messages_stickerSet.packs.get(i12).emoticon), h6Var.f24062c)) {
                                    }
                                }
                            }
                        } else {
                            document = null;
                        }
                        i10++;
                    }
                    if (document != null) {
                        i9Var.p(gc.b(document), str2, t5.f(document, org.telegram.ui.ActionBar.j6.f29014m6, 0.2f, null), document);
                        i9Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f23028b;
                ArrayList[] arrayListArr = (ArrayList[]) this.f23029c;
                kh khVar = (kh) this.d;
                ArrayList arrayList = (ArrayList) obj;
                if (!zArr[0]) {
                    arrayListArr[0] = arrayList;
                    khVar.run();
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f23029c;
                tl tlVar = (tl) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!((boolean[]) this.f23028b)[0]) {
                    if (userFull != null) {
                        botInfoArr[0] = userFull.bot_info;
                    }
                    g0.h3(tlVar);
                    return;
                }
                return;
        }
    }
}
