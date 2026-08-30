package org.telegram.messenger;
public final class kl implements Runnable {
    public final int f17716a = 1;
    public final TranslateController f17717b;
    public final long f17718c;
    public final Object d;

    public kl(TranslateController translateController, long j10, String str) {
        this.f17717b = translateController;
        this.f17718c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f17716a) {
            case 0:
                long j10 = this.f17718c;
                this.f17717b.lambda$invalidateTranslation$9((MessageObject) this.d, j10);
                return;
            default:
                this.f17717b.lambda$setDialogTranslateTo$0(this.f17718c, (String) this.d);
                return;
        }
    }

    public kl(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f17717b = translateController;
        this.d = messageObject;
        this.f17718c = j10;
    }
}
