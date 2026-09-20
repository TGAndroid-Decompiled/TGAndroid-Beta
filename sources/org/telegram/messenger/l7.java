package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class l7 implements Runnable {
    public final int f16868a;
    public final MediaDataController.KeywordResultCallback f16869b;
    public final ArrayList f16870c;
    public final String d;

    public l7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f16868a = i10;
        this.f16869b = keywordResultCallback;
        this.f16870c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16868a) {
            case 0:
                this.f16869b.run(this.f16870c, this.d);
                return;
            default:
                this.f16869b.run(this.f16870c, this.d);
                return;
        }
    }
}
