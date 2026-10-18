package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q7 implements Utilities.Callback2 {
    public final int f19328a;
    public final MediaDataController f19329b;
    public final String f19330c;
    public final Utilities.Callback d;

    public q7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f19328a = i10;
        this.f19329b = mediaDataController;
        this.f19330c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f19328a) {
            case 0:
                this.f19329b.lambda$getStickerSet$32(this.f19330c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f19329b.lambda$getStickerSet$35(this.f19330c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
