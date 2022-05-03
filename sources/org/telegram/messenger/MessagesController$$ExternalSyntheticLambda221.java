package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;

public final class MessagesController$$ExternalSyntheticLambda221 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda221 INSTANCE = new MessagesController$$ExternalSyntheticLambda221();

    private MessagesController$$ExternalSyntheticLambda221() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processChannelsUpdatesQueue$251;
        lambda$processChannelsUpdatesQueue$251 = MessagesController.lambda$processChannelsUpdatesQueue$251((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processChannelsUpdatesQueue$251;
    }
}
