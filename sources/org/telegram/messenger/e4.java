package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class e4 implements Utilities.Callback2 {
    public final int f17724a;
    public final Utilities.Callback f17725b;

    public e4(int i10, Utilities.Callback callback) {
        this.f17724a = i10;
        this.f17725b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17724a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f17725b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$250(this.f17725b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
