package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h4 implements Utilities.Callback2 {
    public final int f18499a;
    public final Utilities.Callback f18500b;

    public h4(int i10, Utilities.Callback callback) {
        this.f18499a = i10;
        this.f18500b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18499a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f18500b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$250(this.f18500b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
