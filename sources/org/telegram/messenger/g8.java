package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class g8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f20150a;
    public final Object f20151b;
    public final Object f20152c;
    public final Object d;

    public g8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f20150a = baseController;
        this.f20151b = obj;
        this.f20152c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f20150a).lambda$prepareImportHistory$108((Uri) this.f20151b, (ArrayList) this.f20152c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f20150a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f20151b, (MediaDataController.SearchStickersResult) this.f20152c, (Utilities.Callback) this.d, arrayList, str);
    }
}
