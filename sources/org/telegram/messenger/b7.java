package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class b7 implements Runnable {
    public final int f17401a;
    public final MediaDataController.KeywordResultCallback f17402b;
    public final ArrayList f17403c;
    public final String d;

    public b7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f17401a = i10;
        this.f17402b = keywordResultCallback;
        this.f17403c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17401a) {
            case 0:
                MediaDataController.M0(this.f17402b, this.f17403c, this.d);
                return;
            default:
                MediaDataController.J3(this.f17402b, this.f17403c, this.d);
                return;
        }
    }
}
