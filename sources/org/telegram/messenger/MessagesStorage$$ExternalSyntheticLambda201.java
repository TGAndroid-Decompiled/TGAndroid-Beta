package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.ui.Adapters.DialogsSearchAdapter;

public final class MessagesStorage$$ExternalSyntheticLambda201 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda201 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda201();

    private MessagesStorage$$ExternalSyntheticLambda201() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$localSearch$198;
        lambda$localSearch$198 = MessagesStorage.lambda$localSearch$198((DialogsSearchAdapter.DialogSearchResult) obj, (DialogsSearchAdapter.DialogSearchResult) obj2);
        return lambda$localSearch$198;
    }
}
