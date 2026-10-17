package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class d7 implements Runnable {
    public final int f18156a;
    public final MediaDataController.KeywordResultCallback f18157b;
    public final ArrayList f18158c;
    public final String d;

    public d7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18156a = i10;
        this.f18157b = keywordResultCallback;
        this.f18158c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18156a) {
            case 0:
                this.f18157b.run(this.f18158c, this.d);
                return;
            default:
                this.f18157b.run(this.f18158c, this.d);
                return;
        }
    }
}
