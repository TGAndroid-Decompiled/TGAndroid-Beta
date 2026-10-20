package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class b8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f17936a;
    public final Object f17937b;
    public final Object f17938c;
    public final Object d;

    public b8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f17936a = baseController;
        this.f17937b = obj;
        this.f17938c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f17936a).lambda$prepareImportHistory$108((Uri) this.f17937b, (ArrayList) this.f17938c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f17936a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f17937b, (MediaDataController.SearchStickersResult) this.f17938c, (Utilities.Callback) this.d, arrayList, str);
    }
}
