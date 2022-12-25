package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.p009ui.Adapters.DialogsSearchAdapter;

public final class MessagesStorage$$ExternalSyntheticLambda213 implements Comparator {
    public static final MessagesStorage$$ExternalSyntheticLambda213 INSTANCE = new MessagesStorage$$ExternalSyntheticLambda213();

    private MessagesStorage$$ExternalSyntheticLambda213() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$localSearch$210;
        lambda$localSearch$210 = MessagesStorage.lambda$localSearch$210((DialogsSearchAdapter.DialogSearchResult) obj, (DialogsSearchAdapter.DialogSearchResult) obj2);
        return lambda$localSearch$210;
    }
}
