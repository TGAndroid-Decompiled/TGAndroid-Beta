package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class r7 implements Runnable {
    public final int f16203a;
    public final MediaDataController.KeywordResultCallback f16204b;
    public final ArrayList f16205c;
    public final String d;

    public r7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f16203a = i10;
        this.f16204b = keywordResultCallback;
        this.f16205c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16203a) {
            case 0:
                this.f16204b.run(this.f16205c, this.d);
                return;
            default:
                this.f16204b.run(this.f16205c, this.d);
                return;
        }
    }
}
