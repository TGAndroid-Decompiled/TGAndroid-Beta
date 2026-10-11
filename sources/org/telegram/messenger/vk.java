package org.telegram.messenger;

import java.util.ArrayList;
public final class vk implements Runnable {
    public final int f19512a;
    public final long f19513b;
    public final BaseController f19514c;
    public final Object d;

    public vk(BaseController baseController, Object obj, long j3, int i10) {
        this.f19512a = i10;
        this.f19514c = baseController;
        this.d = obj;
        this.f19513b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19512a) {
            case 0:
                ((TopicsController) this.f19514c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19513b);
                return;
            case 1:
                ((TranslateController) this.f19514c).lambda$setDialogTranslateTo$0(this.f19513b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19514c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19513b);
                return;
        }
    }

    public vk(TranslateController translateController, long j3, String str) {
        this.f19512a = 1;
        this.f19514c = translateController;
        this.f19513b = j3;
        this.d = str;
    }
}
