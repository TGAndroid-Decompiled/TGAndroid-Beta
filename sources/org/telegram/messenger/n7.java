package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class n7 implements Utilities.Callback2 {
    public final int f17073a;
    public final MediaDataController f17074b;
    public final String f17075c;
    public final Utilities.Callback d;

    public n7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f17073a = i10;
        this.f17074b = mediaDataController;
        this.f17075c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f17073a) {
            case 0:
                this.f17074b.lambda$getStickerSet$32(this.f17075c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f17074b.lambda$getStickerSet$35(this.f17075c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
