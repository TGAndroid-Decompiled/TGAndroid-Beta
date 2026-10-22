package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class e8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f18250a;
    public final Object f18251b;
    public final Object f18252c;
    public final Object d;

    public e8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f18250a = baseController;
        this.f18251b = obj;
        this.f18252c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f18250a).lambda$prepareImportHistory$108((Uri) this.f18251b, (ArrayList) this.f18252c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f18250a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f18251b, (MediaDataController.SearchStickersResult) this.f18252c, (Utilities.Callback) this.d, arrayList, str);
    }
}
