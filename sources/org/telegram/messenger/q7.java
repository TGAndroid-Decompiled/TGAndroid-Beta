package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class q7 implements Comparator {
    public final int f16118a;
    public final ArrayList f16119b;

    public q7(ArrayList arrayList, int i10) {
        this.f16118a = i10;
        this.f16119b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getEmojiSuggestions$220;
        int lambda$reorderStickers$54;
        switch (this.f16118a) {
            case 0:
                lambda$getEmojiSuggestions$220 = MediaDataController.lambda$getEmojiSuggestions$220(this.f16119b, (MediaDataController.KeywordResult) obj, (MediaDataController.KeywordResult) obj2);
                return lambda$getEmojiSuggestions$220;
            default:
                lambda$reorderStickers$54 = MediaDataController.lambda$reorderStickers$54(this.f16119b, (TLRPC.TL_messages_stickerSet) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return lambda$reorderStickers$54;
        }
    }
}
