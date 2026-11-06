package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r9 implements v10 {
    public final int f25250a;
    public final c20 f25251b;

    public r9(c20 c20Var, int i7) {
        this.f25250a = i7;
        this.f25251b = c20Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f25250a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c20 c20Var = this.f25251b;
                if (stargiftupgradeattributes != null) {
                    c20Var.a(stargiftupgradeattributes.attributes);
                    return;
                } else {
                    c20Var.a(null);
                    return;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z9 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                c20 c20Var2 = this.f25251b;
                if (z9) {
                    c20Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    return;
                } else {
                    c20Var2.a(new ArrayList());
                    return;
                }
        }
    }
}
