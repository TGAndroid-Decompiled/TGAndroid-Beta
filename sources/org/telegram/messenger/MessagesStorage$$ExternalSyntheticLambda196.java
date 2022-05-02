package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Message;

public final class MessagesStorage$$ExternalSyntheticLambda196 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda196 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda196();

    private MessagesStorage$$ExternalSyntheticLambda196() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getMessagesInternal$120;
        lambda$getMessagesInternal$120 = MessagesStorage.lambda$getMessagesInternal$120((TLRPC$Message) obj, (TLRPC$Message) obj2);
        return lambda$getMessagesInternal$120;
    }
}
