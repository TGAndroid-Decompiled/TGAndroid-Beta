package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class e7 implements Runnable {
    public final int f17485a;
    public final MediaDataController.KeywordResultCallback f17486b;
    public final ArrayList f17487c;
    public final String d;

    public e7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f17485a = i10;
        this.f17486b = keywordResultCallback;
        this.f17487c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17485a) {
            case 0:
                this.f17486b.run(this.f17487c, this.d);
                return;
            default:
                this.f17486b.run(this.f17487c, this.d);
                return;
        }
    }
}
