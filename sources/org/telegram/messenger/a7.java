package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class a7 implements Runnable {
    public final int f17307a;
    public final MediaDataController.KeywordResultCallback f17308b;
    public final ArrayList f17309c;
    public final String d;

    public a7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f17307a = i10;
        this.f17308b = keywordResultCallback;
        this.f17309c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17307a) {
            case 0:
                MediaDataController.M0(this.f17308b, this.f17309c, this.d);
                return;
            default:
                MediaDataController.J3(this.f17308b, this.f17309c, this.d);
                return;
        }
    }
}
