package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n7 implements Utilities.Callback2 {
    public final int f18641a;
    public final MediaDataController f18642b;
    public final String f18643c;
    public final Utilities.Callback d;

    public n7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f18641a = i10;
        this.f18642b = mediaDataController;
        this.f18643c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f18641a) {
            case 0:
                this.f18642b.lambda$getStickerSet$32(this.f18643c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f18642b.lambda$getStickerSet$35(this.f18643c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
