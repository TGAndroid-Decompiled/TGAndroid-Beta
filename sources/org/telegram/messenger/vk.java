package org.telegram.messenger;

import java.util.ArrayList;
public final class vk implements Runnable {
    public final int f19835a;
    public final long f19836b;
    public final BaseController f19837c;
    public final Object d;

    public vk(BaseController baseController, Object obj, long j10, int i10) {
        this.f19835a = i10;
        this.f19837c = baseController;
        this.d = obj;
        this.f19836b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19835a) {
            case 0:
                ((TopicsController) this.f19837c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19836b);
                return;
            case 1:
                ((TranslateController) this.f19837c).lambda$setDialogTranslateTo$0(this.f19836b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19837c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19836b);
                return;
        }
    }

    public vk(TranslateController translateController, long j10, String str) {
        this.f19835a = 1;
        this.f19837c = translateController;
        this.f19836b = j10;
        this.d = str;
    }
}
