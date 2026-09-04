package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class a8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f17134a;
    public final Object f17135b;
    public final Object f17136c;
    public final Object d;

    public a8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f17134a = baseController;
        this.f17135b = obj;
        this.f17136c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f17134a).lambda$prepareImportHistory$105((Uri) this.f17135b, (ArrayList) this.f17136c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f17134a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f17135b, (MediaDataController.SearchStickersResult) this.f17136c, (Utilities.Callback) this.d, arrayList, str);
    }
}
