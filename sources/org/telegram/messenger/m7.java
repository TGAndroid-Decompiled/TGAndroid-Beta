package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class m7 implements Runnable {
    public final int f20928a;
    public final MediaDataController.KeywordResultCallback f20929b;
    public final ArrayList f20930c;
    public final String d;

    public m7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f20928a = i10;
        this.f20929b = keywordResultCallback;
        this.f20930c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f20928a) {
            case 0:
                this.f20929b.run(this.f20930c, this.d);
                return;
            default:
                this.f20929b.run(this.f20930c, this.d);
                return;
        }
    }
}
