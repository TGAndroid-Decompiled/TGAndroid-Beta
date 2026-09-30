package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n7 implements Utilities.Callback2 {
    public final int f17090a;
    public final MediaDataController f17091b;
    public final String f17092c;
    public final Utilities.Callback d;

    public n7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f17090a = i10;
        this.f17091b = mediaDataController;
        this.f17092c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f17090a) {
            case 0:
                this.f17091b.lambda$getStickerSet$32(this.f17092c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f17091b.lambda$getStickerSet$35(this.f17092c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
