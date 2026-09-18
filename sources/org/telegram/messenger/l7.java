package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class l7 implements Runnable {
    public final int f16658a;
    public final MediaDataController.KeywordResultCallback f16659b;
    public final ArrayList f16660c;
    public final String d;

    public l7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f16658a = i10;
        this.f16659b = keywordResultCallback;
        this.f16660c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16658a) {
            case 0:
                this.f16659b.run(this.f16660c, this.d);
                return;
            default:
                this.f16659b.run(this.f16660c, this.d);
                return;
        }
    }
}
