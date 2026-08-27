package org.telegram.messenger;

import java.util.ArrayList;

public final class k7 implements Runnable {

    public final int f20743a;

    public final MediaDataController.KeywordResultCallback f20744b;

    public final ArrayList f20745c;
    public final String d;

    public k7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f20743a = i10;
        this.f20744b = keywordResultCallback;
        this.f20745c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f20743a) {
            case 0:
                this.f20744b.run(this.f20745c, this.d);
                break;
            default:
                this.f20744b.run(this.f20745c, this.d);
                break;
        }
    }
}
