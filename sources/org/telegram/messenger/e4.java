package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class e4 implements Utilities.Callback2 {
    public final int f16234a;
    public final Utilities.Callback f16235b;

    public e4(int i10, Utilities.Callback callback) {
        this.f16234a = i10;
        this.f16235b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16234a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f16235b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$249(this.f16235b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
