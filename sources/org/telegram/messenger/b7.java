package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class b7 implements Runnable {
    public final int f17408a;
    public final MediaDataController.KeywordResultCallback f17409b;
    public final ArrayList f17410c;
    public final String d;

    public b7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f17408a = i10;
        this.f17409b = keywordResultCallback;
        this.f17410c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17408a) {
            case 0:
                MediaDataController.M0(this.f17409b, this.f17410c, this.d);
                return;
            default:
                MediaDataController.J3(this.f17409b, this.f17410c, this.d);
                return;
        }
    }
}
