package fi;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class z7 implements x10 {
    public final int f12923a;
    public final a8 f12924b;

    public z7(a8 a8Var, int i7) {
        this.f12923a = i7;
        this.f12924b = a8Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f12923a) {
            case 0:
                a8.c(this.f12924b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                a8.b(this.f12924b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
