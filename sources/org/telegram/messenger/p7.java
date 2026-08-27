package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class p7 implements Utilities.Callback2 {

    public final int f21229a;

    public final MediaDataController f21230b;

    public final String f21231c;
    public final Utilities.Callback d;

    public p7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f21229a = i10;
        this.f21230b = mediaDataController;
        this.f21231c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f21229a) {
            case 0:
                this.f21230b.lambda$getStickerSet$32(this.f21231c, this.d, bool, tL_messages_stickerSet);
                break;
            default:
                this.f21230b.lambda$getStickerSet$35(this.f21231c, this.d, bool, tL_messages_stickerSet);
                break;
        }
    }
}
