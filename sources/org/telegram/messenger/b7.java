package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class b7 implements Runnable {
    public final int f17404a;
    public final MediaDataController.KeywordResultCallback f17405b;
    public final ArrayList f17406c;
    public final String d;

    public b7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f17404a = i10;
        this.f17405b = keywordResultCallback;
        this.f17406c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17404a) {
            case 0:
                MediaDataController.M0(this.f17405b, this.f17406c, this.d);
                return;
            default:
                MediaDataController.J3(this.f17405b, this.f17406c, this.d);
                return;
        }
    }
}
