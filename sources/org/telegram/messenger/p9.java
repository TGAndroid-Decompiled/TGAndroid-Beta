package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p9 implements q10 {
    public final int f26212a;
    public final x10 f26213b;

    public p9(x10 x10Var, int i7) {
        this.f26212a = i7;
        this.f26213b = x10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f26212a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                x10 x10Var = this.f26213b;
                if (stargiftupgradeattributes != null) {
                    x10Var.a(stargiftupgradeattributes.attributes);
                    return;
                } else {
                    x10Var.a(null);
                    return;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z10 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                x10 x10Var2 = this.f26213b;
                if (z10) {
                    x10Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    return;
                } else {
                    x10Var2.a(new ArrayList());
                    return;
                }
        }
    }
}
