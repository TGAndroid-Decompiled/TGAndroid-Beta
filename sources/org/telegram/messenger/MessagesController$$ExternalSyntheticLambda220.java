package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;

public final class MessagesController$$ExternalSyntheticLambda220 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda220 INSTANCE = new MessagesController$$ExternalSyntheticLambda220();

    private MessagesController$$ExternalSyntheticLambda220() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processUpdatesQueue$254;
        lambda$processUpdatesQueue$254 = MessagesController.lambda$processUpdatesQueue$254((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processUpdatesQueue$254;
    }
}
