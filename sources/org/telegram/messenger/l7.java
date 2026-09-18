package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class l7 implements Runnable {
    public final int f16826a;
    public final MediaDataController.KeywordResultCallback f16827b;
    public final ArrayList f16828c;
    public final String d;

    public l7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f16826a = i10;
        this.f16827b = keywordResultCallback;
        this.f16828c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16826a) {
            case 0:
                this.f16827b.run(this.f16828c, this.d);
                return;
            default:
                this.f16827b.run(this.f16828c, this.d);
                return;
        }
    }
}
