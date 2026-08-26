package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.DialogsSearchAdapter;

public final class MediaDataController$$ExternalSyntheticLambda128 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final TLObject f$1;
    public final ArrayList f$2;
    public final int f$3;
    public final Object f$4;
    public final Object f$5;
    public final TLObject f$6;
    public final int f$7;

    public MediaDataController$$ExternalSyntheticLambda128(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i, LongSparseArray longSparseArray, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i2) {
        this.$r8$classId = 0;
        this.f$0 = mediaDataController;
        this.f$1 = tLObject;
        this.f$2 = arrayList;
        this.f$3 = i;
        this.f$4 = longSparseArray;
        this.f$5 = stickerSet;
        this.f$6 = tL_messages_allStickers;
        this.f$7 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MediaDataController) this.f$0).lambda$processLoadStickersResponse$73(this.f$1, this.f$2, this.f$3, (LongSparseArray) this.f$4, (TLRPC.StickerSet) this.f$5, (TLRPC.TL_messages_allStickers) this.f$6, this.f$7);
                break;
            case 1:
                ((DialogsSearchAdapter) this.f$0).lambda$searchMessagesInternal$2(this.f$3, this.f$7, (TLRPC.TL_error) this.f$4, (String) this.f$5, this.f$1, (TLRPC.TL_messages_searchGlobal) this.f$6, this.f$2);
                break;
            default:
                ((DialogsSearchAdapter) this.f$0).lambda$searchForumMessagesInternal$0(this.f$3, this.f$7, (TLRPC.TL_error) this.f$4, (String) this.f$5, this.f$1, (TLRPC.TL_messages_search) this.f$6, this.f$2);
                break;
        }
    }

    public MediaDataController$$ExternalSyntheticLambda128(DialogsSearchAdapter dialogsSearchAdapter, int i, int i2, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i3) {
        this.$r8$classId = i3;
        this.f$0 = dialogsSearchAdapter;
        this.f$3 = i;
        this.f$7 = i2;
        this.f$4 = tL_error;
        this.f$5 = str;
        this.f$1 = tLObject;
        this.f$6 = tLMethod;
        this.f$2 = arrayList;
    }
}
