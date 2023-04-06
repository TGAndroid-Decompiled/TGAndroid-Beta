package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class MessagesStorage$$ExternalSyntheticLambda214 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda214 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda214();

    private MessagesStorage$$ExternalSyntheticLambda214() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processLoadedFilterPeersInternal$53;
        lambda$processLoadedFilterPeersInternal$53 = MessagesStorage.lambda$processLoadedFilterPeersInternal$53((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
        return lambda$processLoadedFilterPeersInternal$53;
    }
}
