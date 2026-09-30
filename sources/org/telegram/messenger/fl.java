package org.telegram.messenger;
public final class fl implements Runnable {
    public final int f16417a = 0;
    public final TranslateController f16418b;
    public final long f16419c;
    public final Object d;

    public fl(TranslateController translateController, long j3, String str) {
        this.f16418b = translateController;
        this.f16419c = j3;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16417a) {
            case 0:
                this.f16418b.lambda$setDialogTranslateTo$0(this.f16419c, (String) this.d);
                return;
            default:
                long j3 = this.f16419c;
                this.f16418b.lambda$invalidateTranslation$9((MessageObject) this.d, j3);
                return;
        }
    }

    public fl(TranslateController translateController, MessageObject messageObject, long j3) {
        this.f16418b = translateController;
        this.d = messageObject;
        this.f16419c = j3;
    }
}
