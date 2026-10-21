package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r7 implements Utilities.Callback2 {
    public final int f19420a;
    public final MediaDataController f19421b;
    public final String f19422c;
    public final Utilities.Callback d;

    public r7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f19420a = i10;
        this.f19421b = mediaDataController;
        this.f19422c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f19420a) {
            case 0:
                this.f19421b.lambda$getStickerSet$32(this.f19422c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f19421b.lambda$getStickerSet$35(this.f19422c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
