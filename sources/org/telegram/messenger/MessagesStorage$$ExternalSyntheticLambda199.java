package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Message;

public final class MessagesStorage$$ExternalSyntheticLambda199 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda199 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda199();

    private MessagesStorage$$ExternalSyntheticLambda199() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getMessagesInternal$124;
        lambda$getMessagesInternal$124 = MessagesStorage.lambda$getMessagesInternal$124((TLRPC$Message) obj, (TLRPC$Message) obj2);
        return lambda$getMessagesInternal$124;
    }
}
