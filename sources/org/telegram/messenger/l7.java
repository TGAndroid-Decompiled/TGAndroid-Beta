package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
public final class l7 implements Runnable {
    public final int f16881a;
    public final MediaDataController.KeywordResultCallback f16882b;
    public final ArrayList f16883c;
    public final String d;

    public l7(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i10) {
        this.f16881a = i10;
        this.f16882b = keywordResultCallback;
        this.f16883c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16881a) {
            case 0:
                this.f16882b.run(this.f16883c, this.d);
                return;
            default:
                this.f16882b.run(this.f16883c, this.d);
                return;
        }
    }
}
