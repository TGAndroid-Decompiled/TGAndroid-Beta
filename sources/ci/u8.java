package ci;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Utilities.Callback {
    public final int f6064a;
    public final v8 f6065b;

    public u8(v8 v8Var, int i10) {
        this.f6064a = i10;
        this.f6065b = v8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6064a) {
            case 0:
                v8.c(this.f6065b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                v8.b(this.f6065b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
