package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f4 implements Utilities.Callback2 {
    public final int f17843a;
    public final Utilities.Callback f17844b;

    public f4(int i10, Utilities.Callback callback) {
        this.f17843a = i10;
        this.f17844b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17843a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f17844b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$250(this.f17844b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
