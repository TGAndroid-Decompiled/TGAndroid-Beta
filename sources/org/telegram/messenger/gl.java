package org.telegram.messenger;
public final class gl implements Runnable {
    public final int f17840a = 0;
    public final TranslateController f17841b;
    public final long f17842c;
    public final Object d;

    public gl(TranslateController translateController, long j3, String str) {
        this.f17841b = translateController;
        this.f17842c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17840a) {
            case 0:
                this.f17841b.lambda$setDialogTranslateTo$0(this.f17842c, (String) this.d);
                return;
            default:
                long j3 = this.f17842c;
                this.f17841b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f17841b = translateController;
        this.d = messageObject;
        this.f17842c = j3;
    }
}
