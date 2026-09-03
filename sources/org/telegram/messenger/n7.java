package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class n7 implements Runnable {
    public final int f19439a;
    public final MediaDataController.KeywordResultCallback f19440b;
    public final ArrayList f19441c;
    public final String d;

    public n7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f19439a = i10;
        this.f19440b = keywordResultCallback;
        this.f19441c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19439a) {
            case 0:
                this.f19440b.run(this.f19441c, this.d);
                return;
            default:
                this.f19440b.run(this.f19441c, this.d);
                return;
        }
    }
}
