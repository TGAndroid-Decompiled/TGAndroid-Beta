package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j4 implements Utilities.Callback2 {
    public final int f15499a;
    public final Utilities.Callback f15500b;

    public j4(int i10, Utilities.Callback callback) {
        this.f15499a = i10;
        this.f15500b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f15499a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f15500b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$249(this.f15500b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
