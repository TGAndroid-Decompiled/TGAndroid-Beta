package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d4 implements Utilities.Callback2 {
    public final int f20046a;
    public final Utilities.Callback f20047b;

    public d4(int i9, Utilities.Callback callback) {
        this.f20046a = i9;
        this.f20047b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20046a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f20047b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$249(this.f20047b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
