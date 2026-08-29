package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class c8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f19883a;
    public final Object f19884b;
    public final Object f19885c;
    public final Object d;

    public c8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f19883a = baseController;
        this.f19884b = obj;
        this.f19885c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f19883a).lambda$prepareImportHistory$105((Uri) this.f19884b, (ArrayList) this.f19885c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f19883a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f19884b, (MediaDataController.SearchStickersResult) this.f19885c, (Utilities.Callback) this.d, arrayList, str);
    }
}
