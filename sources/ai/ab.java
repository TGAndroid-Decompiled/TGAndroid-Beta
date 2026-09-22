package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ab implements Utilities.Callback {
    public final int f530a;
    public final db f531b;

    public ab(db dbVar, int i10) {
        this.f530a = i10;
        this.f531b = dbVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f530a) {
            case 0:
                db.c(this.f531b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                db.b(this.f531b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
