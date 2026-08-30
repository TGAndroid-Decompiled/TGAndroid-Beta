package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
public final class qg implements Comparator {
    public final int f18224a;
    public final LongSparseIntArray f18225b;

    public qg(LongSparseIntArray longSparseIntArray, int i10) {
        this.f18224a = i10;
        this.f18225b = longSparseIntArray;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$checkLoadedRemoteFilters$68;
        int lambda$resetDialogs$94;
        Long l10 = (Long) obj;
        Long l11 = (Long) obj2;
        switch (this.f18224a) {
            case 0:
                lambda$checkLoadedRemoteFilters$68 = MessagesStorage.lambda$checkLoadedRemoteFilters$68(this.f18225b, l10, l11);
                return lambda$checkLoadedRemoteFilters$68;
            default:
                lambda$resetDialogs$94 = MessagesStorage.lambda$resetDialogs$94(this.f18225b, l10, l11);
                return lambda$resetDialogs$94;
        }
    }
}
