package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class j7 implements Runnable {
    public final int f20397a;
    public final MediaDataController.KeywordResultCallback f20398b;
    public final ArrayList f20399c;
    public final String d;

    public j7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f20397a = i10;
        this.f20398b = keywordResultCallback;
        this.f20399c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f20397a) {
            case 0:
                this.f20398b.run(this.f20399c, this.d);
                return;
            default:
                this.f20398b.run(this.f20399c, this.d);
                return;
        }
    }
}
