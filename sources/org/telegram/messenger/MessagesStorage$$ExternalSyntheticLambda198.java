package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;

public final class MessagesStorage$$ExternalSyntheticLambda198 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda198 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda198();

    private MessagesStorage$$ExternalSyntheticLambda198() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$loadDialogFilters$40;
        lambda$loadDialogFilters$40 = MessagesStorage.lambda$loadDialogFilters$40((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
        return lambda$loadDialogFilters$40;
    }
}
