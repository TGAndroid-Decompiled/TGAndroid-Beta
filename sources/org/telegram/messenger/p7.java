package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p7 implements Utilities.Callback2 {
    public final int f17014a;
    public final MediaDataController f17015b;
    public final String f17016c;
    public final Utilities.Callback d;

    public p7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f17014a = i10;
        this.f17015b = mediaDataController;
        this.f17016c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f17014a) {
            case 0:
                this.f17015b.lambda$getStickerSet$32(this.f17016c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f17015b.lambda$getStickerSet$35(this.f17016c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
