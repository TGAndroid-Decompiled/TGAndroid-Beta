package org.telegram.messenger;

import java.util.function.ToIntFunction;
import org.telegram.messenger.GiftAuctionController;
public final class f4 implements ToIntFunction {
    public final int f18344a;

    public f4(int i10) {
        this.f18344a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f18344a) {
            case 0:
                return GiftAuctionController.d((GiftAuctionController.Auction) obj);
            default:
                return Integer.parseInt((String) obj);
        }
    }
}
