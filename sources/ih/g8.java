package ih;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g8 implements Utilities.Callback {
    public final int f11492a;
    public final h8 f11493b;

    public g8(h8 h8Var, int i9) {
        this.f11492a = i9;
        this.f11493b = h8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11492a) {
            case 0:
                h8.c(this.f11493b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                h8.b(this.f11493b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
