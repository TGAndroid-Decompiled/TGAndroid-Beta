package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class l7 implements Runnable {
    public final int f16890a;
    public final MediaDataController.KeywordResultCallback f16891b;
    public final ArrayList f16892c;
    public final String d;

    public l7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f16890a = i10;
        this.f16891b = keywordResultCallback;
        this.f16892c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16890a) {
            case 0:
                this.f16891b.run(this.f16892c, this.d);
                return;
            default:
                this.f16891b.run(this.f16892c, this.d);
                return;
        }
    }
}
