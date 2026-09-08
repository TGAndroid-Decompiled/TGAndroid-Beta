package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class l7 implements Runnable {
    public final int f18270a;
    public final MediaDataController.KeywordResultCallback f18271b;
    public final ArrayList f18272c;
    public final String d;

    public l7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18270a = i10;
        this.f18271b = keywordResultCallback;
        this.f18272c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18270a) {
            case 0:
                this.f18271b.run(this.f18272c, this.d);
                return;
            default:
                this.f18271b.run(this.f18272c, this.d);
                return;
        }
    }
}
