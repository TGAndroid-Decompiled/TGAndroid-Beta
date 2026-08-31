package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class d8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f18471a;
    public final Object f18472b;
    public final Object f18473c;
    public final Object d;

    public d8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f18471a = baseController;
        this.f18472b = obj;
        this.f18473c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f18471a).lambda$prepareImportHistory$105((Uri) this.f18472b, (ArrayList) this.f18473c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f18471a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f18472b, (MediaDataController.SearchStickersResult) this.f18473c, (Utilities.Callback) this.d, arrayList, str);
    }
}
