package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class y7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f19884a;
    public final Object f19885b;
    public final Object f19886c;
    public final Object d;

    public y7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f19884a = baseController;
        this.f19885b = obj;
        this.f19886c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f19884a).lambda$prepareImportHistory$105((Uri) this.f19885b, (ArrayList) this.f19886c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f19884a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f19885b, (MediaDataController.SearchStickersResult) this.f19886c, (Utilities.Callback) this.d, arrayList, str);
    }
}
