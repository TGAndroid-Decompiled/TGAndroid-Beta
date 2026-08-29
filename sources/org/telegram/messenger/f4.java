package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f4 implements Utilities.Callback2 {
    public final int f20201a;
    public final Utilities.Callback f20202b;

    public f4(int i10, Utilities.Callback callback) {
        this.f20201a = i10;
        this.f20202b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f20201a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f20202b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$249(this.f20202b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
