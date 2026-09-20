package org.telegram.messenger;
public final class gl implements Runnable {
    public final int f16489a = 0;
    public final TranslateController f16490b;
    public final long f16491c;
    public final Object d;

    public gl(TranslateController translateController, long j3, String str) {
        this.f16490b = translateController;
        this.f16491c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16489a) {
            case 0:
                this.f16490b.lambda$setDialogTranslateTo$0(this.f16491c, (String) this.d);
                return;
            default:
                long j3 = this.f16491c;
                this.f16490b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16490b = translateController;
        this.d = messageObject;
        this.f16491c = j3;
    }
}
