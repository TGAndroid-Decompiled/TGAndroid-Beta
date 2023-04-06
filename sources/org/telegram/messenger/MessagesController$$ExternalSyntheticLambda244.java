package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;
public final class MessagesController$$ExternalSyntheticLambda244 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda244 INSTANCE = new MessagesController$$ExternalSyntheticLambda244();

    private MessagesController$$ExternalSyntheticLambda244() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processUpdatesQueue$280;
        lambda$processUpdatesQueue$280 = MessagesController.lambda$processUpdatesQueue$280((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processUpdatesQueue$280;
    }
}
