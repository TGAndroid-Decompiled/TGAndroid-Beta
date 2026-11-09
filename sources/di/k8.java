package di;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class k8 implements c20 {
    public final int f9301a;
    public final l8 f9302b;

    public k8(l8 l8Var, int i7) {
        this.f9301a = i7;
        this.f9302b = l8Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f9301a) {
            case 0:
                l8.c(this.f9302b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                l8.b(this.f9302b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
