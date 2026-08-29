package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class l7 implements Comparator {
    public final int f20830a;
    public final ArrayList f20831b;

    public l7(ArrayList arrayList, int i10) {
        this.f20830a = i10;
        this.f20831b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getEmojiSuggestions$220;
        int lambda$reorderStickers$54;
        switch (this.f20830a) {
            case 0:
                lambda$getEmojiSuggestions$220 = MediaDataController.lambda$getEmojiSuggestions$220(this.f20831b, (MediaDataController.KeywordResult) obj, (MediaDataController.KeywordResult) obj2);
                return lambda$getEmojiSuggestions$220;
            default:
                lambda$reorderStickers$54 = MediaDataController.lambda$reorderStickers$54(this.f20831b, (TLRPC.TL_messages_stickerSet) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return lambda$reorderStickers$54;
        }
    }
}
