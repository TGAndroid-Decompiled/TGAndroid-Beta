package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jv4 implements icc {
    public final byte a;
    public final pcc b;

    public jv4(pcc pccVar, byte b) {
        this.a = b;
        this.b = pccVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (stargiftupgradeattributes != null) {
                    pccVar.a(stargiftupgradeattributes.attributes);
                    return;
                } else {
                    pccVar.a(null);
                    return;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets) {
                    pccVar.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    return;
                } else {
                    pccVar.a(new ArrayList());
                    return;
                }
        }
    }
}
