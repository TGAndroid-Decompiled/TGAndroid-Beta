package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;
public final class MessagesController$$ExternalSyntheticLambda248 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda248 INSTANCE = new MessagesController$$ExternalSyntheticLambda248();

    private MessagesController$$ExternalSyntheticLambda248() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processUpdatesQueue$281;
        lambda$processUpdatesQueue$281 = MessagesController.lambda$processUpdatesQueue$281((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processUpdatesQueue$281;
    }
}
