package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class a8 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f15628a;
    public final Object f15629b;
    public final Object f15630c;
    public final Object d;

    public a8(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f15628a = baseController;
        this.f15629b = obj;
        this.f15630c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f15628a).lambda$prepareImportHistory$105((Uri) this.f15629b, (ArrayList) this.f15630c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f15628a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f15629b, (MediaDataController.SearchStickersResult) this.f15630c, (Utilities.Callback) this.d, arrayList, str);
    }
}
