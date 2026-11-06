package di;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class j8 implements c20 {
    public final int f9275a;
    public final k8 f9276b;

    public j8(k8 k8Var, int i7) {
        this.f9275a = i7;
        this.f9276b = k8Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f9275a) {
            case 0:
                k8.c(this.f9276b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                k8.b(this.f9276b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
