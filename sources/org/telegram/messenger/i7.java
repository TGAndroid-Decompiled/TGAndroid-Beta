package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class i7 implements Runnable {
    public final int f18587a;
    public final MediaDataController.KeywordResultCallback f18588b;
    public final ArrayList f18589c;
    public final String d;

    public i7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18587a = i10;
        this.f18588b = keywordResultCallback;
        this.f18589c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18587a) {
            case 0:
                this.f18588b.run(this.f18589c, this.d);
                return;
            default:
                this.f18588b.run(this.f18589c, this.d);
                return;
        }
    }
}
