package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class y7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f19879a;
    public final Object f19880b;
    public final Object f19881c;
    public final Object d;

    public y7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f19879a = baseController;
        this.f19880b = obj;
        this.f19881c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f19879a).lambda$prepareImportHistory$105((Uri) this.f19880b, (ArrayList) this.f19881c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f19879a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f19880b, (MediaDataController.SearchStickersResult) this.f19881c, (Utilities.Callback) this.d, arrayList, str);
    }
}
