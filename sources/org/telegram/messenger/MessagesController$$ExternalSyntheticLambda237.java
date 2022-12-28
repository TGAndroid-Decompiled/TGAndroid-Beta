package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;

public final class MessagesController$$ExternalSyntheticLambda237 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda237 INSTANCE = new MessagesController$$ExternalSyntheticLambda237();

    private MessagesController$$ExternalSyntheticLambda237() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processUpdatesQueue$273;
        lambda$processUpdatesQueue$273 = MessagesController.lambda$processUpdatesQueue$273((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processUpdatesQueue$273;
    }
}
