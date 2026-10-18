package org.telegram.messenger;

import java.util.function.ToIntFunction;
import org.telegram.messenger.GiftAuctionController;
public final class g4 implements ToIntFunction {
    public final int f18420a;

    public g4(int i10) {
        this.f18420a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f18420a) {
            case 0:
                return GiftAuctionController.d((GiftAuctionController.Auction) obj);
            default:
                return Integer.parseInt((String) obj);
        }
    }
}
