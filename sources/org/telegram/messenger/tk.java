package org.telegram.messenger;

import java.util.ArrayList;
public final class tk implements Runnable {
    public final int f19703a;
    public final long f19704b;
    public final BaseController f19705c;
    public final Object d;

    public tk(BaseController baseController, Object obj, long j10, int i10) {
        this.f19703a = i10;
        this.f19705c = baseController;
        this.d = obj;
        this.f19704b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19703a) {
            case 0:
                ((TopicsController) this.f19705c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19704b);
                return;
            case 1:
                ((TranslateController) this.f19705c).lambda$setDialogTranslateTo$0(this.f19704b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19705c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19704b);
                return;
        }
    }

    public tk(TranslateController translateController, long j10, String str) {
        this.f19703a = 1;
        this.f19705c = translateController;
        this.f19704b = j10;
        this.d = str;
    }
}
