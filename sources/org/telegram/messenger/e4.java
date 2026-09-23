package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class e4 implements Utilities.Callback2 {
    public final int f15994a;
    public final Utilities.Callback f15995b;

    public e4(int i10, Utilities.Callback callback) {
        this.f15994a = i10;
        this.f15995b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f15994a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f15995b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$249(this.f15995b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
