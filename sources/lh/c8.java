package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c8 implements Utilities.Callback {
    public final int f15446a;
    public final d8 f15447b;

    public c8(d8 d8Var, int i10) {
        this.f15446a = i10;
        this.f15447b = d8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15446a) {
            case 0:
                d8.c(this.f15447b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                d8.b(this.f15447b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
