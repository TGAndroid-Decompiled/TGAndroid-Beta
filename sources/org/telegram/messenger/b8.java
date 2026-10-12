package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class b8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f16849a;
    public final Object f16850b;
    public final Object f16851c;
    public final Object d;

    public b8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f16849a = baseController;
        this.f16850b = obj;
        this.f16851c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f16849a).lambda$prepareImportHistory$108((Uri) this.f16850b, (ArrayList) this.f16851c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f16849a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f16850b, (MediaDataController.SearchStickersResult) this.f16851c, (Utilities.Callback) this.d, arrayList, str);
    }
}
