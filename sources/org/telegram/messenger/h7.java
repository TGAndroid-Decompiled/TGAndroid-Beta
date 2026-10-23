package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class h7 implements Runnable {
    public final int f18581a;
    public final MediaDataController.KeywordResultCallback f18582b;
    public final ArrayList f18583c;
    public final String d;

    public h7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18581a = i10;
        this.f18582b = keywordResultCallback;
        this.f18583c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18581a) {
            case 0:
                this.f18582b.run(this.f18583c, this.d);
                return;
            default:
                this.f18582b.run(this.f18583c, this.d);
                return;
        }
    }
}
