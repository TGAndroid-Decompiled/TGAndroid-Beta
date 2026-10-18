package org.telegram.messenger;

import java.util.ArrayList;
public final class sk implements Runnable {
    public final int f19525a;
    public final long f19526b;
    public final BaseController f19527c;
    public final Object d;

    public sk(BaseController baseController, Object obj, long j10, int i10) {
        this.f19525a = i10;
        this.f19527c = baseController;
        this.d = obj;
        this.f19526b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19525a) {
            case 0:
                ((TopicsController) this.f19527c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19526b);
                return;
            case 1:
                ((TranslateController) this.f19527c).lambda$setDialogTranslateTo$0(this.f19526b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19527c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19526b);
                return;
        }
    }

    public sk(TranslateController translateController, long j10, String str) {
        this.f19525a = 1;
        this.f19527c = translateController;
        this.f19526b = j10;
        this.d = str;
    }
}
