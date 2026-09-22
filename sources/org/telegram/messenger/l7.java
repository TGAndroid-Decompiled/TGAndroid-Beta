package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class l7 implements Runnable {
    public final int f16883a;
    public final MediaDataController.KeywordResultCallback f16884b;
    public final ArrayList f16885c;
    public final String d;

    public l7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f16883a = i10;
        this.f16884b = keywordResultCallback;
        this.f16885c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16883a) {
            case 0:
                this.f16884b.run(this.f16885c, this.d);
                return;
            default:
                this.f16884b.run(this.f16885c, this.d);
                return;
        }
    }
}
