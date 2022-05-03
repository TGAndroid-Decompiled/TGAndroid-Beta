package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.ui.Adapters.DialogsSearchAdapter;

public final class MessagesStorage$$ExternalSyntheticLambda197 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda197 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda197();

    private MessagesStorage$$ExternalSyntheticLambda197() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$localSearch$193;
        lambda$localSearch$193 = MessagesStorage.lambda$localSearch$193((DialogsSearchAdapter.DialogSearchResult) obj, (DialogsSearchAdapter.DialogSearchResult) obj2);
        return lambda$localSearch$193;
    }
}
