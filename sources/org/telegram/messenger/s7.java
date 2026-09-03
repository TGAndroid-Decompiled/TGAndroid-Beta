package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s7 implements Utilities.Callback2 {
    public final int f18348a;
    public final MediaDataController f18349b;
    public final String f18350c;
    public final Utilities.Callback d;

    public s7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f18348a = i10;
        this.f18349b = mediaDataController;
        this.f18350c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f18348a) {
            case 0:
                this.f18349b.lambda$getStickerSet$32(this.f18350c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f18349b.lambda$getStickerSet$35(this.f18350c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
