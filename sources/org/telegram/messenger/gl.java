package org.telegram.messenger;
public final class gl implements Runnable {
    public final int f16269a = 0;
    public final TranslateController f16270b;
    public final long f16271c;
    public final Object d;

    public gl(TranslateController translateController, long j3, String str) {
        this.f16270b = translateController;
        this.f16271c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16269a) {
            case 0:
                this.f16270b.lambda$setDialogTranslateTo$0(this.f16271c, (String) this.d);
                return;
            default:
                long j3 = this.f16271c;
                this.f16270b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public gl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16270b = translateController;
        this.d = messageObject;
        this.f16271c = j3;
    }
}
