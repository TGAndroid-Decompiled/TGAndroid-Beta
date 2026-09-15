package org.telegram.messenger;

import java.util.function.ToIntFunction;
import org.telegram.messenger.GiftAuctionController;
public final class c4 implements ToIntFunction {
    public final int f15807a;

    public c4(int i10) {
        this.f15807a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f15807a) {
            case 0:
                return GiftAuctionController.d((GiftAuctionController.Auction) obj);
            default:
                return Integer.parseInt((String) obj);
        }
    }
}
