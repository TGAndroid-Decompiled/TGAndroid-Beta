package org.telegram.messenger;
public final class fl implements Runnable {
    public final int f17753a = 0;
    public final TranslateController f17754b;
    public final long f17755c;
    public final Object d;

    public fl(TranslateController translateController, long j3, String str) {
        this.f17754b = translateController;
        this.f17755c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17753a) {
            case 0:
                this.f17754b.lambda$setDialogTranslateTo$0(this.f17755c, (String) this.d);
                return;
            default:
                long j3 = this.f17755c;
                this.f17754b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public fl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f17754b = translateController;
        this.d = messageObject;
        this.f17755c = j3;
    }
}
