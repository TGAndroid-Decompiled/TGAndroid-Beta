package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class y7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f19882a;
    public final Object f19883b;
    public final Object f19884c;
    public final Object d;

    public y7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f19882a = baseController;
        this.f19883b = obj;
        this.f19884c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f19882a).lambda$prepareImportHistory$108((Uri) this.f19883b, (ArrayList) this.f19884c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f19882a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f19883b, (MediaDataController.SearchStickersResult) this.f19884c, (Utilities.Callback) this.d, arrayList, str);
    }
}
