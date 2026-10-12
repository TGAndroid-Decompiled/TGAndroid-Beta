package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class b8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f17149a;
    public final Object f17150b;
    public final Object f17151c;
    public final Object d;

    public b8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f17149a = baseController;
        this.f17150b = obj;
        this.f17151c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f17149a).lambda$prepareImportHistory$108((Uri) this.f17150b, (ArrayList) this.f17151c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f17149a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f17150b, (MediaDataController.SearchStickersResult) this.f17151c, (Utilities.Callback) this.d, arrayList, str);
    }
}
