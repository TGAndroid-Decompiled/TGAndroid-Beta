package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;

public final class MessagesController$$ExternalSyntheticLambda224 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda224 INSTANCE = new MessagesController$$ExternalSyntheticLambda224();

    private MessagesController$$ExternalSyntheticLambda224() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processLoadedDialogFilters$13;
        lambda$processLoadedDialogFilters$13 = MessagesController.lambda$processLoadedDialogFilters$13((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
        return lambda$processLoadedDialogFilters$13;
    }
}
