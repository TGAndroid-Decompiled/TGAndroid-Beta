package org.telegram.messenger;
public final class il implements Runnable {
    public final int f17508a = 0;
    public final TranslateController f17509b;
    public final long f17510c;
    public final Object d;

    public il(TranslateController translateController, long j10, String str) {
        this.f17509b = translateController;
        this.f17510c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17508a) {
            case 0:
                this.f17509b.lambda$setDialogTranslateTo$0(this.f17510c, (String) this.d);
                return;
            default:
                long j10 = this.f17510c;
                this.f17509b.lambda$invalidateTranslation$9((MessageObject) this.d, j10);
                return;
        }
    }

    public il(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f17509b = translateController;
        this.d = messageObject;
        this.f17510c = j10;
    }
}
