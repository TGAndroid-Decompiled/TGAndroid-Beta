package fi;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class c8 implements z10 {
    public final int f11611a;
    public final d8 f11612b;

    public c8(d8 d8Var, int i7) {
        this.f11611a = i7;
        this.f11612b = d8Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f11611a) {
            case 0:
                d8.c(this.f11612b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                d8.b(this.f11612b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
