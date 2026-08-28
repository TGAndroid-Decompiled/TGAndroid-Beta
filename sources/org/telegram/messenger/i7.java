package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class i7 implements Runnable {
    public final int f20563a;
    public final MediaDataController.KeywordResultCallback f20564b;
    public final ArrayList f20565c;
    public final String d;

    public i7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i9) {
        this.f20563a = i9;
        this.f20564b = keywordResultCallback;
        this.f20565c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f20563a) {
            case 0:
                this.f20564b.run(this.f20565c, this.d);
                return;
            default:
                this.f20564b.run(this.f20565c, this.d);
                return;
        }
    }
}
