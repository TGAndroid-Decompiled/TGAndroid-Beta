package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g4 implements Utilities.Callback2 {
    public final int f17275a;
    public final Utilities.Callback f17276b;

    public g4(int i10, Utilities.Callback callback) {
        this.f17275a = i10;
        this.f17276b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17275a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f17276b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$249(this.f17276b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
