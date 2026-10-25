package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ue implements Comparator {
    public final int f21436a;
    public final LongSparseIntArray f21437b;

    public ue(LongSparseIntArray longSparseIntArray, int i10) {
        this.f21436a = i10;
        this.f21437b = longSparseIntArray;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$checkLoadedRemoteFilters$71;
        int lambda$resetDialogs$97;
        Long l4 = (Long) obj;
        Long l10 = (Long) obj2;
        switch (this.f21436a) {
            case 0:
                lambda$checkLoadedRemoteFilters$71 = MessagesStorage.lambda$checkLoadedRemoteFilters$71(this.f21437b, l4, l10);
                return lambda$checkLoadedRemoteFilters$71;
            default:
                lambda$resetDialogs$97 = MessagesStorage.lambda$resetDialogs$97(this.f21437b, l4, l10);
                return lambda$resetDialogs$97;
        }
    }
}
