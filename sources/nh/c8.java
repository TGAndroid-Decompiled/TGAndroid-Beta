package nh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c8 implements Utilities.Callback {
    public final int f15170a;
    public final d8 f15171b;

    public c8(d8 d8Var, int i10) {
        this.f15170a = i10;
        this.f15171b = d8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15170a) {
            case 0:
                d8.c(this.f15171b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                d8.b(this.f15171b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
