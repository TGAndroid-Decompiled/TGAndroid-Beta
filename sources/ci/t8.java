package ci;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t8 implements Utilities.Callback {
    public final int f5963a;
    public final u8 f5964b;

    public t8(u8 u8Var, int i10) {
        this.f5963a = i10;
        this.f5964b = u8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5963a) {
            case 0:
                u8.c(this.f5964b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                u8.b(this.f5964b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
