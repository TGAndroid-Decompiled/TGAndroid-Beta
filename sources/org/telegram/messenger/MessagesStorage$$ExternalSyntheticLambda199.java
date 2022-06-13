package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;

public final class MessagesStorage$$ExternalSyntheticLambda199 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda199 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda199();

    private MessagesStorage$$ExternalSyntheticLambda199() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processLoadedFilterPeersInternal$44;
        lambda$processLoadedFilterPeersInternal$44 = MessagesStorage.lambda$processLoadedFilterPeersInternal$44((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
        return lambda$processLoadedFilterPeersInternal$44;
    }
}
