package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r7 implements Utilities.Callback2 {
    public final int f21411a;
    public final MediaDataController f21412b;
    public final String f21413c;
    public final Utilities.Callback d;

    public r7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f21411a = i10;
        this.f21412b = mediaDataController;
        this.f21413c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f21411a) {
            case 0:
                this.f21412b.lambda$getStickerSet$32(this.f21413c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f21412b.lambda$getStickerSet$35(this.f21413c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
