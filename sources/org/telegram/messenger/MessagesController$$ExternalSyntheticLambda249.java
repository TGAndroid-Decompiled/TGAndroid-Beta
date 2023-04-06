package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;
public final class MessagesController$$ExternalSyntheticLambda249 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda249 INSTANCE = new MessagesController$$ExternalSyntheticLambda249();

    private MessagesController$$ExternalSyntheticLambda249() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processUpdatesQueue$282;
        lambda$processUpdatesQueue$282 = MessagesController.lambda$processUpdatesQueue$282((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processUpdatesQueue$282;
    }
}
