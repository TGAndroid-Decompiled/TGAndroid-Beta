package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda94 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final TLRPC.TL_messages_stickerSet f$1;
    public final String f$2;
    public final Utilities.Callback f$3;
    public final boolean f$4;
    public final TLRPC.InputStickerSet f$5;

    public MediaDataController$$ExternalSyntheticLambda94(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z, TLRPC.InputStickerSet inputStickerSet, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = tL_messages_stickerSet;
        this.f$2 = str;
        this.f$3 = callback;
        this.f$4 = z;
        this.f$5 = inputStickerSet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.InputStickerSet inputStickerSet = this.f$5;
                this.f$0.lambda$getStickerSet$36(this.f$1, this.f$2, this.f$3, this.f$4, inputStickerSet);
                break;
            default:
                TLRPC.InputStickerSet inputStickerSet2 = this.f$5;
                this.f$0.lambda$getStickerSet$33(this.f$1, this.f$2, this.f$3, this.f$4, inputStickerSet2);
                break;
        }
    }
}
