package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class y7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f19873a;
    public final Object f19874b;
    public final Object f19875c;
    public final Object d;

    public y7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f19873a = baseController;
        this.f19874b = obj;
        this.f19875c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f19873a).lambda$prepareImportHistory$108((Uri) this.f19874b, (ArrayList) this.f19875c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f19873a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f19874b, (MediaDataController.SearchStickersResult) this.f19875c, (Utilities.Callback) this.d, arrayList, str);
    }
}
