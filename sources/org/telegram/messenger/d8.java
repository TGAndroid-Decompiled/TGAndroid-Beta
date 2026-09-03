package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class d8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f18473a;
    public final Object f18474b;
    public final Object f18475c;
    public final Object d;

    public d8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f18473a = baseController;
        this.f18474b = obj;
        this.f18475c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f18473a).lambda$prepareImportHistory$105((Uri) this.f18474b, (ArrayList) this.f18475c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f18473a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f18474b, (MediaDataController.SearchStickersResult) this.f18475c, (Utilities.Callback) this.d, arrayList, str);
    }
}
