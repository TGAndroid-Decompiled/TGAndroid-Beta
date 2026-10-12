package org.telegram.messenger;

import java.util.ArrayList;
public final class bl implements Runnable {
    public final int f17209a;
    public final long f17210b;
    public final BaseController f17211c;
    public final Object d;

    public bl(BaseController baseController, Object obj, long j3, int i10) {
        this.f17209a = i10;
        this.f17211c = baseController;
        this.d = obj;
        this.f17210b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17209a) {
            case 0:
                ((TopicsController) this.f17211c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f17210b);
                return;
            case 1:
                ((TranslateController) this.f17211c).lambda$setDialogTranslateTo$0(this.f17210b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f17211c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f17210b);
                return;
        }
    }

    public bl(TranslateController translateController, long j3, String str) {
        this.f17209a = 1;
        this.f17211c = translateController;
        this.f17210b = j3;
        this.d = str;
    }
}
