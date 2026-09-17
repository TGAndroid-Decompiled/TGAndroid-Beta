package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class k7 implements Runnable {
    public final int f18190a;
    public final MediaDataController.KeywordResultCallback f18191b;
    public final ArrayList f18192c;
    public final String d;

    public k7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18190a = i10;
        this.f18191b = keywordResultCallback;
        this.f18192c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18190a) {
            case 0:
                this.f18191b.run(this.f18192c, this.d);
                return;
            default:
                this.f18191b.run(this.f18192c, this.d);
                return;
        }
    }
}
