package fi;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class z7 implements x10 {
    public final int f12949a;
    public final a8 f12950b;

    public z7(a8 a8Var, int i7) {
        this.f12949a = i7;
        this.f12950b = a8Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f12949a) {
            case 0:
                a8.c(this.f12950b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                a8.b(this.f12950b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
