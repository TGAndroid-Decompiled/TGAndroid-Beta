package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ka implements Utilities.Callback {
    public final int f3253a;
    public final na f3254b;

    public ka(na naVar, int i10) {
        this.f3253a = i10;
        this.f3254b = naVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f3253a) {
            case 0:
                na.c(this.f3254b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                na.b(this.f3254b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
