package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;

public final class SendMessagesHelper$$ExternalSyntheticLambda61 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public SendMessagesHelper$$ExternalSyntheticLambda61(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f$0 = baseController;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public void run(long j) {
        ((SendMessagesHelper) this.f$0).lambda$prepareImportHistory$105((Uri) this.f$1, (ArrayList) this.f$2, (MessagesStorage.LongCallback) this.f$3, j);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f$0).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f$1, (MediaDataController.SearchStickersResult) this.f$2, (Utilities.Callback) this.f$3, arrayList, str);
    }
}
