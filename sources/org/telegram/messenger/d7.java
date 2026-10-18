package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class d7 implements Runnable {
    public final int f18166a;
    public final MediaDataController.KeywordResultCallback f18167b;
    public final ArrayList f18168c;
    public final String d;

    public d7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18166a = i10;
        this.f18167b = keywordResultCallback;
        this.f18168c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18166a) {
            case 0:
                this.f18167b.run(this.f18168c, this.d);
                return;
            default:
                this.f18167b.run(this.f18168c, this.d);
                return;
        }
    }
}
