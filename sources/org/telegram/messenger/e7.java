package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class e7 implements Runnable {
    public final int f17486a;
    public final MediaDataController.KeywordResultCallback f17487b;
    public final ArrayList f17488c;
    public final String d;

    public e7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f17486a = i10;
        this.f17487b = keywordResultCallback;
        this.f17488c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17486a) {
            case 0:
                this.f17487b.run(this.f17488c, this.d);
                return;
            default:
                this.f17487b.run(this.f17488c, this.d);
                return;
        }
    }
}
