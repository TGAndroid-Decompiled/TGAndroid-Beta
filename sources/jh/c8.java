package jh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class c8 implements Utilities.Callback {

    public final int f13167a;

    public final d8 f13168b;

    public c8(d8 d8Var, int i10) {
        this.f13167a = i10;
        this.f13168b = d8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f13167a) {
            case 0:
                d8.c(this.f13168b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                d8.b(this.f13168b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
