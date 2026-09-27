package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class a8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f15877a;
    public final Object f15878b;
    public final Object f15879c;
    public final Object d;

    public a8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f15877a = baseController;
        this.f15878b = obj;
        this.f15879c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f15877a).lambda$prepareImportHistory$105((Uri) this.f15878b, (ArrayList) this.f15879c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f15877a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f15878b, (MediaDataController.SearchStickersResult) this.f15879c, (Utilities.Callback) this.d, arrayList, str);
    }
}
