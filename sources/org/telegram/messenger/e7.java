package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class e7 implements Runnable {
    public final int f16840a;
    public final MediaDataController.KeywordResultCallback f16841b;
    public final ArrayList f16842c;
    public final String d;

    public e7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f16840a = i10;
        this.f16841b = keywordResultCallback;
        this.f16842c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16840a) {
            case 0:
                this.f16841b.run(this.f16842c, this.d);
                return;
            default:
                this.f16841b.run(this.f16842c, this.d);
                return;
        }
    }
}
