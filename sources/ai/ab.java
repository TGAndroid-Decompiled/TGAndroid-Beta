package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ab implements Utilities.Callback {
    public final int f586a;
    public final db f587b;

    public ab(db dbVar, int i10) {
        this.f586a = i10;
        this.f587b = dbVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f586a) {
            case 0:
                db.c(this.f587b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                db.b(this.f587b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
