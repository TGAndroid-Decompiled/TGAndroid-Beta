package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda43 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final String f$1;
    public final Utilities.Callback f$2;

    public MediaDataController$$ExternalSyntheticLambda43(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = str;
        this.f$2 = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getStickerSet$35(this.f$1, this.f$2, bool, tL_messages_stickerSet);
                break;
            default:
                this.f$0.lambda$getStickerSet$32(this.f$1, this.f$2, bool, tL_messages_stickerSet);
                break;
        }
    }
}
