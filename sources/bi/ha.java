package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ha implements Utilities.Callback {
    public final int f3102a;
    public final ja f3103b;

    public ha(ja jaVar, int i10) {
        this.f3102a = i10;
        this.f3103b = jaVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f3102a) {
            case 0:
                ja.c(this.f3103b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                ja.b(this.f3103b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
