package org.telegram.messenger;

import java.util.ArrayList;
public final class vk implements Runnable {
    public final int f19548a;
    public final long f19549b;
    public final BaseController f19550c;
    public final Object d;

    public vk(BaseController baseController, Object obj, long j3, int i10) {
        this.f19548a = i10;
        this.f19550c = baseController;
        this.d = obj;
        this.f19549b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19548a) {
            case 0:
                ((TopicsController) this.f19550c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19549b);
                return;
            case 1:
                ((TranslateController) this.f19550c).lambda$setDialogTranslateTo$0(this.f19549b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19550c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19549b);
                return;
        }
    }

    public vk(TranslateController translateController, long j3, String str) {
        this.f19548a = 1;
        this.f19550c = translateController;
        this.f19549b = j3;
        this.d = str;
    }
}
