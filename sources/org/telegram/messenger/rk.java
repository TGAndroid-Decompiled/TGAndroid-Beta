package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f19448a;
    public final long f19449b;
    public final BaseController f19450c;
    public final Object d;

    public rk(BaseController baseController, Object obj, long j10, int i10) {
        this.f19448a = i10;
        this.f19450c = baseController;
        this.d = obj;
        this.f19449b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19448a) {
            case 0:
                ((TopicsController) this.f19450c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19449b);
                return;
            case 1:
                ((TranslateController) this.f19450c).lambda$setDialogTranslateTo$0(this.f19449b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19450c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19449b);
                return;
        }
    }

    public rk(TranslateController translateController, long j10, String str) {
        this.f19448a = 1;
        this.f19450c = translateController;
        this.f19449b = j10;
        this.d = str;
    }
}
