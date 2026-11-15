package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q9 implements s10 {
    public final int f26063a;
    public final z10 f26064b;

    public q9(z10 z10Var, int i7) {
        this.f26063a = i7;
        this.f26064b = z10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f26063a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                z10 z10Var = this.f26064b;
                if (stargiftupgradeattributes != null) {
                    z10Var.a(stargiftupgradeattributes.attributes);
                    return;
                } else {
                    z10Var.a(null);
                    return;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z10 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                z10 z10Var2 = this.f26064b;
                if (z10) {
                    z10Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    return;
                } else {
                    z10Var2.a(new ArrayList());
                    return;
                }
        }
    }
}
