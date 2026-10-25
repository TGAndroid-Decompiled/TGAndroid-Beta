package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v7 implements Utilities.Callback2 {
    public final int f21491a;
    public final MediaDataController f21492b;
    public final String f21493c;
    public final Utilities.Callback d;

    public v7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f21491a = i10;
        this.f21492b = mediaDataController;
        this.f21493c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f21491a) {
            case 0:
                this.f21492b.lambda$getStickerSet$32(this.f21493c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f21492b.lambda$getStickerSet$35(this.f21493c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
