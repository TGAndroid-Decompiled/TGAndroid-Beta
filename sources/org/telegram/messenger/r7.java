package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r7 implements Utilities.Callback2 {
    public final int f18271a;
    public final MediaDataController f18272b;
    public final String f18273c;
    public final Utilities.Callback d;

    public r7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f18271a = i10;
        this.f18272b = mediaDataController;
        this.f18273c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f18271a) {
            case 0:
                this.f18272b.lambda$getStickerSet$32(this.f18273c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f18272b.lambda$getStickerSet$35(this.f18273c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
