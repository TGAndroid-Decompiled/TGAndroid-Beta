package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Message;

public final class MessagesStorage$$ExternalSyntheticLambda200 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda200 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda200();

    private MessagesStorage$$ExternalSyntheticLambda200() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getMessagesInternal$125;
        lambda$getMessagesInternal$125 = MessagesStorage.lambda$getMessagesInternal$125((TLRPC$Message) obj, (TLRPC$Message) obj2);
        return lambda$getMessagesInternal$125;
    }
}
