package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class a8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f17849a;
    public final Object f17850b;
    public final Object f17851c;
    public final Object d;

    public a8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f17849a = baseController;
        this.f17850b = obj;
        this.f17851c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f17849a).lambda$prepareImportHistory$108((Uri) this.f17850b, (ArrayList) this.f17851c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f17849a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f17850b, (MediaDataController.SearchStickersResult) this.f17851c, (Utilities.Callback) this.d, arrayList, str);
    }
}
