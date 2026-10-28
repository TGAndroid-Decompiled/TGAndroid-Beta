package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class k7 implements Runnable {
    public final int f20486a;
    public final MediaDataController.KeywordResultCallback f20487b;
    public final ArrayList f20488c;
    public final String d;

    public k7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f20486a = i10;
        this.f20487b = keywordResultCallback;
        this.f20488c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f20486a) {
            case 0:
                this.f20487b.run(this.f20488c, this.d);
                return;
            default:
                this.f20487b.run(this.f20488c, this.d);
                return;
        }
    }
}
