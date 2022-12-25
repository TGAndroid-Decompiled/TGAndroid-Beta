package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;

public final class MessagesStorage$$ExternalSyntheticLambda211 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda211 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda211();

    private MessagesStorage$$ExternalSyntheticLambda211() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$loadDialogFilters$47;
        lambda$loadDialogFilters$47 = MessagesStorage.lambda$loadDialogFilters$47((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
        return lambda$loadDialogFilters$47;
    }
}
