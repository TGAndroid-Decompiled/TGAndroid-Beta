package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p9 implements p10 {
    public final int f26304a;
    public final w10 f26305b;

    public p9(w10 w10Var, int i7) {
        this.f26304a = i7;
        this.f26305b = w10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f26304a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                w10 w10Var = this.f26305b;
                if (stargiftupgradeattributes != null) {
                    w10Var.a(stargiftupgradeattributes.attributes);
                    return;
                } else {
                    w10Var.a(null);
                    return;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z10 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                w10 w10Var2 = this.f26305b;
                if (z10) {
                    w10Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    return;
                } else {
                    w10Var2.a(new ArrayList());
                    return;
                }
        }
    }
}
