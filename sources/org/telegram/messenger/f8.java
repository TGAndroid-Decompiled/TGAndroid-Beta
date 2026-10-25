package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class f8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f20066a;
    public final Object f20067b;
    public final Object f20068c;
    public final Object d;

    public f8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f20066a = baseController;
        this.f20067b = obj;
        this.f20068c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f20066a).lambda$prepareImportHistory$108((Uri) this.f20067b, (ArrayList) this.f20068c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f20066a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f20067b, (MediaDataController.SearchStickersResult) this.f20068c, (Utilities.Callback) this.d, arrayList, str);
    }
}
