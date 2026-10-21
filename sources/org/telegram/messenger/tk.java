package org.telegram.messenger;

import java.util.ArrayList;
public final class tk implements Runnable {
    public final int f19616a;
    public final long f19617b;
    public final BaseController f19618c;
    public final Object d;

    public tk(BaseController baseController, Object obj, long j10, int i10) {
        this.f19616a = i10;
        this.f19618c = baseController;
        this.d = obj;
        this.f19617b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19616a) {
            case 0:
                ((TopicsController) this.f19618c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19617b);
                return;
            case 1:
                ((TranslateController) this.f19618c).lambda$setDialogTranslateTo$0(this.f19617b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19618c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19617b);
                return;
        }
    }

    public tk(TranslateController translateController, long j10, String str) {
        this.f19616a = 1;
        this.f19618c = translateController;
        this.f19617b = j10;
        this.d = str;
    }
}
