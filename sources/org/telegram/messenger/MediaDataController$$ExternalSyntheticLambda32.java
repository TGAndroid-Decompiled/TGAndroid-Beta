package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class MediaDataController$$ExternalSyntheticLambda32 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Utilities.Callback f$0;

    public MediaDataController$$ExternalSyntheticLambda32(int i, Utilities.Callback callback) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                MediaDataController.lambda$searchStickerSets$249(this.f$0, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f$0, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
