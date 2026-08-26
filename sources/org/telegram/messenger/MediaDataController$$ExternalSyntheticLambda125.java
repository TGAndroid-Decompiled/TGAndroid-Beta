package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda125 implements Comparator {
    public final int $r8$classId;
    public final ArrayList f$0;

    public MediaDataController$$ExternalSyntheticLambda125(ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return MediaDataController.lambda$getEmojiSuggestions$220(this.f$0, (MediaDataController.KeywordResult) obj, (MediaDataController.KeywordResult) obj2);
            default:
                return MediaDataController.lambda$reorderStickers$54(this.f$0, (TLRPC.TL_messages_stickerSet) obj, (TLRPC.TL_messages_stickerSet) obj2);
        }
    }
}
