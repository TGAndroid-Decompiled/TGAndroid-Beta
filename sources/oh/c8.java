package oh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c8 implements Utilities.Callback {
    public final int f16951a;
    public final d8 f16952b;

    public c8(d8 d8Var, int i10) {
        this.f16951a = i10;
        this.f16952b = d8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16951a) {
            case 0:
                d8.c(this.f16952b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                d8.b(this.f16952b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
