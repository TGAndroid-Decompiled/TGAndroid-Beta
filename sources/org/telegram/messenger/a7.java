package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class a7 implements Runnable {
    public final int f17311a;
    public final MediaDataController.KeywordResultCallback f17312b;
    public final ArrayList f17313c;
    public final String d;

    public a7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f17311a = i10;
        this.f17312b = keywordResultCallback;
        this.f17313c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17311a) {
            case 0:
                MediaDataController.M0(this.f17312b, this.f17313c, this.d);
                return;
            default:
                MediaDataController.J3(this.f17312b, this.f17313c, this.d);
                return;
        }
    }
}
