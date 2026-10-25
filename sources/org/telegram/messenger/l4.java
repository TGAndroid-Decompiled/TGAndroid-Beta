package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class l4 implements Utilities.Callback2 {
    public final int f20561a;
    public final Utilities.Callback f20562b;

    public l4(int i10, Utilities.Callback callback) {
        this.f20561a = i10;
        this.f20562b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20561a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f20562b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$250(this.f20562b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
