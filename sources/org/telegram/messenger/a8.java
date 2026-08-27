package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;

public final class a8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {

    public final BaseController f19684a;

    public final Object f19685b;

    public final Object f19686c;
    public final Object d;

    public a8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f19684a = baseController;
        this.f19685b = obj;
        this.f19686c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f19684a).lambda$prepareImportHistory$105((Uri) this.f19685b, (ArrayList) this.f19686c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f19684a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f19685b, (MediaDataController.SearchStickersResult) this.f19686c, (Utilities.Callback) this.d, arrayList, str);
    }
}
