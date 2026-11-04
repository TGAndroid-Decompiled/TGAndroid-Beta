package ei;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class j8 implements u10 {
    public final int f10555a;
    public final k8 f10556b;

    public j8(k8 k8Var, int i3) {
        this.f10555a = i3;
        this.f10556b = k8Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f10555a) {
            case 0:
                k8.c(this.f10556b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                k8.b(this.f10556b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
