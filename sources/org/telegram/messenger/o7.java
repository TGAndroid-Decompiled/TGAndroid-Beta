package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o7 implements Utilities.Callback2 {
    public final int f18603a;
    public final MediaDataController f18604b;
    public final String f18605c;
    public final Utilities.Callback d;

    public o7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f18603a = i10;
        this.f18604b = mediaDataController;
        this.f18605c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f18603a) {
            case 0:
                this.f18604b.lambda$getStickerSet$32(this.f18605c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f18604b.lambda$getStickerSet$35(this.f18605c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
