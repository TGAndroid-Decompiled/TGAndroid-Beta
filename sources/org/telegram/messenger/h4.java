package org.telegram.messenger;

import java.util.function.ToIntFunction;
import org.telegram.messenger.GiftAuctionController;
public final class h4 implements ToIntFunction {
    public final int f15334a;

    public h4(int i10) {
        this.f15334a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f15334a) {
            case 0:
                return GiftAuctionController.d((GiftAuctionController.Auction) obj);
            default:
                return Integer.parseInt((String) obj);
        }
    }
}
