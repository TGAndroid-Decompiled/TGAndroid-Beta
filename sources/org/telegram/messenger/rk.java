package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f19445a;
    public final long f19446b;
    public final BaseController f19447c;
    public final Object d;

    public rk(BaseController baseController, Object obj, long j10, int i10) {
        this.f19445a = i10;
        this.f19447c = baseController;
        this.d = obj;
        this.f19446b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19445a) {
            case 0:
                ((TopicsController) this.f19447c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19446b);
                return;
            case 1:
                ((TranslateController) this.f19447c).lambda$setDialogTranslateTo$0(this.f19446b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19447c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19446b);
                return;
        }
    }

    public rk(TranslateController translateController, long j10, String str) {
        this.f19445a = 1;
        this.f19447c = translateController;
        this.f19446b = j10;
        this.d = str;
    }
}
