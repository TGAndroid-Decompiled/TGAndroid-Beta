package org.telegram.messenger;

import java.util.ArrayList;
public final class uk implements Runnable {
    public final int f19716a;
    public final long f19717b;
    public final BaseController f19718c;
    public final Object d;

    public uk(BaseController baseController, Object obj, long j10, int i10) {
        this.f19716a = i10;
        this.f19718c = baseController;
        this.d = obj;
        this.f19717b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19716a) {
            case 0:
                ((TopicsController) this.f19718c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19717b);
                return;
            case 1:
                ((TranslateController) this.f19718c).lambda$setDialogTranslateTo$0(this.f19717b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19718c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19717b);
                return;
        }
    }

    public uk(TranslateController translateController, long j10, String str) {
        this.f19716a = 1;
        this.f19718c = translateController;
        this.f19717b = j10;
        this.d = str;
    }
}
