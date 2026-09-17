package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class k7 implements Runnable {
    public final int f18163a;
    public final MediaDataController.KeywordResultCallback f18164b;
    public final ArrayList f18165c;
    public final String d;

    public k7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f18163a = i10;
        this.f18164b = keywordResultCallback;
        this.f18165c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f18163a) {
            case 0:
                this.f18164b.run(this.f18165c, this.d);
                return;
            default:
                this.f18164b.run(this.f18165c, this.d);
                return;
        }
    }
}
