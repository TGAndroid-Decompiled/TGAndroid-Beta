package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class b7 implements Runnable {
    public final int f17437a;
    public final MediaDataController.KeywordResultCallback f17438b;
    public final ArrayList f17439c;
    public final String d;

    public b7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f17437a = i10;
        this.f17438b = keywordResultCallback;
        this.f17439c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17437a) {
            case 0:
                MediaDataController.M0(this.f17438b, this.f17439c, this.d);
                return;
            default:
                MediaDataController.J3(this.f17438b, this.f17439c, this.d);
                return;
        }
    }
}
