package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class a7 implements Runnable {
    public final int f15880a;
    public final MediaDataController.KeywordResultCallback f15881b;
    public final ArrayList f15882c;
    public final String d;

    public a7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f15880a = i10;
        this.f15881b = keywordResultCallback;
        this.f15882c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f15880a) {
            case 0:
                MediaDataController.M0(this.f15881b, this.f15882c, this.d);
                return;
            default:
                MediaDataController.J3(this.f15881b, this.f15882c, this.d);
                return;
        }
    }
}
