package org.telegram.messenger;
public final class gl implements Runnable {
    public final int f16278a = 0;
    public final TranslateController f16279b;
    public final long f16280c;
    public final Object d;

    public gl(TranslateController translateController, long j3, String str) {
        this.f16279b = translateController;
        this.f16280c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16278a) {
            case 0:
                this.f16279b.lambda$setDialogTranslateTo$0(this.f16280c, (String) this.d);
                return;
            default:
                long j3 = this.f16280c;
                this.f16279b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16279b = translateController;
        this.d = messageObject;
        this.f16280c = j3;
    }
}
