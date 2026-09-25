package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class a8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f15883a;
    public final Object f15884b;
    public final Object f15885c;
    public final Object d;

    public a8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f15883a = baseController;
        this.f15884b = obj;
        this.f15885c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f15883a).lambda$prepareImportHistory$105((Uri) this.f15884b, (ArrayList) this.f15885c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f15883a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f15884b, (MediaDataController.SearchStickersResult) this.f15885c, (Utilities.Callback) this.d, arrayList, str);
    }
}
