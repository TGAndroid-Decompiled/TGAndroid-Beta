package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class d8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f18177a;
    public final Object f18178b;
    public final Object f18179c;
    public final Object d;

    public d8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f18177a = baseController;
        this.f18178b = obj;
        this.f18179c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f18177a).lambda$prepareImportHistory$108((Uri) this.f18178b, (ArrayList) this.f18179c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f18177a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f18178b, (MediaDataController.SearchStickersResult) this.f18179c, (Utilities.Callback) this.d, arrayList, str);
    }
}
