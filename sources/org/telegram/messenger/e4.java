package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class e4 implements Utilities.Callback2 {
    public final int f16193a;
    public final Utilities.Callback f16194b;

    public e4(int i10, Utilities.Callback callback) {
        this.f16193a = i10;
        this.f16194b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16193a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f16194b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$249(this.f16194b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
