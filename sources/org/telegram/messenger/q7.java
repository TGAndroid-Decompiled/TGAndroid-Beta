package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q7 implements Utilities.Callback2 {
    public final int f19331a;
    public final MediaDataController f19332b;
    public final String f19333c;
    public final Utilities.Callback d;

    public q7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f19331a = i10;
        this.f19332b = mediaDataController;
        this.f19333c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f19331a) {
            case 0:
                this.f19332b.lambda$getStickerSet$32(this.f19333c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f19332b.lambda$getStickerSet$35(this.f19333c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
