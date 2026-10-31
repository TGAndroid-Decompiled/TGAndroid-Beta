package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s9 implements j20 {
    public final int f17883a;
    public final q20 f17884b;

    public s9(q20 q20Var, int i10) {
        this.f17883a = i10;
        this.f17884b = q20Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f17883a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                q20 q20Var = this.f17884b;
                if (stargiftupgradeattributes != null) {
                    q20Var.a(stargiftupgradeattributes.attributes);
                    return;
                } else {
                    q20Var.a(null);
                    return;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z10 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                q20 q20Var2 = this.f17884b;
                if (z10) {
                    q20Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    return;
                } else {
                    q20Var2.a(new ArrayList());
                    return;
                }
        }
    }
}
