package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q9 implements r10 {
    public final int f26383a;
    public final y10 f26384b;

    public q9(y10 y10Var, int i7) {
        this.f26383a = i7;
        this.f26384b = y10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f26383a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                y10 y10Var = this.f26384b;
                if (stargiftupgradeattributes != null) {
                    y10Var.a(stargiftupgradeattributes.attributes);
                    return;
                } else {
                    y10Var.a(null);
                    return;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z10 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                y10 y10Var2 = this.f26384b;
                if (z10) {
                    y10Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    return;
                } else {
                    y10Var2.a(new ArrayList());
                    return;
                }
        }
    }
}
