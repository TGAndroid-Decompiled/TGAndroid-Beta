package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;

public final class MessagesController$$ExternalSyntheticLambda219 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda219 INSTANCE = new MessagesController$$ExternalSyntheticLambda219();

    private MessagesController$$ExternalSyntheticLambda219() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processUpdatesQueue$253;
        lambda$processUpdatesQueue$253 = MessagesController.lambda$processUpdatesQueue$253((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processUpdatesQueue$253;
    }
}
