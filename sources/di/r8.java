package di;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r8 implements Utilities.Callback {
    public final int f9125a;
    public final t8 f9126b;

    public r8(t8 t8Var, int i10) {
        this.f9125a = i10;
        this.f9126b = t8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9125a) {
            case 0:
                t8.c(this.f9126b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                t8.b(this.f9126b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
