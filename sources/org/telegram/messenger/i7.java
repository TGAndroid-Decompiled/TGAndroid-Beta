package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class i7 implements Runnable {
    public final int f18654a;
    public final MediaDataController.KeywordResultCallback f18655b;
    public final ArrayList f18656c;
    public final String d;

    public i7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18654a = i10;
        this.f18655b = keywordResultCallback;
        this.f18656c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18654a) {
            case 0:
                this.f18655b.run(this.f18656c, this.d);
                return;
            default:
                this.f18655b.run(this.f18656c, this.d);
                return;
        }
    }
}
