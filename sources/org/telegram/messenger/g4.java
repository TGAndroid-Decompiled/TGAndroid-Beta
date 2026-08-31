package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g4 implements Utilities.Callback2 {
    public final int f18728a;
    public final Utilities.Callback f18729b;

    public g4(int i10, Utilities.Callback callback) {
        this.f18728a = i10;
        this.f18729b = callback;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f18728a) {
            case 0:
                GiftAuctionController.lambda$requestAuctionUpgrades$5(this.f18729b, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                MediaDataController.lambda$searchStickerSets$249(this.f18729b, (TLRPC.messages_FoundStickerSets) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
