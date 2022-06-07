package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.ui.Adapters.DialogsSearchAdapter;

public final class MessagesStorage$$ExternalSyntheticLambda200 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda200 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda200();

    private MessagesStorage$$ExternalSyntheticLambda200() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$localSearch$197;
        lambda$localSearch$197 = MessagesStorage.lambda$localSearch$197((DialogsSearchAdapter.DialogSearchResult) obj, (DialogsSearchAdapter.DialogSearchResult) obj2);
        return lambda$localSearch$197;
    }
}
