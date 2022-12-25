package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Message;

public final class MessagesStorage$$ExternalSyntheticLambda213 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda213 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda213();

    private MessagesStorage$$ExternalSyntheticLambda213() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getMessagesInternal$134;
        lambda$getMessagesInternal$134 = MessagesStorage.lambda$getMessagesInternal$134((TLRPC$Message) obj, (TLRPC$Message) obj2);
        return lambda$getMessagesInternal$134;
    }
}
