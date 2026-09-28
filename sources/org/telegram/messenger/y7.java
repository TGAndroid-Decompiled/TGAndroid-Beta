package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class y7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f18193a;
    public final Object f18194b;
    public final Object f18195c;
    public final Object d;

    public y7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f18193a = baseController;
        this.f18194b = obj;
        this.f18195c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f18193a).lambda$prepareImportHistory$105((Uri) this.f18194b, (ArrayList) this.f18195c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f18193a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f18194b, (MediaDataController.SearchStickersResult) this.f18195c, (Utilities.Callback) this.d, arrayList, str);
    }
}
