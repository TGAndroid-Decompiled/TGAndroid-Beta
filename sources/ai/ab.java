package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ab implements Utilities.Callback {
    public final int f528a;
    public final db f529b;

    public ab(db dbVar, int i10) {
        this.f528a = i10;
        this.f529b = dbVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f528a) {
            case 0:
                db.c(this.f529b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                db.b(this.f529b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
