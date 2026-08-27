package org.telegram.messenger;

import java.util.function.ToIntFunction;

public final class d4 implements ToIntFunction {

    public final int f20018a;

    public d4(int i10) {
        this.f20018a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f20018a) {
            case 0:
                return GiftAuctionController.lambda$updateActiveAuctions$13((GiftAuctionController.Auction) obj);
            default:
                return Integer.parseInt((String) obj);
        }
    }
}
