package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class l7 implements Runnable {
    public final int f18243a;
    public final MediaDataController.KeywordResultCallback f18244b;
    public final ArrayList f18245c;
    public final String d;

    public l7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18243a = i10;
        this.f18244b = keywordResultCallback;
        this.f18245c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18243a) {
            case 0:
                this.f18244b.run(this.f18245c, this.d);
                return;
            default:
                this.f18244b.run(this.f18245c, this.d);
                return;
        }
    }
}
