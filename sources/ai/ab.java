package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ab implements Utilities.Callback {
    public final int f533a;
    public final db f534b;

    public ab(db dbVar, int i10) {
        this.f533a = i10;
        this.f534b = dbVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f533a) {
            case 0:
                db.c(this.f534b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                db.b(this.f534b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
