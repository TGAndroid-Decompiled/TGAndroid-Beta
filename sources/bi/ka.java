package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ka implements Utilities.Callback {
    public final int f3257a;
    public final na f3258b;

    public ka(na naVar, int i10) {
        this.f3257a = i10;
        this.f3258b = naVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f3257a) {
            case 0:
                na.c(this.f3258b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                na.b(this.f3258b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
