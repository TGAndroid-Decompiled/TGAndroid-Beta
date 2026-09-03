package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g4 implements Utilities.Callback2 {
    public final int f17257a;
    public final Utilities.Callback f17258b;

    public g4(int i10, Utilities.Callback callback) {
        this.f17257a = i10;
        this.f17258b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17257a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f17258b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$249(this.f17258b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
