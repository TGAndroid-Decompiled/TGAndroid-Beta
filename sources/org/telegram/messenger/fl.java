package org.telegram.messenger;
public final class fl implements Runnable {
    public final int f17726a = 0;
    public final TranslateController f17727b;
    public final long f17728c;
    public final Object d;

    public fl(TranslateController translateController, long j3, String str) {
        this.f17727b = translateController;
        this.f17728c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17726a) {
            case 0:
                this.f17727b.lambda$setDialogTranslateTo$0(this.f17728c, (String) this.d);
                return;
            default:
                long j3 = this.f17728c;
                this.f17727b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public fl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f17727b = translateController;
        this.d = messageObject;
        this.f17728c = j3;
    }
}
