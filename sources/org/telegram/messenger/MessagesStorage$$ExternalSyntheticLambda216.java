package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Message;
public final class MessagesStorage$$ExternalSyntheticLambda216 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda216 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda216();

    private MessagesStorage$$ExternalSyntheticLambda216() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getMessagesInternal$136;
        lambda$getMessagesInternal$136 = MessagesStorage.lambda$getMessagesInternal$136((TLRPC$Message) obj, (TLRPC$Message) obj2);
        return lambda$getMessagesInternal$136;
    }
}
