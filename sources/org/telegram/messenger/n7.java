package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class n7 implements Runnable {
    public final int f19437a;
    public final MediaDataController.KeywordResultCallback f19438b;
    public final ArrayList f19439c;
    public final String d;

    public n7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f19437a = i10;
        this.f19438b = keywordResultCallback;
        this.f19439c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f19437a) {
            case 0:
                this.f19438b.run(this.f19439c, this.d);
                return;
            default:
                this.f19438b.run(this.f19439c, this.d);
                return;
        }
    }
}
