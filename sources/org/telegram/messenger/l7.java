package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class l7 implements Runnable {
    public final int f16638a;
    public final MediaDataController.KeywordResultCallback f16639b;
    public final ArrayList f16640c;
    public final String d;

    public l7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f16638a = i10;
        this.f16639b = keywordResultCallback;
        this.f16640c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16638a) {
            case 0:
                this.f16639b.run(this.f16640c, this.d);
                return;
            default:
                this.f16639b.run(this.f16640c, this.d);
                return;
        }
    }
}
