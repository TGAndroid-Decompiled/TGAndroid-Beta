package org.telegram.messenger;

import java.util.ArrayList;
public final class sk implements Runnable {
    public final int f19528a;
    public final long f19529b;
    public final BaseController f19530c;
    public final Object d;

    public sk(BaseController baseController, Object obj, long j10, int i10) {
        this.f19528a = i10;
        this.f19530c = baseController;
        this.d = obj;
        this.f19529b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19528a) {
            case 0:
                ((TopicsController) this.f19530c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19529b);
                return;
            case 1:
                ((TranslateController) this.f19530c).lambda$setDialogTranslateTo$0(this.f19529b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19530c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19529b);
                return;
        }
    }

    public sk(TranslateController translateController, long j10, String str) {
        this.f19528a = 1;
        this.f19530c = translateController;
        this.f19529b = j10;
        this.d = str;
    }
}
