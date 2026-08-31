package oh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c8 implements Utilities.Callback {
    public final int f16949a;
    public final d8 f16950b;

    public c8(d8 d8Var, int i10) {
        this.f16949a = i10;
        this.f16950b = d8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16949a) {
            case 0:
                d8.c(this.f16950b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                d8.b(this.f16950b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
