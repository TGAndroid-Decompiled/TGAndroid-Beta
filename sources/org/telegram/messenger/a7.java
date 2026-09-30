package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class a7 implements Runnable {
    public final int f15897a;
    public final MediaDataController.KeywordResultCallback f15898b;
    public final ArrayList f15899c;
    public final String d;

    public a7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f15897a = i10;
        this.f15898b = keywordResultCallback;
        this.f15899c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f15897a) {
            case 0:
                MediaDataController.M0(this.f15898b, this.f15899c, this.d);
                return;
            default:
                MediaDataController.J3(this.f15898b, this.f15899c, this.d);
                return;
        }
    }
}
