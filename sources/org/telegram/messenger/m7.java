package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m7 implements Utilities.Callback2 {
    public final int f20944a;
    public final MediaDataController f20945b;
    public final String f20946c;
    public final Utilities.Callback d;

    public m7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i9) {
        this.f20944a = i9;
        this.f20945b = mediaDataController;
        this.f20946c = str;
        this.d = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.f20944a) {
            case 0:
                this.f20945b.lambda$getStickerSet$32(this.f20946c, this.d, bool, tL_messages_stickerSet);
                return;
            default:
                this.f20945b.lambda$getStickerSet$35(this.f20946c, this.d, bool, tL_messages_stickerSet);
                return;
        }
    }
}
