package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fea extends sv9 {
    @Override
    public final boolean d(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.Chat) && !xc2.B((TLRPC.Chat) tLObject)) {
            return false;
        }
        return true;
    }
}
