package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;

public final class MessagesStorage$$ExternalSyntheticLambda64 implements Comparator {
    public final int $r8$classId;
    public final LongSparseIntArray f$0;

    public MessagesStorage$$ExternalSyntheticLambda64(LongSparseIntArray longSparseIntArray, int i) {
        this.$r8$classId = i;
        this.f$0 = longSparseIntArray;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        Long l = (Long) obj;
        Long l2 = (Long) obj2;
        switch (this.$r8$classId) {
            case 0:
                return MessagesStorage.lambda$checkLoadedRemoteFilters$68(this.f$0, l, l2);
            default:
                return MessagesStorage.lambda$resetDialogs$94(this.f$0, l, l2);
        }
    }
}
