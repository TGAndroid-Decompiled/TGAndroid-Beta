package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ft4 implements i8c {
    public final byte a;
    public final p8c b;

    public ft4(p8c p8cVar, byte b) {
        this.a = b;
        this.b = p8cVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (stargiftupgradeattributes != null) {
                    p8cVar.a(stargiftupgradeattributes.attributes);
                    return;
                } else {
                    p8cVar.a(null);
                    return;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets) {
                    p8cVar.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    return;
                } else {
                    p8cVar.a(new ArrayList());
                    return;
                }
        }
    }
}
