package org.telegram.messenger;
public final class gl implements Runnable {
    public final int f20383a = 1;
    public final TranslateController f20384b;
    public final long f20385c;
    public final Object d;

    public gl(TranslateController translateController, long j10, String str) {
        this.f20384b = translateController;
        this.f20385c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f20383a) {
            case 0:
                long j10 = this.f20385c;
                this.f20384b.lambda$invalidateTranslation$9((MessageObject) this.d, j10);
                return;
            default:
                this.f20384b.lambda$setDialogTranslateTo$0(this.f20385c, (String) this.d);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f20384b = translateController;
        this.d = messageObject;
        this.f20385c = j10;
    }
}
