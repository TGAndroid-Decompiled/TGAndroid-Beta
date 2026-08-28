package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class x7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f22104a;
    public final Object f22105b;
    public final Object f22106c;
    public final Object d;

    public x7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f22104a = baseController;
        this.f22105b = obj;
        this.f22106c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f22104a).lambda$prepareImportHistory$105((Uri) this.f22105b, (ArrayList) this.f22106c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f22104a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f22105b, (MediaDataController.SearchStickersResult) this.f22106c, (Utilities.Callback) this.d, arrayList, str);
    }
}
