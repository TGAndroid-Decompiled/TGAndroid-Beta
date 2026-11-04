package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class l9 implements n10 {
    public final int f23958a;
    public final u10 f23959b;

    public l9(u10 u10Var, int i3) {
        this.f23958a = i3;
        this.f23959b = u10Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f23958a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                u10 u10Var = this.f23959b;
                if (stargiftupgradeattributes != null) {
                    u10Var.a(stargiftupgradeattributes.attributes);
                    return;
                } else {
                    u10Var.a(null);
                    return;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z10 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                u10 u10Var2 = this.f23959b;
                if (z10) {
                    u10Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    return;
                } else {
                    u10Var2.a(new ArrayList());
                    return;
                }
        }
    }
}
