package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
public final class xe implements Comparator {
    public final int f21843a;
    public final LongSparseIntArray f21844b;

    public xe(LongSparseIntArray longSparseIntArray, int i10) {
        this.f21843a = i10;
        this.f21844b = longSparseIntArray;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$checkLoadedRemoteFilters$71;
        int lambda$resetDialogs$97;
        Long l4 = (Long) obj;
        Long l10 = (Long) obj2;
        switch (this.f21843a) {
            case 0:
                lambda$checkLoadedRemoteFilters$71 = MessagesStorage.lambda$checkLoadedRemoteFilters$71(this.f21844b, l4, l10);
                return lambda$checkLoadedRemoteFilters$71;
            default:
                lambda$resetDialogs$97 = MessagesStorage.lambda$resetDialogs$97(this.f21844b, l4, l10);
                return lambda$resetDialogs$97;
        }
    }
}
