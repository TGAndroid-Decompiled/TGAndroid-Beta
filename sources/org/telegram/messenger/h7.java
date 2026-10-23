package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class h7 implements Runnable {
    public final int f18515a;
    public final MediaDataController.KeywordResultCallback f18516b;
    public final ArrayList f18517c;
    public final String d;

    public h7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18515a = i10;
        this.f18516b = keywordResultCallback;
        this.f18517c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18515a) {
            case 0:
                this.f18516b.run(this.f18517c, this.d);
                return;
            default:
                this.f18516b.run(this.f18517c, this.d);
                return;
        }
    }
}
