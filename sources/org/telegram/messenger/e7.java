package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class e7 implements Runnable {
    public final int f18241a;
    public final MediaDataController.KeywordResultCallback f18242b;
    public final ArrayList f18243c;
    public final String d;

    public e7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18241a = i10;
        this.f18242b = keywordResultCallback;
        this.f18243c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18241a) {
            case 0:
                this.f18242b.run(this.f18243c, this.d);
                return;
            default:
                this.f18242b.run(this.f18243c, this.d);
                return;
        }
    }
}
