package org.telegram.messenger;

import java.util.ArrayList;
public final class uk implements Runnable {
    public final int f19779a;
    public final long f19780b;
    public final BaseController f19781c;
    public final Object d;

    public uk(BaseController baseController, Object obj, long j10, int i10) {
        this.f19779a = i10;
        this.f19781c = baseController;
        this.d = obj;
        this.f19780b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19779a) {
            case 0:
                ((TopicsController) this.f19781c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19780b);
                return;
            case 1:
                ((TranslateController) this.f19781c).lambda$setDialogTranslateTo$0(this.f19780b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19781c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19780b);
                return;
        }
    }

    public uk(TranslateController translateController, long j10, String str) {
        this.f19779a = 1;
        this.f19781c = translateController;
        this.f19780b = j10;
        this.d = str;
    }
}
