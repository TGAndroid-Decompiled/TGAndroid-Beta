package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ha implements Utilities.Callback {
    public final int f3075a;
    public final ja f3076b;

    public ha(ja jaVar, int i10) {
        this.f3075a = i10;
        this.f3076b = jaVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f3075a) {
            case 0:
                ja.c(this.f3076b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                ja.b(this.f3076b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
