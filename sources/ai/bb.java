package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class bb implements Utilities.Callback {
    public final int f729a;
    public final eb f730b;

    public bb(eb ebVar, int i10) {
        this.f729a = i10;
        this.f730b = ebVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f729a) {
            case 0:
                eb.c(this.f730b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                eb.b(this.f730b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
