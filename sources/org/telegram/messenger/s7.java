package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s7 implements Utilities.Callback2 {
    public final int f19953a;
    public final MediaDataController f19954b;
    public final String f19955c;
    public final Utilities.Callback d;

    public s7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.f19953a = i10;
        this.f19954b = mediaDataController;
        this.f19955c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f19953a) {
            case 0:
                this.f19954b.lambda$getStickerSet$32(this.f19955c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f19954b.lambda$getStickerSet$35(this.f19955c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
