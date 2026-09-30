package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class y7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f18210a;
    public final Object f18211b;
    public final Object f18212c;
    public final Object d;

    public y7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f18210a = baseController;
        this.f18211b = obj;
        this.f18212c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f18210a).lambda$prepareImportHistory$105((Uri) this.f18211b, (ArrayList) this.f18212c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f18210a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f18211b, (MediaDataController.SearchStickersResult) this.f18212c, (Utilities.Callback) this.d, arrayList, str);
    }
}
