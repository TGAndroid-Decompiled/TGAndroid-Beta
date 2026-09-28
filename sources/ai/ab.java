package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ab implements Utilities.Callback {
    public final int f537a;
    public final db f538b;

    public ab(db dbVar, int i10) {
        this.f537a = i10;
        this.f538b = dbVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f537a) {
            case 0:
                db.c(this.f538b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                db.b(this.f538b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
