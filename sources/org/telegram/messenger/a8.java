package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class a8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f17846a;
    public final Object f17847b;
    public final Object f17848c;
    public final Object d;

    public a8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f17846a = baseController;
        this.f17847b = obj;
        this.f17848c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f17846a).lambda$prepareImportHistory$108((Uri) this.f17847b, (ArrayList) this.f17848c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f17846a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f17847b, (MediaDataController.SearchStickersResult) this.f17848c, (Utilities.Callback) this.d, arrayList, str);
    }
}
