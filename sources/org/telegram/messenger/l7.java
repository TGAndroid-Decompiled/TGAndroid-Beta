package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class l7 implements Runnable {
    public final int f16896a;
    public final MediaDataController.KeywordResultCallback f16897b;
    public final ArrayList f16898c;
    public final String d;

    public l7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f16896a = i10;
        this.f16897b = keywordResultCallback;
        this.f16898c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16896a) {
            case 0:
                this.f16897b.run(this.f16898c, this.d);
                return;
            default:
                this.f16897b.run(this.f16898c, this.d);
                return;
        }
    }
}
