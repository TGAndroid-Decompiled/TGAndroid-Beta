package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f4 implements Utilities.Callback2 {
    public final int f17804a;
    public final Utilities.Callback f17805b;

    public f4(int i10, Utilities.Callback callback) {
        this.f17804a = i10;
        this.f17805b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17804a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f17805b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$250(this.f17805b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
