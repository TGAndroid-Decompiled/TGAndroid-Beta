package org.telegram.messenger;

import java.util.function.ToIntFunction;
import org.telegram.messenger.GiftAuctionController;
public final class d4 implements ToIntFunction {
    public final int f19995a;

    public d4(int i10) {
        this.f19995a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f19995a) {
            case 0:
                return GiftAuctionController.d((GiftAuctionController.Auction) obj);
            default:
                return Integer.parseInt((String) obj);
        }
    }
}
