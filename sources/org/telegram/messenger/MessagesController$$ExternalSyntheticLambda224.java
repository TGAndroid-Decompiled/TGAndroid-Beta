package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;

public final class MessagesController$$ExternalSyntheticLambda224 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda224 INSTANCE = new MessagesController$$ExternalSyntheticLambda224();

    private MessagesController$$ExternalSyntheticLambda224() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processUpdatesQueue$260;
        lambda$processUpdatesQueue$260 = MessagesController.lambda$processUpdatesQueue$260((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processUpdatesQueue$260;
    }
}
