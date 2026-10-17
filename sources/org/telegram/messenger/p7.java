package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p7 implements Utilities.Callback2 {
    public final int f19248a;
    public final MediaDataController f19249b;
    public final String f19250c;
    public final Utilities.Callback d;

    public p7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f19248a = i10;
        this.f19249b = mediaDataController;
        this.f19250c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f19248a) {
            case 0:
                this.f19249b.lambda$getStickerSet$32(this.f19250c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f19249b.lambda$getStickerSet$35(this.f19250c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
