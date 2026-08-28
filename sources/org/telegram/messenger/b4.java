package org.telegram.messenger;

import java.util.function.ToIntFunction;
import org.telegram.messenger.GiftAuctionController;
public final class b4 implements ToIntFunction {
    public final int f19803a;

    public b4(int i9) {
        this.f19803a = i9;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f19803a) {
            case 0:
                return GiftAuctionController.d((GiftAuctionController.Auction) obj);
            default:
                return Integer.parseInt((String) obj);
        }
    }
}
