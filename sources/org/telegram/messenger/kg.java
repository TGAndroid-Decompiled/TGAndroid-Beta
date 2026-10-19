package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
public final class kg implements Comparator {
    public final int f18801a;
    public final LongSparseIntArray f18802b;

    public kg(LongSparseIntArray longSparseIntArray, int i10) {
        this.f18801a = i10;
        this.f18802b = longSparseIntArray;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$checkLoadedRemoteFilters$68;
        int lambda$resetDialogs$94;
        Long l4 = (Long) obj;
        Long l10 = (Long) obj2;
        switch (this.f18801a) {
            case 0:
                lambda$checkLoadedRemoteFilters$68 = MessagesStorage.lambda$checkLoadedRemoteFilters$68(this.f18802b, l4, l10);
                return lambda$checkLoadedRemoteFilters$68;
            default:
                lambda$resetDialogs$94 = MessagesStorage.lambda$resetDialogs$94(this.f18802b, l4, l10);
                return lambda$resetDialogs$94;
        }
    }
}
