package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Updates;

public final class MessagesController$$ExternalSyntheticLambda227 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda227 INSTANCE = new MessagesController$$ExternalSyntheticLambda227();

    private MessagesController$$ExternalSyntheticLambda227() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processChannelsUpdatesQueue$259;
        lambda$processChannelsUpdatesQueue$259 = MessagesController.lambda$processChannelsUpdatesQueue$259((TLRPC$Updates) obj, (TLRPC$Updates) obj2);
        return lambda$processChannelsUpdatesQueue$259;
    }
}
