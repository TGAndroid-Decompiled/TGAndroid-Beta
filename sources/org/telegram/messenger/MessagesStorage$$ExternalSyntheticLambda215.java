package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class MessagesStorage$$ExternalSyntheticLambda215 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda215 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda215();

    private MessagesStorage$$ExternalSyntheticLambda215() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$loadDialogFilters$49;
        lambda$loadDialogFilters$49 = MessagesStorage.lambda$loadDialogFilters$49((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
        return lambda$loadDialogFilters$49;
    }
}
