package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class a7 implements Runnable {
    public final int f17316a;
    public final MediaDataController.KeywordResultCallback f17317b;
    public final ArrayList f17318c;
    public final String d;

    public a7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f17316a = i10;
        this.f17317b = keywordResultCallback;
        this.f17318c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17316a) {
            case 0:
                MediaDataController.M0(this.f17317b, this.f17318c, this.d);
                return;
            default:
                MediaDataController.J3(this.f17317b, this.f17318c, this.d);
                return;
        }
    }
}
