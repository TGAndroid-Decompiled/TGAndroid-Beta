package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class n7 implements Runnable {
    public final int f17887a;
    public final MediaDataController.KeywordResultCallback f17888b;
    public final ArrayList f17889c;
    public final String d;

    public n7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f17887a = i10;
        this.f17888b = keywordResultCallback;
        this.f17889c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17887a) {
            case 0:
                this.f17888b.run(this.f17889c, this.d);
                return;
            default:
                this.f17888b.run(this.f17889c, this.d);
                return;
        }
    }
}
