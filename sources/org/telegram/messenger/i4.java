package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i4 implements Utilities.Callback2 {
    public final int f17463a;
    public final Utilities.Callback f17464b;

    public i4(int i10, Utilities.Callback callback) {
        this.f17463a = i10;
        this.f17464b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17463a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f17464b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$250(this.f17464b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
