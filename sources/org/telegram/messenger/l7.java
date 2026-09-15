package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class l7 implements Runnable {
    public final int f16649a;
    public final MediaDataController.KeywordResultCallback f16650b;
    public final ArrayList f16651c;
    public final String d;

    public l7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f16649a = i10;
        this.f16650b = keywordResultCallback;
        this.f16651c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16649a) {
            case 0:
                this.f16650b.run(this.f16651c, this.d);
                return;
            default:
                this.f16650b.run(this.f16651c, this.d);
                return;
        }
    }
}
