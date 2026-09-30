package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class a7 implements Runnable {
    public final int f15881a;
    public final MediaDataController.KeywordResultCallback f15882b;
    public final ArrayList f15883c;
    public final String d;

    public a7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f15881a = i10;
        this.f15882b = keywordResultCallback;
        this.f15883c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f15881a) {
            case 0:
                MediaDataController.M0(this.f15882b, this.f15883c, this.d);
                return;
            default:
                MediaDataController.J3(this.f15882b, this.f15883c, this.d);
                return;
        }
    }
}
