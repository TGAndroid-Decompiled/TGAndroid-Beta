package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class u7 implements Utilities.Callback2 {
    public final int f19727a;
    public final MediaDataController f19728b;
    public final String f19729c;
    public final Utilities.Callback d;

    public u7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f19727a = i10;
        this.f19728b = mediaDataController;
        this.f19729c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f19727a) {
            case 0:
                this.f19728b.lambda$getStickerSet$32(this.f19729c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f19728b.lambda$getStickerSet$35(this.f19729c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
