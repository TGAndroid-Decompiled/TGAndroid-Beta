package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class d8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f17024a;
    public final Object f17025b;
    public final Object f17026c;
    public final Object d;

    public d8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f17024a = baseController;
        this.f17025b = obj;
        this.f17026c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f17024a).lambda$prepareImportHistory$105((Uri) this.f17025b, (ArrayList) this.f17026c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f17024a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f17025b, (MediaDataController.SearchStickersResult) this.f17026c, (Utilities.Callback) this.d, arrayList, str);
    }
}
