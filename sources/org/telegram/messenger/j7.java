package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

public final class j7 implements Comparator {

    public final int f20650a;

    public final ArrayList f20651b;

    public j7(ArrayList arrayList, int i10) {
        this.f20650a = i10;
        this.f20651b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f20650a) {
            case 0:
                return MediaDataController.lambda$getEmojiSuggestions$220(this.f20651b, (MediaDataController.KeywordResult) obj, (MediaDataController.KeywordResult) obj2);
            default:
                return MediaDataController.lambda$reorderStickers$54(this.f20651b, (TLRPC.TL_messages_stickerSet) obj, (TLRPC.TL_messages_stickerSet) obj2);
        }
    }
}
