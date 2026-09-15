package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class a8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f15655a;
    public final Object f15656b;
    public final Object f15657c;
    public final Object d;

    public a8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f15655a = baseController;
        this.f15656b = obj;
        this.f15657c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f15655a).lambda$prepareImportHistory$105((Uri) this.f15656b, (ArrayList) this.f15657c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f15655a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f15656b, (MediaDataController.SearchStickersResult) this.f15657c, (Utilities.Callback) this.d, arrayList, str);
    }
}
