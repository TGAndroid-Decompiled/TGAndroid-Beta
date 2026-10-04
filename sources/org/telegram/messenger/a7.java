package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class a7 implements Runnable {
    public final int f17306a;
    public final MediaDataController.KeywordResultCallback f17307b;
    public final ArrayList f17308c;
    public final String d;

    public a7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f17306a = i10;
        this.f17307b = keywordResultCallback;
        this.f17308c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17306a) {
            case 0:
                MediaDataController.M0(this.f17307b, this.f17308c, this.d);
                return;
            default:
                MediaDataController.J3(this.f17307b, this.f17308c, this.d);
                return;
        }
    }
}
