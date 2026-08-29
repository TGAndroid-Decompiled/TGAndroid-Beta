package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
public final class og implements Comparator {
    public final int f21182a;
    public final LongSparseIntArray f21183b;

    public og(LongSparseIntArray longSparseIntArray, int i10) {
        this.f21182a = i10;
        this.f21183b = longSparseIntArray;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$checkLoadedRemoteFilters$68;
        int lambda$resetDialogs$94;
        Long l10 = (Long) obj;
        Long l11 = (Long) obj2;
        switch (this.f21182a) {
            case 0:
                lambda$checkLoadedRemoteFilters$68 = MessagesStorage.lambda$checkLoadedRemoteFilters$68(this.f21183b, l10, l11);
                return lambda$checkLoadedRemoteFilters$68;
            default:
                lambda$resetDialogs$94 = MessagesStorage.lambda$resetDialogs$94(this.f21183b, l10, l11);
                return lambda$resetDialogs$94;
        }
    }
}
