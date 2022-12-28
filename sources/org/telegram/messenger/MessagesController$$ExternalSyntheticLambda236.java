package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;

public final class MessagesController$$ExternalSyntheticLambda236 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda236 INSTANCE = new MessagesController$$ExternalSyntheticLambda236();

    private MessagesController$$ExternalSyntheticLambda236() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processUpdatesQueue$272;
        lambda$processUpdatesQueue$272 = MessagesController.lambda$processUpdatesQueue$272((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processUpdatesQueue$272;
    }
}
