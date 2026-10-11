package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class f4 implements Utilities.Callback2 {
    public final int f17807a;
    public final Utilities.Callback f17808b;

    public f4(int i10, Utilities.Callback callback) {
        this.f17807a = i10;
        this.f17808b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17807a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f17808b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$250(this.f17808b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
