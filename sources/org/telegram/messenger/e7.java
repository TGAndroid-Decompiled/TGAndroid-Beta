package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class e7 implements Runnable {
    public final int f17143a;
    public final MediaDataController.KeywordResultCallback f17144b;
    public final ArrayList f17145c;
    public final String d;

    public e7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f17143a = i10;
        this.f17144b = keywordResultCallback;
        this.f17145c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17143a) {
            case 0:
                this.f17144b.run(this.f17145c, this.d);
                return;
            default:
                this.f17144b.run(this.f17145c, this.d);
                return;
        }
    }
}
