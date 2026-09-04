package org.telegram.messenger;
public final class gl implements Runnable {
    public final int f17813a = 0;
    public final TranslateController f17814b;
    public final long f17815c;
    public final Object d;

    public gl(TranslateController translateController, long j3, String str) {
        this.f17814b = translateController;
        this.f17815c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17813a) {
            case 0:
                this.f17814b.lambda$setDialogTranslateTo$0(this.f17815c, (String) this.d);
                return;
            default:
                long j3 = this.f17815c;
                this.f17814b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f17814b = translateController;
        this.d = messageObject;
        this.f17815c = j3;
    }
}
