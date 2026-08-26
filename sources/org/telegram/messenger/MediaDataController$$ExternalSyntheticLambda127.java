package org.telegram.messenger;

import java.util.ArrayList;

public final class MediaDataController$$ExternalSyntheticLambda127 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController.KeywordResultCallback f$0;
    public final ArrayList f$1;
    public final String f$2;

    public MediaDataController$$ExternalSyntheticLambda127(MediaDataController.KeywordResultCallback keywordResultCallback, ArrayList arrayList, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = keywordResultCallback;
        this.f$1 = arrayList;
        this.f$2 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(this.f$1, this.f$2);
                break;
            default:
                this.f$0.run(this.f$1, this.f$2);
                break;
        }
    }
}
