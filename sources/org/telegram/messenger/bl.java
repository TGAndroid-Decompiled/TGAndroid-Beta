package org.telegram.messenger;

import java.util.ArrayList;
public final class bl implements Runnable {
    public final int f17210a;
    public final long f17211b;
    public final BaseController f17212c;
    public final Object d;

    public bl(BaseController baseController, Object obj, long j3, int i10) {
        this.f17210a = i10;
        this.f17212c = baseController;
        this.d = obj;
        this.f17211b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17210a) {
            case 0:
                ((TopicsController) this.f17212c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f17211b);
                return;
            case 1:
                ((TranslateController) this.f17212c).lambda$setDialogTranslateTo$0(this.f17211b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f17212c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f17211b);
                return;
        }
    }

    public bl(TranslateController translateController, long j3, String str) {
        this.f17210a = 1;
        this.f17212c = translateController;
        this.f17211b = j3;
        this.d = str;
    }
}
