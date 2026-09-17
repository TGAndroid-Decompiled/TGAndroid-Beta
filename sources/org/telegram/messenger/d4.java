package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d4 implements Utilities.Callback2 {
    public final int f17443a;
    public final Utilities.Callback f17444b;

    public d4(int i10, Utilities.Callback callback) {
        this.f17443a = i10;
        this.f17444b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f17443a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f17444b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$249(this.f17444b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
