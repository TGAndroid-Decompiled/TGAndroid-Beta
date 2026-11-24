package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class gv4 implements jac {
    public final byte a;
    public final qac b;

    public gv4(qac qacVar, byte b) {
        this.a = b;
        this.b = qacVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (stargiftupgradeattributes != null) {
                    qacVar.a(stargiftupgradeattributes.attributes);
                    return;
                } else {
                    qacVar.a(null);
                    return;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets) {
                    qacVar.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    return;
                } else {
                    qacVar.a(new ArrayList());
                    return;
                }
        }
    }
}
