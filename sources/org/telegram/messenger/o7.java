package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o7 implements Utilities.Callback2 {
    public final int f18749a;
    public final MediaDataController f18750b;
    public final String f18751c;
    public final Utilities.Callback d;

    public o7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f18749a = i10;
        this.f18750b = mediaDataController;
        this.f18751c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f18749a) {
            case 0:
                this.f18750b.lambda$getStickerSet$32(this.f18751c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f18750b.lambda$getStickerSet$35(this.f18751c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
