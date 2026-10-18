package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p7 implements Utilities.Callback2 {
    public final int f19250a;
    public final MediaDataController f19251b;
    public final String f19252c;
    public final Utilities.Callback d;

    public p7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f19250a = i10;
        this.f19251b = mediaDataController;
        this.f19252c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f19250a) {
            case 0:
                this.f19251b.lambda$getStickerSet$32(this.f19252c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f19251b.lambda$getStickerSet$35(this.f19252c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
