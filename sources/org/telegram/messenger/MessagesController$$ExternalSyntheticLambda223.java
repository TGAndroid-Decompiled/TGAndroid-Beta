package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;

public final class MessagesController$$ExternalSyntheticLambda223 implements Comparator {
    public static final MessagesController$$ExternalSyntheticLambda223 INSTANCE = new MessagesController$$ExternalSyntheticLambda223();

    private MessagesController$$ExternalSyntheticLambda223() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processLoadedDialogFilters$12;
        lambda$processLoadedDialogFilters$12 = MessagesController.lambda$processLoadedDialogFilters$12((MessagesController.DialogFilter) obj, (MessagesController.DialogFilter) obj2);
        return lambda$processLoadedDialogFilters$12;
    }
}
