package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class b8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f17150a;
    public final Object f17151b;
    public final Object f17152c;
    public final Object d;

    public b8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f17150a = baseController;
        this.f17151b = obj;
        this.f17152c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f17150a).lambda$prepareImportHistory$108((Uri) this.f17151b, (ArrayList) this.f17152c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f17150a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f17151b, (MediaDataController.SearchStickersResult) this.f17152c, (Utilities.Callback) this.d, arrayList, str);
    }
}
