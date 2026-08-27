package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;

public final class lg implements Comparator {

    public final int f20894a;

    public final LongSparseIntArray f20895b;

    public lg(LongSparseIntArray longSparseIntArray, int i10) {
        this.f20894a = i10;
        this.f20895b = longSparseIntArray;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Long l11 = (Long) obj2;
        switch (this.f20894a) {
            case 0:
                return MessagesStorage.lambda$checkLoadedRemoteFilters$68(this.f20895b, l10, l11);
            default:
                return MessagesStorage.lambda$resetDialogs$94(this.f20895b, l10, l11);
        }
    }
}
