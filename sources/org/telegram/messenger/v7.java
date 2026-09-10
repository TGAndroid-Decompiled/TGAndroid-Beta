package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v7 implements Utilities.Callback2 {
    public final int f16568a;
    public final MediaDataController f16569b;
    public final String f16570c;
    public final Utilities.Callback d;

    public v7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f16568a = i10;
        this.f16569b = mediaDataController;
        this.f16570c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f16568a) {
            case 0:
                this.f16569b.lambda$getStickerSet$32(this.f16570c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f16569b.lambda$getStickerSet$35(this.f16570c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
