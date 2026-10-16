package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i4 implements Utilities.Callback2 {
    public final int f17159a;
    public final Utilities.Callback f17160b;

    public i4(int i10, Utilities.Callback callback) {
        this.f17159a = i10;
        this.f17160b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17159a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f17160b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$250(this.f17160b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
