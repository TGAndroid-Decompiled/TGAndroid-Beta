package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda8 implements Utilities.Callback {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final TLRPC.StickerSet f$1;

    public MediaDataController$$ExternalSyntheticLambda8(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = stickerSet;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$toggleStickerSetInternal$112(this.f$1, (ArrayList) obj);
                break;
            default:
                this.f$0.lambda$toggleStickerSetInternal$115(this.f$1, (ArrayList) obj);
                break;
        }
    }
}
