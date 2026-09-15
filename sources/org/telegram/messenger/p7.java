package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p7 implements Utilities.Callback2 {
    public final int f17022a;
    public final MediaDataController f17023b;
    public final String f17024c;
    public final Utilities.Callback d;

    public p7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f17022a = i10;
        this.f17023b = mediaDataController;
        this.f17024c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f17022a) {
            case 0:
                this.f17023b.lambda$getStickerSet$32(this.f17024c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f17023b.lambda$getStickerSet$35(this.f17024c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
