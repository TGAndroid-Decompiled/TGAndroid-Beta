package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p7 implements Utilities.Callback2 {
    public final int f18687a;
    public final MediaDataController f18688b;
    public final String f18689c;
    public final Utilities.Callback d;

    public p7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f18687a = i10;
        this.f18688b = mediaDataController;
        this.f18689c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f18687a) {
            case 0:
                this.f18688b.lambda$getStickerSet$32(this.f18689c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f18688b.lambda$getStickerSet$35(this.f18689c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
