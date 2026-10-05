package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n7 implements Utilities.Callback2 {
    public final int f18636a;
    public final MediaDataController f18637b;
    public final String f18638c;
    public final Utilities.Callback d;

    public n7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f18636a = i10;
        this.f18637b = mediaDataController;
        this.f18638c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f18636a) {
            case 0:
                this.f18637b.lambda$getStickerSet$32(this.f18638c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f18637b.lambda$getStickerSet$35(this.f18638c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
