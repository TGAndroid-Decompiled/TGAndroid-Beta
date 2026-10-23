package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t7 implements Utilities.Callback2 {
    public final int f19586a;
    public final MediaDataController f19587b;
    public final String f19588c;
    public final Utilities.Callback d;

    public t7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f19586a = i10;
        this.f19587b = mediaDataController;
        this.f19588c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f19586a) {
            case 0:
                this.f19587b.lambda$getStickerSet$32(this.f19588c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f19587b.lambda$getStickerSet$35(this.f19588c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
