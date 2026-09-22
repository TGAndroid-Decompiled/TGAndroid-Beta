package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class l7 implements Runnable {
    public final int f16645a;
    public final MediaDataController.KeywordResultCallback f16646b;
    public final ArrayList f16647c;
    public final String d;

    public l7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f16645a = i10;
        this.f16646b = keywordResultCallback;
        this.f16647c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16645a) {
            case 0:
                this.f16646b.run(this.f16647c, this.d);
                return;
            default:
                this.f16646b.run(this.f16647c, this.d);
                return;
        }
    }
}
