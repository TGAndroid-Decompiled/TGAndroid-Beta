package org.telegram.messenger;

import java.util.ArrayList;
public final class vk implements Runnable {
    public final int f19515a;
    public final long f19516b;
    public final BaseController f19517c;
    public final Object d;

    public vk(BaseController baseController, Object obj, long j3, int i10) {
        this.f19515a = i10;
        this.f19517c = baseController;
        this.d = obj;
        this.f19516b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19515a) {
            case 0:
                ((TopicsController) this.f19517c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19516b);
                return;
            case 1:
                ((TranslateController) this.f19517c).lambda$setDialogTranslateTo$0(this.f19516b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19517c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19516b);
                return;
        }
    }

    public vk(TranslateController translateController, long j3, String str) {
        this.f19515a = 1;
        this.f19517c = translateController;
        this.f19516b = j3;
        this.d = str;
    }
}
