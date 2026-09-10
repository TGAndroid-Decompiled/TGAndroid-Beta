package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class h8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f15348a;
    public final Object f15349b;
    public final Object f15350c;
    public final Object d;

    public h8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f15348a = baseController;
        this.f15349b = obj;
        this.f15350c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f15348a).lambda$prepareImportHistory$105((Uri) this.f15349b, (ArrayList) this.f15350c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f15348a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f15349b, (MediaDataController.SearchStickersResult) this.f15350c, (Utilities.Callback) this.d, arrayList, str);
    }
}
