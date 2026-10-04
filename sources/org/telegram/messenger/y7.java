package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class y7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f19877a;
    public final Object f19878b;
    public final Object f19879c;
    public final Object d;

    public y7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f19877a = baseController;
        this.f19878b = obj;
        this.f19879c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f19877a).lambda$prepareImportHistory$105((Uri) this.f19878b, (ArrayList) this.f19879c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f19877a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f19878b, (MediaDataController.SearchStickersResult) this.f19879c, (Utilities.Callback) this.d, arrayList, str);
    }
}
