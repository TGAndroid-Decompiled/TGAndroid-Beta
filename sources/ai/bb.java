package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class bb implements Utilities.Callback {
    public final int f727a;
    public final eb f728b;

    public bb(eb ebVar, int i10) {
        this.f727a = i10;
        this.f728b = ebVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f727a) {
            case 0:
                eb.c(this.f728b, (TLRPC.TL_messages_stickerSet) obj);
                return;
            default:
                eb.b(this.f728b, (TLRPC.TL_messages_stickerSet) obj);
                return;
        }
    }
}
