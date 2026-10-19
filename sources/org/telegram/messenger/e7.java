package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class e7 implements Runnable {
    public final int f18244a;
    public final MediaDataController.KeywordResultCallback f18245b;
    public final ArrayList f18246c;
    public final String d;

    public e7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18244a = i10;
        this.f18245b = keywordResultCallback;
        this.f18246c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18244a) {
            case 0:
                this.f18245b.run(this.f18246c, this.d);
                return;
            default:
                this.f18245b.run(this.f18246c, this.d);
                return;
        }
    }
}
