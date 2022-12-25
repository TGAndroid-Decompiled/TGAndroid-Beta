package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Message;

public final class MessagesStorage$$ExternalSyntheticLambda212 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda212 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda212();

    private MessagesStorage$$ExternalSyntheticLambda212() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getMessagesInternal$133;
        lambda$getMessagesInternal$133 = MessagesStorage.lambda$getMessagesInternal$133((TLRPC$Message) obj, (TLRPC$Message) obj2);
        return lambda$getMessagesInternal$133;
    }
}
