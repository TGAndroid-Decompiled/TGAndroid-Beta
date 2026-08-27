package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class f4 implements Utilities.Callback2 {

    public final int f20217a;

    public final Utilities.Callback f20218b;

    public f4(int i10, Utilities.Callback callback) {
        this.f20217a = i10;
        this.f20218b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20217a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f20218b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                MediaDataController.lambda$searchStickerSets$249(this.f20218b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
