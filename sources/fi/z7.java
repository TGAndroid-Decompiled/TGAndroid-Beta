package fi;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class z7 implements y10 {
    public final int f12915a;
    public final a8 f12916b;

    public z7(a8 a8Var, int i7) {
        this.f12915a = i7;
        this.f12916b = a8Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f12915a) {
            case 0:
                a8.c(this.f12916b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                a8.b(this.f12916b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
