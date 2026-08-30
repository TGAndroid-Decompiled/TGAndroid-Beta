package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class n7 implements Runnable {
    public final int f17912a;
    public final MediaDataController.KeywordResultCallback f17913b;
    public final ArrayList f17914c;
    public final String d;

    public n7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f17912a = i10;
        this.f17913b = keywordResultCallback;
        this.f17914c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17912a) {
            case 0:
                this.f17913b.run(this.f17914c, this.d);
                return;
            default:
                this.f17913b.run(this.f17914c, this.d);
                return;
        }
    }
}
