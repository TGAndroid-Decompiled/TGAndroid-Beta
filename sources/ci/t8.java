package ci;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t8 implements Utilities.Callback {
    public final int f5969a;
    public final u8 f5970b;

    public t8(u8 u8Var, int i10) {
        this.f5969a = i10;
        this.f5970b = u8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5969a) {
            case 0:
                u8.c(this.f5970b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                u8.b(this.f5970b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
