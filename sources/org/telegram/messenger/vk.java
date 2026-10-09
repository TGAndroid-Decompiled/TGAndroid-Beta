package org.telegram.messenger;

import java.util.ArrayList;
public final class vk implements Runnable {
    public final int f19511a;
    public final long f19512b;
    public final BaseController f19513c;
    public final Object d;

    public vk(BaseController baseController, Object obj, long j3, int i10) {
        this.f19511a = i10;
        this.f19513c = baseController;
        this.d = obj;
        this.f19512b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19511a) {
            case 0:
                ((TopicsController) this.f19513c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19512b);
                return;
            case 1:
                ((TranslateController) this.f19513c).lambda$setDialogTranslateTo$0(this.f19512b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19513c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19512b);
                return;
        }
    }

    public vk(TranslateController translateController, long j3, String str) {
        this.f19511a = 1;
        this.f19513c = translateController;
        this.f19512b = j3;
        this.d = str;
    }
}
