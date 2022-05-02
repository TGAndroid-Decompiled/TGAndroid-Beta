package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;

public final class MessagesController$$ExternalSyntheticLambda226 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda226 INSTANCE = new MessagesController$$ExternalSyntheticLambda226();

    private MessagesController$$ExternalSyntheticLambda226() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processChannelsUpdatesQueue$258;
        lambda$processChannelsUpdatesQueue$258 = MessagesController.lambda$processChannelsUpdatesQueue$258((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processChannelsUpdatesQueue$258;
    }
}
