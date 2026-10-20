package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class f7 implements Runnable {
    public final int f18336a;
    public final MediaDataController.KeywordResultCallback f18337b;
    public final ArrayList f18338c;
    public final String d;

    public f7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18336a = i10;
        this.f18337b = keywordResultCallback;
        this.f18338c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18336a) {
            case 0:
                this.f18337b.run(this.f18338c, this.d);
                return;
            default:
                this.f18337b.run(this.f18338c, this.d);
                return;
        }
    }
}
