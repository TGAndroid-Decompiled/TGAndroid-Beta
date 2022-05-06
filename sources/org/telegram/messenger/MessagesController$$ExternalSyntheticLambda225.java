package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;

public final class MessagesController$$ExternalSyntheticLambda225 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda225 INSTANCE = new MessagesController$$ExternalSyntheticLambda225();

    private MessagesController$$ExternalSyntheticLambda225() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processUpdatesQueue$262;
        lambda$processUpdatesQueue$262 = MessagesController.lambda$processUpdatesQueue$262((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processUpdatesQueue$262;
    }
}
