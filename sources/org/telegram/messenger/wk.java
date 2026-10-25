package org.telegram.messenger;

import java.util.ArrayList;
public final class wk implements Runnable {
    public final int f21780a;
    public final long f21781b;
    public final BaseController f21782c;
    public final Object d;

    public wk(BaseController baseController, Object obj, long j10, int i10) {
        this.f21780a = i10;
        this.f21782c = baseController;
        this.d = obj;
        this.f21781b = j10;
    }

    @Override
    public final void run() {
        switch (this.f21780a) {
            case 0:
                ((TopicsController) this.f21782c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f21781b);
                return;
            case 1:
                ((TranslateController) this.f21782c).lambda$setDialogTranslateTo$0(this.f21781b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f21782c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f21781b);
                return;
        }
    }

    public wk(TranslateController translateController, long j10, String str) {
        this.f21780a = 1;
        this.f21782c = translateController;
        this.f21781b = j10;
        this.d = str;
    }
}
