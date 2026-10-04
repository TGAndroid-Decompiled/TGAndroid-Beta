package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n7 implements Utilities.Callback2 {
    public final int f18631a;
    public final MediaDataController f18632b;
    public final String f18633c;
    public final Utilities.Callback d;

    public n7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f18631a = i10;
        this.f18632b = mediaDataController;
        this.f18633c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f18631a) {
            case 0:
                this.f18632b.lambda$getStickerSet$32(this.f18633c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f18632b.lambda$getStickerSet$35(this.f18633c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
