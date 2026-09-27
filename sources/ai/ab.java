package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ab implements Utilities.Callback {
    public final int f540a;
    public final db f541b;

    public ab(db dbVar, int i10) {
        this.f540a = i10;
        this.f541b = dbVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f540a) {
            case 0:
                db.c(this.f541b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                db.b(this.f541b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
