package org.telegram.messenger;

import java.util.function.ToIntFunction;
import org.telegram.messenger.GiftAuctionController;
public final class k4 implements ToIntFunction {
    public final int f20480a;

    public k4(int i10) {
        this.f20480a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f20480a) {
            case 0:
                return GiftAuctionController.d((GiftAuctionController.Auction) obj);
            default:
                return Integer.parseInt((String) obj);
        }
    }
}
