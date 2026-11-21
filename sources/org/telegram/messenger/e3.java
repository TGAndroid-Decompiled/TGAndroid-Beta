package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class e3 implements x10 {
    public final int f23687a;
    public final Object f23688b;
    public final Object f23689c;
    public final Object d;

    public e3(Object obj, Object obj2, Object obj3, int i7) {
        this.f23687a = i7;
        this.f23688b = obj;
        this.f23689c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        TLRPC.Document document;
        switch (this.f23687a) {
            case 0:
                g3 g3Var = (g3) this.f23688b;
                x10 x10Var = (x10) this.d;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj;
                if (((TL_stories.TL_premium_boostsStatus) this.f23689c).next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g3Var.f24190m = z10;
                g3Var.a(tL_premium_myBoosts);
                x10Var.a(g3Var);
                return;
            case 1:
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) obj;
                ((x6) this.f23688b).f27850b.put(((w6) this.f23689c).f27674b, tL_factCheck);
                ((fj) this.d).f23993k.factcheck = tL_factCheck;
                return;
            case 2:
                Utilities.d.c(new tl((r8) this.f23688b, (String) this.f23689c, (String) this.d, (fi.z5) obj, 8));
                return;
            case 3:
                String str = (String) this.f23688b;
                org.telegram.ui.Components.q9 q9Var = (org.telegram.ui.Components.q9) this.f23689c;
                String str2 = (String) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null) {
                    ArrayList j3 = j6.j(str, null);
                    for (int i7 = 0; i7 < j3.size(); i7++) {
                        ((h6) j3.get(i7)).f24419c = j6.c(((h6) j3.get(i7)).f24419c.toString());
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
                                    if (!tL_messages_stickerSet.packs.get(i12).documents.contains(Long.valueOf(document.f28437id)) || !TextUtils.equals(j6.c(tL_messages_stickerSet.packs.get(i12).emoticon), h6Var.f24419c)) {
                                    }
                                }
                            }
                        } else {
                            document = null;
                        }
                        i10++;
                    }
                    if (document != null) {
                        q9Var.p(fc.b(document), str2, u5.f(document, org.telegram.ui.ActionBar.m6.f29543m6, 0.2f, null), document);
                        q9Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                boolean[] zArr = (boolean[]) this.f23688b;
                ArrayList[] arrayListArr = (ArrayList[]) this.f23689c;
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
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.f23689c;
                ql qlVar = (ql) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!((boolean[]) this.f23688b)[0]) {
                    if (userFull != null) {
                        botInfoArr[0] = userFull.bot_info;
                    }
                    g0.g3(qlVar);
                    return;
                }
                return;
        }
    }
}
