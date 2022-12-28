package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;

public final class MessagesController$$ExternalSyntheticLambda238 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda238 INSTANCE = new MessagesController$$ExternalSyntheticLambda238();

    private MessagesController$$ExternalSyntheticLambda238() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processChannelsUpdatesQueue$270;
        lambda$processChannelsUpdatesQueue$270 = MessagesController.lambda$processChannelsUpdatesQueue$270((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processChannelsUpdatesQueue$270;
    }
}
