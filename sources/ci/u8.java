package ci;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Utilities.Callback {
    public final int f6062a;
    public final v8 f6063b;

    public u8(v8 v8Var, int i10) {
        this.f6062a = i10;
        this.f6063b = v8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6062a) {
            case 0:
                v8.c(this.f6063b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                v8.b(this.f6063b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
