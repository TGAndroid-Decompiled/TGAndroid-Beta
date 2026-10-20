package org.telegram.messenger;

import java.util.ArrayList;
public final class tk implements Runnable {
    public final int f19617a;
    public final long f19618b;
    public final BaseController f19619c;
    public final Object d;

    public tk(BaseController baseController, Object obj, long j10, int i10) {
        this.f19617a = i10;
        this.f19619c = baseController;
        this.d = obj;
        this.f19618b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19617a) {
            case 0:
                ((TopicsController) this.f19619c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19618b);
                return;
            case 1:
                ((TranslateController) this.f19619c).lambda$setDialogTranslateTo$0(this.f19618b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19619c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19618b);
                return;
        }
    }

    public tk(TranslateController translateController, long j10, String str) {
        this.f19617a = 1;
        this.f19619c = translateController;
        this.f19618b = j10;
        this.d = str;
    }
}
