package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class y7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f19909a;
    public final Object f19910b;
    public final Object f19911c;
    public final Object d;

    public y7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f19909a = baseController;
        this.f19910b = obj;
        this.f19911c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f19909a).lambda$prepareImportHistory$108((Uri) this.f19910b, (ArrayList) this.f19911c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f19909a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f19910b, (MediaDataController.SearchStickersResult) this.f19911c, (Utilities.Callback) this.d, arrayList, str);
    }
}
