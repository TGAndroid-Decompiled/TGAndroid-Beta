package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class i7 implements Comparator {
    public final int f17166a;
    public final ArrayList f17167b;

    public i7(ArrayList arrayList, int i10) {
        this.f17166a = i10;
        this.f17167b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getEmojiSuggestions$221;
        int lambda$reorderStickers$54;
        switch (this.f17166a) {
            case 0:
                lambda$getEmojiSuggestions$221 = MediaDataController.lambda$getEmojiSuggestions$221(this.f17167b, (MediaDataController.KeywordResult) obj, (MediaDataController.KeywordResult) obj2);
                return lambda$getEmojiSuggestions$221;
            default:
                lambda$reorderStickers$54 = MediaDataController.lambda$reorderStickers$54(this.f17167b, (TLRPC.TL_messages_stickerSet) obj, (TLRPC.TL_messages_stickerSet) obj2);
                return lambda$reorderStickers$54;
        }
    }
}
