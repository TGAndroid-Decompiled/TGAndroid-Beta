package fi;

import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class z7 implements w10 {
    public final int f12914a;
    public final a8 f12915b;

    public z7(a8 a8Var, int i7) {
        this.f12914a = i7;
        this.f12915b = a8Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f12914a) {
            case 0:
                a8.c(this.f12915b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                a8.b(this.f12915b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
