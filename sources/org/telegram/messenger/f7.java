package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class f7 implements Runnable {
    public final int f18333a;
    public final MediaDataController.KeywordResultCallback f18334b;
    public final ArrayList f18335c;
    public final String d;

    public f7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18333a = i10;
        this.f18334b = keywordResultCallback;
        this.f18335c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18333a) {
            case 0:
                this.f18334b.run(this.f18335c, this.d);
                return;
            default:
                this.f18334b.run(this.f18335c, this.d);
                return;
        }
    }
}
