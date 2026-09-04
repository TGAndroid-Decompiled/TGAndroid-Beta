package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p7 implements Utilities.Callback2 {
    public final int f18660a;
    public final MediaDataController f18661b;
    public final String f18662c;
    public final Utilities.Callback d;

    public p7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f18660a = i10;
        this.f18661b = mediaDataController;
        this.f18662c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f18660a) {
            case 0:
                this.f18661b.lambda$getStickerSet$32(this.f18662c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f18661b.lambda$getStickerSet$35(this.f18662c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
