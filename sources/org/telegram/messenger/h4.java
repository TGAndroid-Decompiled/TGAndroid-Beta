package org.telegram.messenger;

import java.util.function.ToIntFunction;
import org.telegram.messenger.GiftAuctionController;
public final class h4 implements ToIntFunction {
    public final int f18509a;

    public h4(int i10) {
        this.f18509a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f18509a) {
            case 0:
                return GiftAuctionController.d((GiftAuctionController.Auction) obj);
            default:
                return Integer.parseInt((String) obj);
        }
    }
}
