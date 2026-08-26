package org.telegram.messenger;

import java.util.function.ToIntFunction;

public final class MessagesController$$ExternalSyntheticLambda337 implements ToIntFunction {
    public final int $r8$classId;

    public MessagesController$$ExternalSyntheticLambda337(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return Integer.parseInt((String) obj);
            default:
                return GiftAuctionController.lambda$updateActiveAuctions$13((GiftAuctionController.Auction) obj);
        }
    }
}
