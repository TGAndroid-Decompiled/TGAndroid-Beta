package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t9 implements k20 {
    public final int f18234a;
    public final r20 f18235b;

    public t9(r20 r20Var, int i10) {
        this.f18234a = i10;
        this.f18235b = r20Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f18234a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                r20 r20Var = this.f18235b;
                if (stargiftupgradeattributes != null) {
                    r20Var.a(stargiftupgradeattributes.attributes);
                    return;
                } else {
                    r20Var.a(null);
                    return;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z10 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                r20 r20Var2 = this.f18235b;
                if (z10) {
                    r20Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    return;
                } else {
                    r20Var2.a(new ArrayList());
                    return;
                }
        }
    }
}
