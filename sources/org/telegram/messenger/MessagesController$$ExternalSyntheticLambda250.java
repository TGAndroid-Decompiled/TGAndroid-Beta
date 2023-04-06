package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;
public final class MessagesController$$ExternalSyntheticLambda250 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda250 INSTANCE = new MessagesController$$ExternalSyntheticLambda250();

    private MessagesController$$ExternalSyntheticLambda250() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processChannelsUpdatesQueue$279;
        lambda$processChannelsUpdatesQueue$279 = MessagesController.lambda$processChannelsUpdatesQueue$279((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processChannelsUpdatesQueue$279;
    }
}
