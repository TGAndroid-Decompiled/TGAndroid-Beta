package org.telegram.messenger;

import java.util.ArrayList;
public final class rk implements Runnable {
    public final int f19447a;
    public final long f19448b;
    public final BaseController f19449c;
    public final Object d;

    public rk(BaseController baseController, Object obj, long j10, int i10) {
        this.f19447a = i10;
        this.f19449c = baseController;
        this.d = obj;
        this.f19448b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19447a) {
            case 0:
                ((TopicsController) this.f19449c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19448b);
                return;
            case 1:
                ((TranslateController) this.f19449c).lambda$setDialogTranslateTo$0(this.f19448b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19449c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19448b);
                return;
        }
    }

    public rk(TranslateController translateController, long j10, String str) {
        this.f19447a = 1;
        this.f19449c = translateController;
        this.f19448b = j10;
        this.d = str;
    }
}
